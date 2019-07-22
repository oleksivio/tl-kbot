plugins {
    kotlin("jvm")
    val kotlinVersion = "1.3.41"
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
    id("nebula.javadoc-jar")
    id("nebula.source-jar")

    base
}

val versionInfo: VersionInfo by rootProject.loadVersionInfo()

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    // library dependencies
    api(project(":core"))
    api(project(":server-api"))
    // logger api
    implementation("org.slf4j:slf4j-api:${versionInfo.sl4jVersion}")
    // Spring dependencies
    val springVersion = "5.1.5.RELEASE"
    compileOnly("org.springframework:spring-core:$springVersion")
    compileOnly("org.springframework:spring-context:$springVersion")
    compileOnly("org.springframework:spring-beans:$springVersion")
    compileOnly("org.springframework:spring-web:$springVersion")
}
