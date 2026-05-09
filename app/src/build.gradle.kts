plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.knucklesemu"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.knucklesemu"
        minSdk = 24
        targetSdk = 35

        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.compose.material3:material3")
}
