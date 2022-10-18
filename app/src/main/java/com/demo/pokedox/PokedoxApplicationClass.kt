package com.demo.pokedox

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class PokedoxApplicationClass : Application(){


    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}