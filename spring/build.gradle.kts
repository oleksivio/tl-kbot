import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    val kotlinVersion = "1.3.41"
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("nebula.maven-publish") version "10.0.1"
    id("nebula.javadoc-jar") version "10.0.1"
    id("nebula.source-jar") version "10.0.1"
    signing
}

val uploadUsernameProp: String? by project
val uploadPasswordProp: String? by project
val releaseBuild: String? by project

repositories {
    mavenCentral()
}


dependencies {
    implementation(kotlin("stdlib-jdk8"))
    // Spring dependencies
    val springVersion = "5.1.5.RELEASE"
    compileOnly("org.springframework:spring-core:$springVersion")
    compileOnly("org.springframework:spring-context:$springVersion")
    compileOnly("org.springframework:spring-beans:$springVersion")
    compileOnly("org.springframework:spring-web:$springVersion")
    implementation(project(":core"))
    implementation(project(":server-api"))

    implementation("org.slf4j:slf4j-api:1.7.26")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}


signing {
    isRequired = releaseBuild?.toBoolean() ?: false
    sign(publishing.publications["nebula"])
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
