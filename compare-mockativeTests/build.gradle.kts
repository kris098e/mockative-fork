import org.gradle.internal.impldep.org.junit.platform.launcher.TestExecutionListener
import org.gradle.internal.impldep.org.junit.platform.launcher.TestPlan

plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")

    id("com.android.library")
}

group = "org.example"
version = "unspecified"


kotlin {
    jvmToolchain(17)
    jvm()
    js(IR) {
        browser {
            testTask {
                useMocha {
                    timeout = "90s"
                }
            }
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = "90s"
                }
            }
        }
    }

    androidTarget()

    iosSimulatorArm64("ios") {
        binaries {
            framework {
                baseName = "compare-mockativeTests"
            }
        }
    }


    sourceSets {
        named("commonTest") {
            dependencies {
                implementation("io.mockative:mockative:2.1.0")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation(project(":compare-testClasses"))
            }
        }
        named("jvmTest") {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }
        named("iosTest") {
            dependencies {
                implementation("io.mockative:mockative:2.1.0")
            }
            kotlin.srcDir(File(buildDir, "generated/ksp/ios/iosTest/kotlin"))
        }

        val androidUnitTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }

        named("jsTest") {
            dependencies {
                implementation(kotlin("test-js"))
            }

        }
    }}

@Suppress("UnstableApiUsage")
android {
    compileSdk = 33
    namespace = "io.mockative"

//    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        testInstrumentationRunnerArguments["clearPackageData"] = "true"

        testOptions {
            execution = "ANDROIDX_TEST_ORCHESTRATOR"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    dependencies {
        androidTestImplementation("androidx.test:runner:1.5.2")
        androidTestUtil("androidx.test:orchestrator:1.4.2")
    }
}

tasks.named<Test>("jvmTest") {
    jvmArgs("-Xmx8g")
}

dependencies {
    configurations
        .filter { it.name.startsWith("ksp") && it.name.contains("Test") }
        .forEach {
            add(it.name, "io.mockative:mockative-processor:2.1.0")
        }
}

class TestMemoryListener : TestExecutionListener {
    override fun testPlanExecutionFinished(testPlan: TestPlan?) {
        val runtime = Runtime.getRuntime()
        val usedMemoryInMB = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024
        val maxMemoryInMB = runtime.maxMemory() / 1024 / 1024
        println("Used Memory: $usedMemoryInMB MB")
        println("Max Memory: $maxMemoryInMB MB")
    }
}