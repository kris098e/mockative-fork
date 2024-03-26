plugins {
    kotlin("jvm")
    kotlin("plugin.allopen")
}

allOpen {
    annotation("compare.frameworks.annotations.MockativeMockable")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}