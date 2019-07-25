plugins {
    kotlin("jvm")
    id("nebula.javadoc-jar")
    id("nebula.source-jar")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.9")
    implementation(kotlin("reflect"))
}
