import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URL

fun Project.dokkaDependency(project: Project) {
    val projectName = project.name.replace(":", "")
    tasks.withType<DokkaTask> {
        externalDocumentationLink {
            url = URL("file://${project(":$projectName").buildDir}/dokka/$projectName/")
            packageListUrl = URL(url, "package-list")
        }

        dependsOn(project.tasks.getByName("dokka"))
    }
}

