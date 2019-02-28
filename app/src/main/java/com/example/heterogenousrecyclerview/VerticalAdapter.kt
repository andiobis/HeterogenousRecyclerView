package com.example.heterogenousrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView

class VerticalAdapter : RecyclerView.Adapter<VerticalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.vertical_recycler_item, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var count = position + 1
       holder.count.text = count.toString()

       val horizontalManager = LinearLayoutManager(holder.recyclerView.context,OrientationHelper.HORIZONTAL,false)
        horizontalManager.initialPrefetchItemCount = 4

       holder.recyclerView.apply {
            layoutManager = horizontalManager
            adapter = HorizontalAdapter()
       }


    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val count : TextView = itemView.findViewById(R.id.verticalCount)
        val recyclerView : RecyclerView =  itemView.findViewById(R.id.horizontalRecyclerView)
    }

}