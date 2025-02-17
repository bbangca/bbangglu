plugins {
    id("java")
}

dependencies{

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.4")

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.11.4")

    // Assertion 사용
    // https://mvnrepository.com/artifact/org.assertj/assertj-core
    testImplementation("org.assertj:assertj-core:3.27.3")
}
