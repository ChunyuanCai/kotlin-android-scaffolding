package com.fernandocejas.android

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class AndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        this.initializeInjector()
        this.initializeLeakDetection()
    }

    private fun initializeInjector() {
        //TODO: initialize Dagger
    }

    private fun initializeLeakDetection() {
        if (BuildConfig.DEBUG) {
            LeakCanary.install(this)
        }
    }
}
