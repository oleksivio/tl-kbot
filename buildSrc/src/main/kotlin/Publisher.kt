import org.gradle.api.NamedDomainObjectCollection
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByName
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.plugins.signing.SigningExtension
data class UploadParameters(
    val username: String?,
    val password: String?,
    val releaseBuild: Boolean
)

fun Project.loadUploadParameters(): UploadParameters {
    val uploadUsernameProp: String? by project
    val uploadPasswordProp: String? by project
    val releaseBuild: String? by project

    return UploadParameters(
        username = uploadUsernameProp,
        password = uploadPasswordProp,
        releaseBuild = releaseBuild?.toBoolean() ?: false
    )
}

inline fun <reified T : Any> NamedDomainObjectCollection<out Any>.getByName(name: String, configure: T.() -> Unit) =
    getByName<T>(name).also(configure)

fun Project.signingKbot(toPublish: Boolean) {

    val nebulaPublication = run {
        val nebulaPublishing = this.extensions.getByName("publishing") as PublishingExtension
        nebulaPublishing.publications.getByName("nebula")
    }

    SigningExtension(this).apply {
        isRequired = toPublish
        sign(nebulaPublication)
    }
}

data class ArtifactParameters(
    var name: String? = null,
    var description: String? = null
)

fun Project.publishingKbot(block: ArtifactParameters.() -> Unit) {
    val artifactParameters = ArtifactParameters().apply(block)

    apply(plugin = "nebula.maven-publish")
    apply(plugin = "signing")

    val uploadParams = this.loadUploadParameters()

    this.signingKbot(uploadParams.releaseBuild)
    
    val publishingExtension = this.extensions.getByType(PublishingExtension::class.java)
    
    publishingExtension.run {
        publications {
            getByName<MavenPublication>("nebula") {
                pom {

                    setDescription(artifactParameters.description)

                    groupId = "io.github.oleksivio.tl.kbot"
                    name.set(artifactParameters.name)
                    url.set("https://github.com/oleksivio/telegram-bot-api")

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/oleksivio/telegram-bot-api.git")
                        developerConnection.set("scm:git:ssh://github.com/oleksivio/telegram-bot-api.git")
                        url.set("http://github.com/oleksivio/telegram-bot-api/")
                    }
                    developers {
                        developer {
                            id.set("oleksivio")
                            name.set("Ilia Oleksiv")
                            email.set("ilia.oleksiv@gmail.com")
                        }
                    }
                }
            }
        }
        repositories {
            maven {
                credentials {
                    username = uploadParams.username
                    password = uploadParams.password

                    username ?: println("Upload USERNAME not set")
                    password ?: println("Upload PASSWORD not set")
                }

                val releasesRepoUrl = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2")
                val snapshotsRepoUrl = uri("https://oss.sonatype.org/content/repositories/snapshots/")
                url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            }
        }
    }
}

