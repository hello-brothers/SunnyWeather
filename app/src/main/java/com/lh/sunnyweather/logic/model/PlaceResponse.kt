package com.lh.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 *@author: lh
 *CreateDate: 2020/7/8
 */
class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)