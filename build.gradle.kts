import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "io.github.lulily13"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    withType<Wrapper> {
        gradleVersion = "8.6"
        distributionType = Wrapper.DistributionType.ALL
    }

    withType<KotlinCompile> {
        incremental = true
        kotlinOptions {
            jvmTarget = "21"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }

    withType<Test> {
        useJUnitPlatform()
    }
}