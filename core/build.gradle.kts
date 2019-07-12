import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}


repositories {
    mavenCentral()
}

dependencies {
    // jackson kotlin 
    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    implementation(project(":server-api"))

    implementation("org.slf4j:slf4j-api:1.7.26")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

