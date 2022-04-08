
pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }

    plugins {
        //kotlin("multiplatform") version "1.7.255-SNAPSHOT"
        //kotlin("android") version "1.7.255-SNAPSHOT"
        kotlin("multiplatform") version "1.6.20"
        //kotlin("multiplatform") version "1.6.10"
        //kotlin("multiplatform") version "1.7.0-dev-1920"

        kotlin("plugin.serialization") version "1.6.20"
    }

    // resolutionStrategy {
    //     eachPlugin {
    //         if (requested.id.id.startsWith("org.jetbrains.kotlin")) {
    //             useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    //         }
    //     }
    // }

    // resolutionStrategy {
    //     eachPlugin {
    //         if (requested.id.id.startsWith("com.android")) {
    //             useModule("com.android.tools.build:gradle:4.2.0")
    //         }
    //     }
    // }

}

rootProject.name = "hmpp-lib"

//include(":subproject")
//includeBuild("published")