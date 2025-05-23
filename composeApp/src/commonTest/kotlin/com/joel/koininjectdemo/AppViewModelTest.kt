package com.joel.koininjectdemo

import app.cash.turbine.test
import com.joel.koininjectdemo.data.service.GreetingService
import com.joel.koininjectdemo.domain.providers.PlatformLogProvider
import com.joel.koininjectdemo.presentation.AppViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
class AppViewModelTest {

    private val testDispatcher = StandardTestDispatcher()

    private val greetingService = GreetingService()

    private class FakeLogProvider : PlatformLogProvider {
        var lastLogged: String? = null

        override fun logMessage(message: String) {
            lastLogged = message
        }
    }

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `loadGreeting updates state with greeting`() = runTest {
        val viewModel = AppViewModel(
            greetingService = greetingService,
            platformLogProvider = FakeLogProvider()
        )

        viewModel.greetingState.test {
            assertEquals("", awaitItem()) // initial value

            viewModel.loadGreeting()
            testDispatcher.scheduler.advanceUntilIdle()

            assertEquals("Hello from GreetingService!", awaitItem())
        }
    }

    @Test
    fun `logMessage sends message to platformLogProvider`() {
        val logProvider = FakeLogProvider()
        val viewModel = AppViewModel(
            greetingService = greetingService,
            platformLogProvider = logProvider
        )

        viewModel.logMessage()
        assertEquals("Hello from AppViewModel!", logProvider.lastLogged)
    }
}
