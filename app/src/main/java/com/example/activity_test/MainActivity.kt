package com.example.activity_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var LOG_TG = "MYLOGS"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TG, "And the Raven, never flitting, still is sitting, still is sitting")
    }
    override fun onStart(){
        super.onStart()
        Log.d(LOG_TG, "On the pallid bust of Pallas just above my chamber door")
    }
    override fun onResume()
    {super.onResume()
        Log.d(LOG_TG, "And his eyes have all the seeming of a demon’s that is dreaming")
    }
    override fun onPause(){
        super.onPause()
        Log.d(LOG_TG, "And the lamp-light o’er him streaming throws his shadow on the floor")
    }
    override fun onStop(){
        super.onStop()
        Log.d(LOG_TG, "And my soul from out that shadow that lies floating on the floor")
    }


    override fun onDestroy(){
        super.onDestroy()
        Log.d(LOG_TG, "Shall be lifted - nevermore!")
    }
}