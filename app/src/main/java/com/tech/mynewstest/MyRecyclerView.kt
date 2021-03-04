package com.tech.mynewstest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerView(val list:MutableList<String>): RecyclerView.Adapter<MyRecyclerView.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var tv=itemView.findViewById<TextView>(R.id.tv1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var inflater=LayoutInflater.from(parent.context)
        var view=inflater.inflate(R.layout.my_view,parent,false)
        var holder=MyViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var item=list[position]
       holder.tv.setText(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}