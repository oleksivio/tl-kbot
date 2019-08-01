plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    gradlePluginPortal()
}

dependencies{
    compile("org.jetbrains.dokka:dokka-gradle-plugin:0.9.18")
    compileOnly(gradleKotlinDsl())
    compile("nebula.maven-publish:nebula.maven-publish.gradle.plugin:13.0.0")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
