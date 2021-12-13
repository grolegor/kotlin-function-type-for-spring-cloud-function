package com.example.kotlinfunctiontypeforspringcloudfunction

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service
import java.util.function.Consumer


@Service
class ConsumerService(
    private val cachedService: CachedService
) {

    fun receive(event: String) {
        cachedService.cachedMethod()
    }

    @Bean
    fun consumer(): (String) -> Unit = ::receive

//    @Bean
//    fun consumer(): Consumer<String> = Consumer(::receive)
}
