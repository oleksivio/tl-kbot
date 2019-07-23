plugins {
    kotlin("jvm")
    id("nebula.javadoc-jar")
    id("nebula.source-jar")

    base
    
    id("org.jetbrains.kotlin.kapt") 
    id("org.jetbrains.kotlin.plugin.allopen")
}

val versionInfo: VersionInfo by rootProject.loadVersionInfo()

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    // library dependencies
    api(project(":core"))
    api(project(":server-api"))
    // logger api
    implementation("org.slf4j:slf4j-api:${versionInfo.sl4jVersion}")
    // Micronaut dependencies
    compile("io.micronaut:micronaut-inject:1.1.4")
    compile("io.micronaut:micronaut-http-client:1.1.4")
    compileOnly("io.micronaut:micronaut-inject-java:1.1.4")
    kapt("io.micronaut:micronaut-inject-java:1.1.4")
}
