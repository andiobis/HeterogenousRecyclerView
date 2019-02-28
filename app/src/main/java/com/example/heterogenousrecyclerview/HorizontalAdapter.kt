package com.example.heterogenousrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter : RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_recycler_item, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var count = position + 1
        holder.horizontalCount.text = count.toString()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val horizontalCount : TextView = itemView.findViewById(R.id.horizontalCount)
    }
}