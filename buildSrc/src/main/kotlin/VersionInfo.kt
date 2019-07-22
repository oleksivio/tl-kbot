import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware

class VersionInfo(
    var sl4jVersion: String? = null
)

fun ExtensionAware.initVersionInfo(block: VersionInfo.() -> Unit) {
    val artifactInfo = VersionInfo().apply(block)
    extensions.extraProperties["versionInfo"] = artifactInfo
}

fun Project.loadVersionInfo(): Lazy<VersionInfo> {
    return lazy {
        extensions.extraProperties["versionInfo"] as VersionInfo
    }
}
