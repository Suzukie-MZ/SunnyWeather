package com.example.sunnyweather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val BAAE_URL = "https://api.caiyunapp.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BAAE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    // ???
    fun <T> create(serviceClass : Class<T>) : T = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
    // ???
}