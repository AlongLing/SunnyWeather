package com.along.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

// 根据返回的城市 json 数据定义相应的数据对象。
class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)