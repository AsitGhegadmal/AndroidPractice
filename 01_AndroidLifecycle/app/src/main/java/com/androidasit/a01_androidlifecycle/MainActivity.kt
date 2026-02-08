package com.androidasit.a01_androidlifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "LifeCycleExample"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d(TAG, "A onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "A onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "A onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "A onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "A onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "A onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "A onDestroy()")
    }

    fun nextActivity(view: View) {
        startActivity(Intent(this, MainActivity2::class.java))
    }
}