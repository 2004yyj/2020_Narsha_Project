package com.example.guji.retroFit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RecyclerClient {
    private var recyclerService : Retrofit? = null
    private const val baseUrl: String = "http://guji.c2a.kr"

    fun getInstance() : Retrofit {
        val gson = GsonBuilder().setLenient().create()
        if (recyclerService == null) {
            recyclerService = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
        }

        return recyclerService!!

     }
}