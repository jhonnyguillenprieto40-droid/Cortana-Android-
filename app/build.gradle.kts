plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.jhonny.cortana"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jhonny.cortana"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":core"))
    implementation(project(":memory"))
    implementation(project(":security"))
}
