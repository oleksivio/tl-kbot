import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

group = "io.github.oleksivio.tl.kbot"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
