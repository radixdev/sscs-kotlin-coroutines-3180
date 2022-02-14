package com.radix.myapplication

import android.annotation.SuppressLint
import android.app.Application
import android.os.StrictMode

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        activateStrictMode()
    }

    @SuppressLint("NewApi")
    private fun activateStrictMode() {
        val threadPolicyBuilder = StrictMode.ThreadPolicy.Builder()
            .detectAll()
            .penaltyLog()
            .penaltyDialog()
        StrictMode.setThreadPolicy(threadPolicyBuilder.build())
    }
}
