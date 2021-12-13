package com.example.kotlinfunctiontypeforspringcloudfunction

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val cachedService: CachedService
) {

    @GetMapping("/")
    fun get() =
        cachedService.cachedMethod()
}
