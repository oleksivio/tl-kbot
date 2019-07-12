repositories {
    mavenCentral()
    jcenter()
}

plugins {
    val kotlinVersion = "1.3.41"
    kotlin("jvm") version (kotlinVersion)
    id("org.jlleitschuh.gradle.ktlint") version "8.1.0"
    id("nebula.release") version "10.1.2"
}

val archivesBaseName = "tl-kbot"

group = "io.github.oleksivio.tl.kbot"
