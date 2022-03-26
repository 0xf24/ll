import java.io.FileInputStream
import java.util.Properties

plugins {
    java
    `maven-publish`
}

group = "im.f24"
version = "1.1"

repositories {
    mavenCentral()
}

tasks.compileJava {
    options.release.set(8)
}

dependencies {
}

val secrets = Properties()
try {
    secrets.load(FileInputStream(project.file("secrets.properties")))
} catch(ignored:Exception) {}

publishing {
    repositories {
        maven {
            url = uri("https://maven.f24.im/releases")
            name = "f24"

            credentials {
                username = secrets.getProperty("username")
                password = secrets.getProperty("password")
            }

            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = "im.f24"
            artifactId = "ll"

            from(components["java"])
        }
    }
}