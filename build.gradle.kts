plugins {
    id ("org.springframework.boot") version "2.7.1"
    id ("io.spring.dependency-management") version "1.0.11.RELEASE"
    java
}

java{
    sourceCompatibility = JavaVersion.VERSION_11
}
group = "com.yong"
version = "0.0.1-SNAPSHOT"

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    compileOnly ("org.projectlombok:lombok")
    runtimeOnly ("com.h2database:h2")
    annotationProcessor ("org.projectlombok:lombok")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
