repositories {
    mavenCentral()
    jcenter()
}

plugins {
    val kotlinVersion = "1.3.41"
    kotlin("jvm") version (kotlinVersion)
}

val archivesBaseName = "tl-kbot"

group = "io.github.oleksivio"
