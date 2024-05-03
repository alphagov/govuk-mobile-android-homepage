plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.androidLibrary) apply false
    id("jacoco")
    id("org.sonarqube") version "4.4.1.3373"
}

apply("sonar.gradle")
apply("jacoco.gradle")
