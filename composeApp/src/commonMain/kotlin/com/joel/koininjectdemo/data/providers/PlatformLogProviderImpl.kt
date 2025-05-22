package com.joel.koininjectdemo.data.providers

import com.joel.koininjectdemo.domain.providers.PlatformLogProvider

expect class PlatformLogProviderImpl : PlatformLogProvider {
    override fun logMessage(message: String)
}