plugins {
    id(Plugins.androidApplication)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.androidExtensions)
    kotlin(Plugins.Kotlin.kapt)
}

android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.2"

    defaultConfig {
        applicationId = "com.example.pg_migrategroovytokotlindsl"
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.stdLib)
    implementation(Dependencies.Kotlin.ktxCore)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.constraintLayout)
    testImplementation(Dependencies.Tests.Framework.junit)
    testImplementation(Dependencies.Tests.UI.androidx_junit)
    testImplementation(Dependencies.Tests.UI.espresso)
}