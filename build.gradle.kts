

plugins {
    id("java")
    id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.google.errorprone:error_prone_annotations:2.32.0")
    implementation("junit:junit:4.13.2")
    implementation("com.google.truth:truth:1.4.4")
    implementation("com.google.guava:guava-testlib:33.3.0-jre")
}

tasks.test {
    useJUnitPlatform()
}