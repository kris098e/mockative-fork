plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
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
                implementation(project(":mockative"))
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
        getByName("commonTest") {
            dependencies {
                implementation(kotlin("reflect"))
            }
        }
    }}

dependencies {
    configurations
        .filter { it.name.startsWith("ksp") && it.name.contains("Test") }
        .forEach {
            add(it.name, project(":mockative-processor"))
        }
}
