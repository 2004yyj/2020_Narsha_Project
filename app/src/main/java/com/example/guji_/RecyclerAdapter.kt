package com.example.guji_

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecyclerAdapter(private val context: Context?, private val list: ArrayList<Model>) : RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_holder, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val recyclerName = holder.name
        val recyclerCategory = holder.category
        recyclerName.text = list[position].name
        recyclerCategory.text = list[position].category
    }

    override fun getItemCount(): Int {
        return list.size
    }

    open class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.name)
        var category: TextView = itemView.findViewById(R.id.category)
    }
}