plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.0"
    id ("maven-publish")
}

group = "pl.cytruscode"
version = "1.0.0"

repositories {
    mavenCentral()
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
    implementation("net.kyori:adventure-text-minimessage:5.2.0")
}

tasks.test {
    useJUnitPlatform()
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "pl.cytruscode"
            artifactId = "ccUtilities"
            version = "1.0.0"

            from(components["java"])
        }
    }
}