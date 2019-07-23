include("server-api", "core", "spring", "micronaut", "samples:spring-bot", "samples:micronaut-bot")

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace?.startsWith("org.jetbrains.kotlin") == true) {
                useVersion("1.3.41")
            }
        }
    }
}
