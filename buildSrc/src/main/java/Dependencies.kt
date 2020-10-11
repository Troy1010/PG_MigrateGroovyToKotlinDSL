object Dependencies {
    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    }
    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.1"
    }
    object Tests {
        object Framework {
            const val junit = "junit:junit:4.12"
        }
        object UI {
            const val androidx_junit = "androidx.test.ext:junit:1.1.2"
            const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        }
    }
}