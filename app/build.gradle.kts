plugins {
    id("se.patrikerdes.use-latest-versions") version "0.2.18" /*gradle use latest version plugin*/
    id("com.github.ben-manes.versions") version "0.51.0"
    application
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
application{
    mainClass="hexlet.code.App"
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}



