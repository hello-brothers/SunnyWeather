package com.lh.sunnyweather

import android.app.Application
import android.content.Context

/**
 *@author: lh
 *CreateDate: 2020/7/8
 */
class SunnyWeatherApplication: Application() {

    companion object{
        lateinit var context: Context
        /** 彩云apiToken **/
        const val TOKEN = "3cBUFRNaUBYg2ABn"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}