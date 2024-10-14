package org.thangavel.kmp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP",
    ) {
        App(batteryManager = remember {
            BatteryManager()
        })
    }
}