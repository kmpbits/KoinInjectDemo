package com.joel.koininjectdemo.core.di.modules

import org.koin.core.annotation.Module

@Module
// Ensure this class has a constructor.
// It's required for Koin's code generation to create instances automatically.
expect class PlatformModule()