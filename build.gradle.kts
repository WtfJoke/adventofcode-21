plugins {
    kotlin("jvm") version "1.5.31"
}

group = "com.github.wtfjoke"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("script-runtime"))
    implementation(kotlin("reflect"))
}
