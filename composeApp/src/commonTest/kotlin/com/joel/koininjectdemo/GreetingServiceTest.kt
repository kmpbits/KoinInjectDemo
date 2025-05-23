package com.joel.koininjectdemo

import com.joel.koininjectdemo.data.service.GreetingService
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingServiceTest {

    @Test
    fun `greet should return correct greeting message`() = runTest {
        val service = GreetingService()

        val result = service.greet()

        assertEquals("Hello from GreetingService!", result)
    }
}
