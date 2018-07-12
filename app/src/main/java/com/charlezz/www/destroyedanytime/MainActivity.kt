package com.charlezz.www.destroyedanytime

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName
    val fragment = MainFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"onCreate")
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commitNow()
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.e(TAG, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(TAG,"onRestoreInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy")
    }
}
