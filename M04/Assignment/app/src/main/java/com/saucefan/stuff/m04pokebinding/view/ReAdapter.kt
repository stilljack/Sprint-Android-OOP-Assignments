package com.saucefan.stuff.m04pokebinding.view

import android.content.Intent
import android.widget.ImageView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saucefan.stuff.m04pokebinding.R
import com.saucefan.stuff.m04pokebinding.api.ApiInterface.Factory.Companion.pokedexList
import com.saucefan.stuff.m04pokebinding.model.PokeForms
import kotlinx.android.synthetic.main.list_layout.view.*
import kotlin.random.Random


class ReAdapter(val list: MutableList<PokeForms>) : RecyclerView.Adapter<ReAdapter.ViewHolder>() {


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
        fun chooseRandomSprite() : String {
            var that =""
                  when (Random.nextInt(1,3)) {
                      1-> that = currentSelection.sprites.front_default
                      2-> that = currentSelection.sprites.front_shiny
                     else -> that = currentSelection.sprites.front_default
                 }
            return that
        }
        Glide.with(holder.pokeIMG.context)
            .load(chooseRandomSprite())
            .into(holder.pokeIMG)
        holder.pokeIMG.setOnClickListener {
            var intent_details: Intent = Intent(it.context, DetailActivity::class.java)
            intent_details.putExtra("pokeID", currentSelection.id.toString() ?: "151")
            intent_details.putExtra("pokeSpriteURL", currentSelection.sprites.front_default)
            startActivity(it.context, intent_details, null)
        }
        holder.pokeName.text=currentSelection.name
        holder.pokeParent.setOnLongClickListener{
            pokedexList.remove(currentSelection)
            notifyItemRemoved(position)
            true
        }
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val pokeIMG: ImageView = view.img_poke
        val pokeName: TextView = view.tv_poke_name
        val pokeID: TextView = view.tv_id
        val pokeParent = view.llcardview

/*   holder.pokeIMG.setOnLongClickListener{ it: View? ->
           //     Toast.makeText(it!!.context,"just great",Toast.LENGTH_SHORT).show();
             val selected = ContextCompat.getDrawable(it!!.context,R.drawable.ic_launcher_background)
            val unselected =ContextCompat.getDrawable(it.context,R.drawable.ic_launcher_foreground)
            if (deleteList.contains(currentSelection)) {
                it.background= unselected
                deleteList.remove(currentSelection)

            } else {
                it.background = selected
                deleteList.add(currentSelection)
            }
            true
        }*/

    }


}
