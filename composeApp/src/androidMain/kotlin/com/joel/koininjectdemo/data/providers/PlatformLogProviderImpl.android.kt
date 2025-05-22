package com.joel.koininjectdemo.data.providers

import android.util.Log
import com.joel.koininjectdemo.domain.providers.PlatformLogProvider
import org.koin.core.annotation.Single

@Single
actual class PlatformLogProviderImpl : PlatformLogProvider {

    actual override fun logMessage(message: String) {
        Log.d("PlatformLogProvider", message)
    }
}