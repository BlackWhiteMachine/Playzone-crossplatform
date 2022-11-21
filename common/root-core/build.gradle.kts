plugins {
    id("multiplatform-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:core"))

                implementation(project(":common:games:impl"))

                implementation(Dependencies.Kodein.core)
            }
        }
    }
}