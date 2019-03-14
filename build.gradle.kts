import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// get properties from 'gradle.properties' file
val uploadUsernameProp: String? by project
val uploadPasswordProp: String? by project

// get properties from env
val uploadUsernameEnv: String? = System.getenv("CI_NEXUS_USERNAME")

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
    id("org.springframework.boot") version "2.1.2.RELEASE"
    kotlin("jvm") version (kotlinVersion)
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
    `maven-publish`
    signing
}


dependencies {

    // jackson kotlin 
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")
    implementation(kotlin("stdlib-jdk8"))
    // Spring dependencies

    implementation("org.springframework:spring-core")
    implementation("org.springframework:spring-context")
    implementation("org.springframework:spring-beans")
    implementation("org.springframework:spring-web")


    implementation("org.slf4j:jcl-over-slf4j:1.7.12")

    implementation("ch.qos.logback:logback-classic:1.2.3")
}


tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allJava)
}

tasks.register<Jar>("javadocJar") {
    archiveClassifier.set("javadoc")
    from(tasks.javadoc.get().destinationDir)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifact(tasks["bootJar"])
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
version = "0.9.2"

signing {
    sign(publishing.publications["mavenJava"])
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
