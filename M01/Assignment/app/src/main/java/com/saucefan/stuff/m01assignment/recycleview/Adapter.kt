package com.saucefan.stuff.m01assignment.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.saucefan.stuff.m01assignment.R
import com.saucefan.stuff.m01assignment.ShoppingItem


class Adapter(val list: MutableList<ShoppingItem>) : RecyclerView.Adapter<com.saucefan.stuff.m01assignment.recycleview.Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.support_simple_spinner_dropdown_item, parent, false)
        return ViewHolder(viewGroup)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //  holder.nameTv.text = list[position].name
        val currentSelection = list[position]

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var aParent = view



    }


}
