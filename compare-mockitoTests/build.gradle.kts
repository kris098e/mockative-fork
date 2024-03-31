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
                implementation("org.mockito:mockito-core:5.11.0")
                implementation(project(":compare-testClasses"))
            }
        }
        named("jvmTest") {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }}}

tasks.named<Test>("jvmTest") {
    jvmArgs("-Xmx8g")
}
