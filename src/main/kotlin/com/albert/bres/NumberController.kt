package com.albert.bres

import com.albert.bres.services.ExternalNumberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NumberController(private val externalNumberService: ExternalNumberService) {

    @GetMapping("/number")
    fun getNumber() = externalNumberService.fetchNumber()
}