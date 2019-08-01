
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint") version "8.1.0"

    // documentation generator
    id("org.jetbrains.dokka")

    id("nebula.release") version "11.1.0"
    id("nebula.maven-publish")
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

    apply(plugin = "org.jetbrains.dokka")

    repositories {
        mavenCentral()
        jcenter()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}

tasks.withType<DokkaTask> {
    outputFormat = "gfm"
    outputDirectory = "$buildDir/doc"

    packageOptions {
        prefix = "io.github.oleksivio.tl.kbot"
        suppress = true
    }

    kotlinTasks {
        defaultKotlinTasks() + listOf(":server-api", ":core", ":spring", ":micronaut")
            .map { "$it:compileKotlin" }
    }
}

project(":server-api").publishingKbot {
    name = "Telegram Kbot Server Api Module"
    description = "Telegram Kbot server api module. Contains telegram objects"
}

project(":core").publishingKbot {
    name = "Telegram Kbot Core Module"
    description = "Telegram Kbot core module. Contains annotation processing"
}
project(":spring").publishingKbot {
    name = "Telegram Kbot Spring Module"
    description = "Telegram Kbot spring module. Used to create bot with spring boot"
}
project(":micronaut").publishingKbot {
    name = "Telegram Kbot Micronaut Module"
    description = "Telegram Kbot micronaut module. Used to create bot with micronaut"
}
