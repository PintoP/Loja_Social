plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    // Plugin do Firebase
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.loja"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.loja"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // Dependências principais do Android
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.activity)

    // Dependências de Teste
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Dependências do Firebase
    implementation(platform("com.google.firebase:firebase-bom:33.5.1")) // Firebase BOM
    implementation("com.google.firebase:firebase-analytics")  // Firebase Analytics
    implementation("com.google.firebase:firebase-firestore-ktx") // Firestore

    // Firebase Authentication (opcional, se for usar)
    implementation("com.google.firebase:firebase-auth-ktx:21.2.0")
}
