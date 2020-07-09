package com.lh.sunnyweather.logic.network

import com.lh.sunnyweather.SunnyWeatherApplication
import com.lh.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 *@author: lh
 *CreateDate: 2020/7/9
 */
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
//    @GET()
    fun searchPlace(@Query("query") query: String): Call<PlaceResponse>
}