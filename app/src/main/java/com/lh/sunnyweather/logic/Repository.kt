package com.lh.sunnyweather.logic

import androidx.lifecycle.liveData
import com.lh.sunnyweather.logic.model.Place
import com.lh.sunnyweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

/**
 *@author: lh
 *CreateDate: 2020/7/9
 */
object Repository {
    fun searchPlace(query: String) = liveData(Dispatchers.IO){
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlace(query)
            if (placeResponse.status == "ok"){
                Result.success(placeResponse.places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e: Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}