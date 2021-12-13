package com.example.kotlinfunctiontypeforspringcloudfunction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.test.EmbeddedKafkaBroker

@SpringBootApplication
class Application {
    @Bean
    fun embeddedKafkaBroker(): EmbeddedKafkaBroker = EmbeddedKafkaBroker(1).kafkaPorts(9092)
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
