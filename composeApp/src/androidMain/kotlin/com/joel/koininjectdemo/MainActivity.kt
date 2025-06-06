package com.joel.koininjectdemo

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.joel.koininjectdemo.core.di.initApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class ComposeApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initApplication {
            androidContext(this@ComposeApp)
            androidLogger()
        }
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}