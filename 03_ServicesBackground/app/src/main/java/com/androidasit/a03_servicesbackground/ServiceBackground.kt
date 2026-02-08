package com.androidasit.a03_servicesbackground

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.security.Provider
import kotlin.concurrent.thread

class ServiceBackground : Service() {


    override fun onCreate() {
        super.onCreate()
        Log.d("ServiceBackground", "onCreate()")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // background work here

        // stopSelf()
        thread(start = true) {
            while (true) {
                Log.d("ServiceBackground", "onStartCommand()")
                Thread.sleep(1000)
            }

        }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ServiceBackground", "onDestroy()")
    }

    // this is use for bound service = tyamule return null kela aahe
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}