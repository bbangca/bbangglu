plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("io.freefair.gradle:lombok-plugin:8.6")
    // 추후 적용
    //implementation("io.spring.javaformat:spring-javaformat-gradle-plugin:0.0.43")
}