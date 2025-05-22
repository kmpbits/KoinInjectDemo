package com.joel.koininjectdemo.core.di.modules

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

@Module
@ComponentScan("com.joel.koininjectdemo.presentation")
class ViewModelModule