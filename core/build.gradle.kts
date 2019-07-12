import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin(module="reflect", version="1.3.41"))

    implementation(project(":server-api"))

    implementation("org.slf4j:slf4j-api:1.7.26")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

