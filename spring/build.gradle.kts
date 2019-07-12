import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    val kotlinVersion = "1.3.41"
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
}


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

