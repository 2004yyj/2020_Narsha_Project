package com.example.guji_.retroFit

import retrofit2.Call
import retrofit2.http.GET

interface RecyclerService {
    @GET("/places")
    fun getPlaceData() : Call<ArrayList<Model>>
}