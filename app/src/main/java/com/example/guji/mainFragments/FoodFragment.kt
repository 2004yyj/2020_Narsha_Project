package com.example.guji.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guji.retroFit.Model
import com.example.guji.R
import com.example.guji.retroFit.RecyclerClient
import com.example.guji.recyclerView.RecyclerAdapter
import com.example.guji.retroFit.RecyclerService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.collections.ArrayList

class FoodFragment : Fragment() {

    val list = ArrayList<Model>()
    private val retrofit = RecyclerClient.getInstance()
    private val service: RecyclerService = retrofit.create(RecyclerService::class.java)
    lateinit var recyclerView : RecyclerView
    lateinit var recyclerAdapter : RecyclerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_food, container, false)
        getFoodPlaceList(view)

        return view
    }

    private fun getFoodPlaceList(view : View) {
        service.getPlaceData().enqueue(object : Callback<ArrayList<Model>> {
            override fun onResponse(call: Call<ArrayList<Model>>, response: Response<ArrayList<Model>>) {
                if (response.isSuccessful) {

                    list.addAll(response.body()!!)

                    println(list.toString())

                    recyclerView = view.findViewById(R.id.food_recycler_View)
                    recyclerAdapter = RecyclerAdapter(context, list)
                    recyclerView.layoutManager = LinearLayoutManager(context)
                    recyclerView.adapter = recyclerAdapter
                }
            }

            override fun onFailure(call: Call<ArrayList<Model>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

}