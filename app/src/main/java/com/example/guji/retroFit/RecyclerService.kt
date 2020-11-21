package com.example.guji.retroFit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RecyclerService {

//    @GET("/places")
//    fun getPlaceData() : Call<ArrayList<Model>>

    @GET("/places/category/{category}")
    fun getPlaceData(@Path("category") category: String) : Call<ArrayList<Model>>
}