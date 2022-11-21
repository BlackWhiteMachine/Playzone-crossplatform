pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "playzone-mobile"
include(":androidApp")
//include(":common:auth:api")
//include(":common:auth:impl")
//include(":common:tournaments:api")
//include(":common:tournaments:impl")
include(":common:games:api")
include(":common:games:impl")
include(":common:core")
include(":common:root-ios")
include(":common:root-compose")
include(":common:root-core")
