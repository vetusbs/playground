package com.albert.bres.services

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ExternalNumberService(private val restTemplate: RestTemplate) {
    private val url: String = "http://localhost:8888/number"

    fun fetchNumber() = restTemplate.getForEntity(url, NumberClientDto::class.java)
}

data class NumberClientDto(@JsonProperty("number") val number: Long)