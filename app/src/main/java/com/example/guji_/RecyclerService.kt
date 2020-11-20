package com.example.guji_

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RecyclerService {
    @GET("/places")
    fun getPlaceData() : Call<ArrayList<Model>>
}