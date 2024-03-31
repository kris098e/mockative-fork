import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.testing.logging.TestLogEvent
import java.util.concurrent.atomic.AtomicLong

plugins {
    kotlin("multiplatform")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
    jvm()

    sourceSets {
        named("commonTest") {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("io.mockk:mockk:1.13.10")
                implementation(project(":compare-testClasses"))
            }
        }
        named("jvmTest") {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }
    }}

tasks.named<Test>("jvmTest") {
    jvmArgs("-Xmx8g")
    //systemProperty("io.mockk.classdump.path", "mockaaaaaa")
}
