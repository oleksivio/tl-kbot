import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    val kotlinVersion = "1.3.41"
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
}


repositories {
    mavenCentral()
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
    implementation(project(":core"))
    implementation(project(":server-api"))

    implementation("org.slf4j:slf4j-api:1.7.26")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

