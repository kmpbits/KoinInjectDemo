package com.joel.koininjectdemo.core.di.modules

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

@Module
// This has to be exactly the same as the package name of the dependency
@ComponentScan("com.joel.koininjectdemo.data.providers")
actual class PlatformModule