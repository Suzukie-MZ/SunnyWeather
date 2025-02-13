package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class SunnyWeatherApplication : Application(){
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "tIYwpy5NxgcJKSd1"
    }

    override fun onCreate(){
        super.onCreate()
        context = applicationContext
    }
}