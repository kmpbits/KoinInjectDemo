package com.joel.koininjectdemo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joel.koininjectdemo.data.service.GreetingService
import com.joel.koininjectdemo.domain.providers.PlatformLogProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Provided

@KoinViewModel
class AppViewModel(
    private val greetingService: GreetingService,
    @Provided private val platformLogProvider: PlatformLogProvider
) : ViewModel() {

    private val _greetingState = MutableStateFlow("")
    val greetingState: StateFlow<String> = _greetingState.asStateFlow()

    fun loadGreeting() = viewModelScope.launch {
        _greetingState.value = greetingService.greet()
    }

    fun logMessage() {
        platformLogProvider.logMessage("Hello from AppViewModel!")
    }
}