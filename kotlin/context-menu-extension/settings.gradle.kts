pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "docker-compose") {
                useModule("com.avast.gradle:gradle-docker-compose-plugin:0.16.11")
            }
        }
    }
}

rootProject.name = "context-menu-extension"
