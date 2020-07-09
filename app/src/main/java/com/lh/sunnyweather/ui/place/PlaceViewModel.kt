package com.lh.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.lh.sunnyweather.logic.Repository
import com.lh.sunnyweather.logic.model.Place

/**
 *@author: lh
 *CreateDate: 2020/7/9
 */
class PlaceViewModel: ViewModel() {

    val placeList = ArrayList<Place>()

    private val searchLiveData = MutableLiveData<String>()

    val placeLiveData = Transformations.switchMap(searchLiveData){
        Repository.searchPlace(it.toString())
    }

    fun searchPlace(query: String){
        searchLiveData.value = query
    }
}