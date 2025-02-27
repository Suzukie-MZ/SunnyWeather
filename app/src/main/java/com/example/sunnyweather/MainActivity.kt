package com.example.sunnyweather

import android.graphics.Color
import android.os.Bundle
import android.view.WindowInsets.Type.statusBars
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sunnyweather.ui.place.PlaceFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        val controller = ViewCompat.getWindowInsetsController(window.decorView)
//        controller?.hide(statusBars())
//        window.statusBarColor = Color.TRANSPARENT
        setContentView(R.layout.activity_main)

//        if(savedInstanceState == null){
//            fragmentManager.beginTransaction()
//                .replace(R.id.placeFragment,PlaceFragment())
//                .commit()
//        }
    }
}