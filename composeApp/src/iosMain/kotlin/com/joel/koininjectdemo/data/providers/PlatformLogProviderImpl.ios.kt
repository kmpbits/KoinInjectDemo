package com.joel.koininjectdemo.data.providers

import com.joel.koininjectdemo.domain.providers.PlatformLogProvider
import org.koin.core.annotation.Single
import platform.Foundation.NSLog

@Single
actual class PlatformLogProviderImpl : PlatformLogProvider {

    actual override fun logMessage(message: String) {
        NSLog(message)
    }
}