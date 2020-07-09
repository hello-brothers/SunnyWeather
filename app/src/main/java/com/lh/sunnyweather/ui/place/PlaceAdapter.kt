package com.lh.sunnyweather.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lh.sunnyweather.R
import com.lh.sunnyweather.logic.model.Place

/**
 *@author: lh
 *CreateDate: 2020/7/9
 */
class PlaceAdapter(private val placeData: List<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val placeNameText: TextView = itemView.findViewById(R.id.placeName)
        val placeAdressText: TextView = itemView.findViewById(R.id.placeAddress)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item, null)
        return ViewHolder(view)
    }

    override fun getItemCount() = placeData.size

    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        holder.placeAdressText.text = placeData[position].address
        holder.placeNameText.text = placeData[position].name
    }
}