package com.example.demorecyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Activity, private val dataList: ArrayList<dataModel>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recyclerview,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.lang.text = currentItem.title
        holder.subTitle.text = currentItem.subTitle
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val lang = itemView.findViewById<TextView>(R.id.txt_title)
        val subTitle = itemView.findViewById<TextView>(R.id.txt_subtitle)
    }

}