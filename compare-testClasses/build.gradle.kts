import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("plugin.allopen")
}

allOpen {
    //annotation("compare.frameworks.annotations.MockativeMockable")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
    jvm()

    js(IR) {
        browser()
        nodejs()
    }

    iosSimulatorArm64("ios") {
        binaries {
            framework {
                baseName = "compare-mockativeTests"
            }
        }
    }
}