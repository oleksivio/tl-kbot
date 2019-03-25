import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// get properties from 'gradle.properties' file
val uploadUsernameProp: String? by project
val uploadPasswordProp: String? by project
val releaseBuild: Boolean? by project


repositories {
    mavenCentral()
    jcenter()
    maven {
        url = uri("http://repo.maven.apache.org/maven2")
    }
    maven {
        url = uri("https://repo.spring.io/milestone")
    }
}

plugins {
    val kotlinVersion = "1.3.21"
    kotlin("jvm") version (kotlinVersion)
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    `maven-publish`
    signing
}


dependencies {

    // jackson kotlin 
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    // Spring dependencies

    implementation("org.springframework:spring-core:5.1.5.RELEASE")
    implementation("org.springframework:spring-context:5.1.5.RELEASE")
    implementation("org.springframework:spring-beans:5.1.5.RELEASE")
    implementation("org.springframework:spring-web:5.1.5.RELEASE")
    
    implementation("org.slf4j:jcl-over-slf4j:1.7.12")

    implementation("ch.qos.logback:logback-classic:1.2.3")
}


tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

tasks.register<Jar>("javadocJar") {
    archiveClassifier.set("javadoc")
    from(tasks.javadoc.get().destinationDir)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifact(tasks["jar"])
            artifact(tasks["sourcesJar"])
            artifact(tasks["javadocJar"])
        }
    }
    repositories {
        maven {
            credentials {
                username = uploadUsernameProp
                password = uploadPasswordProp

                username ?: println("Upload USERNAME not set")
                password ?: println("Upload PASSWORD not set")
            }
            description = "Spring telegram bot api library"
            val releasesRepoUrl = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2")
            val snapshotsRepoUrl = uri("https://oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
        }
    }
}

val archivesBaseName = "telegram-bot-api"
group = "io.github.oleksivio"
version = "1.0.0"

signing {
    releaseBuild?.let {
        sign(publishing.publications["mavenJava"])
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = (JavaVersion.VERSION_1_8)
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs = listOf("-Xjsr305=strict")
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}