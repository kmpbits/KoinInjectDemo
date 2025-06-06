package com.joel.koininjectdemo.core.di

import com.joel.koininjectdemo.core.di.modules.PlatformModule
import com.joel.koininjectdemo.core.di.modules.ServiceModule
import com.joel.koininjectdemo.core.di.modules.ViewModelModule
import org.koin.core.KoinApplication
import org.koin.core.annotation.Module
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.ksp.generated.module

fun initApplication(appDeclaration: KoinAppDeclaration = {}): KoinApplication {
    return startKoin {
        appDeclaration()
        modules(
            AppModule().module,
        )
    }
}

@Module(
    includes = [
        PlatformModule::class,
        ServiceModule::class,
        ViewModelModule::class,
    ]
)
class AppModule

@Suppress("unused") //using in iOS
fun initKoin() = initApplication {}