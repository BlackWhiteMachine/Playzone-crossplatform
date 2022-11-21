plugins {
    id("multiplatform-setup")
    id("android-setup")
    kotlin("native.cocoapods")
}

version = "0.0.1"

kotlin {
    cocoapods {
        summary = "PlayZone iOS SDK"
        homepage = "https://google.com"
        ios.deploymentTarget = "14.0"

        framework {
            transitiveExport = false
            baseName = "SharedSDK"
            export(project(":common:core"))
            export(project(":common:games:api"))
            export(project(":common:games:impl"))
            export(project(":common:root-core"))
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))
                implementation(project(":common:games:api"))
                implementation(project(":common:games:impl"))
                implementation(project(":common:root-core"))
            }
        }

        iosMain {
            dependencies {
                api(project(":common:core"))
                api(project(":common:games:api"))
                api(project(":common:games:impl"))
                api(project(":common:root-core"))
            }
        }
    }
}