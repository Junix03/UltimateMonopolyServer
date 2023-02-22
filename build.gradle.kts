plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "net.junix"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(18)
}

application {
    mainClass.set("MainKt")
}