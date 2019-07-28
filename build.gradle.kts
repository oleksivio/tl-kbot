import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint") version "8.1.0"

    id("nebula.release") version "10.1.2"
    id("nebula.maven-publish") version ("10.0.1")
    signing

    base
}

group = "io.github.oleksivio.tl.kbot"

initVersionInfo { sl4jVersion = "1.7.26" }

/**
 * disable publish task in root project
 */
tasks {
    withType<PublishToMavenLocal> {
        enabled = false
    }
    withType<PublishToMavenRepository> {
        enabled = false
    }
}

allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}

/**
 * Configuration for publish library
 */
val publishConfiguration: (Project).(
    artifactName: String,
    artifactDescription: String
) -> Unit = { artifactName, artifactDescription ->

    apply(plugin = "nebula.maven-publish")
    apply(plugin = "signing")

    val uploadUsernameProp: String? by project
    val uploadPasswordProp: String? by project
    val releaseBuild: String? by project

    signing {
        isRequired = releaseBuild?.toBoolean() ?: false
        sign(publishing.publications["nebula"])
    }

    publishing {
        publications {
            getByName<MavenPublication>("nebula") {
                pom {

                    setDescription(artifactDescription)

                    groupId = "io.github.oleksivio.tl.kbot"
                    name.set(artifactName)
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
}

project(":server-api").publishConfiguration(
    "Telegram Kbot Server Api Module",
    "Telegram Kbot server api module. Contains telegram objects"
)
project(":core").publishConfiguration(
    "Telegram Kbot Core Module",
    "Telegram Kbot core module. Contains annotation processing"
)
project(":spring").publishConfiguration(
    "Telegram Kbot Spring Module",
    "Telegram Kbot spring module. Used to create bot with spring boot"
)
project(":micronaut").publishConfiguration(
    "Telegram Kbot Micronaut Module",
    "Telegram Kbot micronaut module. Used to create bot with micronaut"
)
