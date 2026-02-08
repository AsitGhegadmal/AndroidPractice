package com.androidasit.a01_androidlifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    val TAG = "LifeCycleExample"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        Log.d(TAG, "B onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "B onStart()")

        /*finish()
        Log.d(TAG, "finish() call here...")*/
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "B onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "B onPause()")
    }


    override fun onStop() {
        super.onStop()
        Log.d(TAG, "B onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "B onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "B onDestroy()")
    }
}