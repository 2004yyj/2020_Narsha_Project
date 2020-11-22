package com.example.guji.mainFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guji.PlaceActivity
import com.example.guji.R
import com.example.guji.recyclerView.RecyclerAdapter
import com.example.guji.retroFit.Model
import com.example.guji.retroFit.RecyclerClient
import com.example.guji.retroFit.RecyclerService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CafeFragment : Fragment() {

    val list = ArrayList<Model>()
    private val retrofit = RecyclerClient.getInstance()
    private val service: RecyclerService = retrofit.create(RecyclerService::class.java)
    lateinit var recyclerView : RecyclerView
    lateinit var recyclerAdapter : RecyclerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_cafe, container, false)
        getPlaceList(view)

        return view
    }

    private fun getPlaceList(view : View) {
        service.getPlaceData("cafe").enqueue(object : Callback<ArrayList<Model>> {
            override fun onResponse(call: Call<ArrayList<Model>>, response: Response<ArrayList<Model>>) {
                if (response.isSuccessful) {

                    list.addAll(response.body()!!)
                    recyclerView = view.findViewById(R.id.cafe_recycler_View)
                    recyclerAdapter = context?.let { RecyclerAdapter(it, list) }!!
                    recyclerView.layoutManager = LinearLayoutManager(context)
                    recyclerView.adapter = recyclerAdapter

                    recyclerAdapter.setOnItemClickListener(object : RecyclerAdapter.OnItemClickListener {
                        override fun onItemClick(pos: Int) {
                            val intent = Intent(context, PlaceActivity::class.java)
                            intent.putExtra("list", list[pos])
                            startActivity(intent)
                        }

                    })
                }
            }

            override fun onFailure(call: Call<ArrayList<Model>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}