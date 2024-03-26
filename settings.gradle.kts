pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("multiplatform") version "1.9.22" apply false
        kotlin("plugin.allopen") version "1.9.22" apply false

        id("com.google.devtools.ksp") version "1.9.22-1.0.16" apply false
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "mockative"

if (startParameter.projectProperties.containsKey("check_publication")) {
    include(":tools:check-publication")
} else {
    include(":shared")
    include(":mockative")
    include(":mockative-processor")
    include(":mockative-code-generator")
}
include("compare-mockKTests")
include("compare-mockativeTests")
include("compare-testClasses")
