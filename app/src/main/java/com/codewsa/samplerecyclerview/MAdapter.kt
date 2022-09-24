package com.codewsa.samplerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MAdapter(private val context: Context,private val tvArray: Array<String>) : RecyclerView.Adapter<MAdapter.MViewHOlder>() {
    inner class MViewHOlder(view: View) : RecyclerView.ViewHolder(view){
        val mTV = view.findViewById<TextView>(R.id.mTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MViewHOlder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.custom_item_layout,parent,false)
        return MViewHOlder(view)
    }

    override fun onBindViewHolder(holder: MViewHOlder, position: Int) {
        holder.mTV.text = tvArray[position]
    }

    override fun getItemCount(): Int {
        return tvArray.size
    }
}