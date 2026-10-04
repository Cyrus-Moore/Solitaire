plugins {
    id("java")
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "dev.cyrusmoore"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("dev.cyrusmoore.solitaire.Main")
    applicationDefaultJvmArgs = listOf("--enable-native-access=javafx.graphics")
}

javafx {
    version = "27"
    modules = listOf("javafx.controls", "javafx.media")
}