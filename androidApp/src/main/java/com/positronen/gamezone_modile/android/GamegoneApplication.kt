package com.positronen.gamezone_modile.android

import PlatformConfiguration
import android.app.Application

class GamegoneApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        PlatformDataConfiguration.init(PlatformConfiguration(androidContext = applicationContext))
    }
}