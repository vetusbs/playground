package com.albert.bres.services

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.web.client.RestTemplate

@ExtendWith(value = [SpringExtension::class])
class ExternalNumberServiceIntegrationTest {

    val externalNumberService = ExternalNumberService(RestTemplate())

    @Test
    internal fun `should return a valid number when`() {
        val responseEntity = externalNumberService.fetchNumber()

        assertThat(responseEntity).isNotNull
    }
}