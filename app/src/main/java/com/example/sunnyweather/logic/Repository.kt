package com.example.sunnyweather.logic

import androidx.lifecycle.liveData
import com.example.sunnyweather.logic.model.Place
import com.example.sunnyweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

object Repository {

    fun searchPlaces(query : String) = liveData(Dispatchers.IO){
        val result = try {
            val PlaceResponse = SunnyWeatherNetwork.searchPlaces(query)
            if(PlaceResponse.status == "ok"){
                val place = PlaceResponse.places
                Result.success(place)
            } else {
                Result.failure(RuntimeException("response status is${PlaceResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}