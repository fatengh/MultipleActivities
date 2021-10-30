package com.example.multipleactivities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class MyAdap (val user:ArrayList<String>):RecyclerView.Adapter<MyAdap.RVHolder>() {
    class RVHolder(itemView: View):RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdap.RVHolder {
        return RVHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            ))

    }

    override fun onBindViewHolder(holder: MyAdap.RVHolder, position: Int) {

        holder.itemView.apply {
            tv.text=user[position]
        }
    }

    override fun getItemCount() =user.size
}