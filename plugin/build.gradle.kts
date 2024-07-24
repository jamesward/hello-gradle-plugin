plugins {
    `kotlin-dsl`

    id("com.vanniktech.maven.publish")
}

repositories {
    mavenCentral()
}

gradlePlugin {
    val greeting by plugins.creating {
        id = "org.example.greeting"
        implementationClass = "org.example.HelloGradlePluginPlugin"
    }
}
