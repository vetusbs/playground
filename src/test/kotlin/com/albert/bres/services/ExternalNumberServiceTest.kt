package com.albert.bres.services

import com.nhaarman.mockitokotlin2.mock
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.web.client.RestTemplate

internal class ExternalNumberServiceTest {

    private val restTemplate = mock<RestTemplate>()
    private val externalNumberService = ExternalNumberService(restTemplate)

    @Test
    fun `should retun a random number`() {
        assertThat(externalNumberService).isNotNull
    }
}