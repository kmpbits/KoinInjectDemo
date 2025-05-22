package com.joel.koininjectdemo.core.di.modules

import com.joel.koininjectdemo.data.service.GreetingService
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
// Example of a module without @ComponentScan,
// so you need to declare it manually.
// This approach is common when integrating external libraries like Ktor or Room.
class ServiceModule {

    @Single
    fun provideGreetingService() = GreetingService()
}