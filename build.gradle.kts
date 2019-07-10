import io.github.oleksivio.commitlint.checker.CommitCheckerType
import io.github.oleksivio.commitlint.checker.Commitlint
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// get properties from 'gradle.properties' file
val uploadUsernameProp: String? by project
val uploadPasswordProp: String? by project
val releaseBuild: String? by project

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
    val kotlinVersion = "1.3.41"
    kotlin("jvm") version (kotlinVersion)
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("nebula.maven-publish") version "10.0.1"
    id("nebula.javadoc-jar") version "10.0.1"
    id("nebula.source-jar") version "10.0.1"
    id("nebula.release") version "10.0.1"
    signing
    id("org.jetbrains.dokka") version "0.9.18"
    id("io.github.oleksivio.commitlint") version "0.14.0"
}

dependencies {
    // jackson kotlin 
    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    // Spring dependencies

    compileOnly("org.springframework:spring-core:5.1.5.RELEASE")
    compileOnly("org.springframework:spring-context:5.1.5.RELEASE")
    compileOnly("org.springframework:spring-beans:5.1.5.RELEASE")
    compileOnly("org.springframework:spring-web:5.1.5.RELEASE")
    implementation(project(":server-api"))

    implementation("org.slf4j:slf4j-api:1.7.26")

}

publishing {
    publications {
        getByName<MavenPublication>("nebula") {
            pom {
                setDescription("Kotlin spring telegram bot api library")

                name.set("Kotlin Telegram Bot Api")
                url.set("https://github.com/oleksivio/telegram-bot-api")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/oleksivio/telegram-bot-api.git")
                    developerConnection.set("scm:git:ssh://github.com/oleksivio/telegram-bot-api.git")
                    url.set("http://github.com/oleksivio/telegram-bot-api/")
                }
                developers {
                    developer {
                        id.set("oleksivio")
                        name.set("Ilia Oleksiv")
                        email.set("ilia.oleksiv@gmail.com")
                    }
                }

            }
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

            val releasesRepoUrl = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2")
            val snapshotsRepoUrl = uri("https://oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
        }
    }
}

val archivesBaseName = "telegram-bot-api"
group = "io.github.oleksivio"

signing {
    isRequired = releaseBuild?.toBoolean() ?: false
    sign(publishing.publications["nebula"])
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}


tasks.withType<Commitlint>{
    checkType = CommitCheckerType.MIXED
}

tasks.withType<DokkaTask> {
    outputFormat = "gfm"
    outputDirectory = "$buildDir/../doc"

    includes = listOf("doc/packages.md", "doc/home.md")

    packageOptions {
        prefix = "io.github.oleksivio.telegram.bot.core"
        suppress = true
    }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "11"
    freeCompilerArgs = listOf("-Xjsr305=strict")
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "11"
}
