package com.joel.koininjectdemo.data.service

import kotlinx.coroutines.delay

class GreetingService {

    suspend fun greet(): String {
        // Simulate a time consumming operation
        delay(500)
        return "Hello from GreetingService!"
    }
}