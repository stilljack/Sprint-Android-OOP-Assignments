package com.saucefan.stuff.m01assignment.recycleview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.saucefan.stuff.m01assignment.R
import com.saucefan.stuff.m01assignment.ShoppingItem
import kotlinx.android.synthetic.main.list_layout.view.*


class Adapter(val list: ArrayList<ShoppingItem>) : RecyclerView.Adapter<com.saucefan.stuff.m01assignment.recycleview.Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(viewGroup)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //  holder.nameTv.text = list[position].name
        val currentSelection = list[position]
        holder.tv.text = currentSelection.getDisplayName()
        holder.tv.setBackgroundColor(Color.parseColor("#${currentSelection.colorId}"))

    }
    //color change code for later
    //myLayout.setBackgroundColor(Color.parseColor("#636161"))

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var aParent = view
        var tv = view.tv_item



    }


}
