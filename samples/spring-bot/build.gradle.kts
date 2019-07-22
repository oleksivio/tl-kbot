plugins {
    kotlin("jvm")
    id("nebula.javadoc-jar")
    id("nebula.source-jar")

    val kotlinVersion = "1.3.41"
    id("org.springframework.boot") version "2.1.6.RELEASE"
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
    id("io.spring.dependency-management") version "1.0.8.RELEASE"

    application
}

dependencies {
    implementation(project(":spring"))

    implementation(kotlin("stdlib-jdk8"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("com.h2database:h2")
}

application {
    mainClassName = "io.github.oleksivio.tl.kbot.samples.spring.Application"
}
