package com.example.guji.recyclerView

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.guji.R
import com.example.guji.retroFit.Model

class RecyclerAdapter(private val context: Context, private val list: ArrayList<Model>) : RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    interface OnItemClickListener {
        fun onItemClick(pos : Int)
    }

    private lateinit var itemListener : OnItemClickListener

    fun setOnItemClickListener (itemListener: OnItemClickListener) {
        this.itemListener = itemListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_holder, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val url = "http://guji.c2a.kr"
        val recyclerButton = holder.button
        val recyclerName = holder.name
        val recyclerCategory = holder.category
        val recyclerAddress = holder.address
        val recyclerImage = holder.imageView

        Glide.with(context).load(url + list[position].image_url).circleCrop().into(recyclerImage)
        recyclerName.text = list[position].name
        recyclerCategory.text = list[position].sub_category
        recyclerAddress.text = list[position].address

        recyclerButton.setOnClickListener {
            itemListener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    open class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var button: Button = itemView.findViewById(R.id.button)
        var imageView: ImageView = itemView.findViewById(R.id.image_view)
        var name: TextView = itemView.findViewById(R.id.name)
        var category: TextView = itemView.findViewById(R.id.category)
        var address: TextView = itemView.findViewById(R.id.address)
    }
}