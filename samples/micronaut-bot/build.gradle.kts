import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm")
    id("nebula.javadoc-jar")
    id("nebula.source-jar")

    base

    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.allopen")

    id("io.spring.dependency-management") version "1.0.8.RELEASE"

    id("com.github.johnrengelman.shadow") version "5.1.0"

    application
}

val versionInfo: VersionInfo by rootProject.loadVersionInfo()

val developmentOnly: Configuration by configurations.creating

dependencyManagement {
    imports {
        mavenBom("io.micronaut:micronaut-bom:1.1.4")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    // library dependencies
    api(project(":core"))
    api(project(":server-api"))
    api(project(":micronaut"))
    // logger api
    implementation("org.slf4j:slf4j-api:${versionInfo.sl4jVersion}")
    // Micronaut dependencies
    compile("io.micronaut:micronaut-runtime")
    compile("io.micronaut:micronaut-inject")
    compile("io.micronaut:micronaut-http-client")
    compile("io.micronaut:micronaut-http-server-netty")
    kapt("io.micronaut:micronaut-inject-java")
    kapt("io.micronaut:micronaut-validation")

    runtime("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.8")

    runtime("ch.qos.logback:logback-classic:1.2.3")
}

allOpen {
    annotation("io.micronaut.aop.Around")
}

tasks.withType<ShadowJar> {
    mergeServiceFiles()
}

application {
    mainClassName = "io.github.oleksivio.tl.kbot.samples.micronaut.Application"
}


allOpen {
    annotation("io.micronaut.aop.Around")
}

val run by tasks.getting(JavaExec::class)
run.classpath += developmentOnly
run.jvmArgs("-noverify", "-XX:TieredStopAtLevel=1", "-Dcom.sun.management.jmxremote")
