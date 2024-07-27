plugins {
    kotlin("jvm") version "2.0.0"
    id("dev.kordex.gradle.kordex") version "1.0.3"
}

group = "ru.airdead.mafiabot"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.slf4j)
}

kordEx {
    mainClass = "ru.airdead.mafiabot.bot.AppKt"
}

kotlin {
    jvmToolchain(17)
}