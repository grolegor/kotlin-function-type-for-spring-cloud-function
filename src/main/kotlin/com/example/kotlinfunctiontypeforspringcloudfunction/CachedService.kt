package com.example.kotlinfunctiontypeforspringcloudfunction

import org.springframework.cache.annotation.Cacheable
import org.springframework.cache.annotation.EnableCaching
import org.springframework.stereotype.Service

@Service
@EnableCaching
class CachedService {

    @Cacheable(cacheNames = ["cache"])
    fun cachedMethod(): String {
        println("cache miss")
        return "answer"
    }

}