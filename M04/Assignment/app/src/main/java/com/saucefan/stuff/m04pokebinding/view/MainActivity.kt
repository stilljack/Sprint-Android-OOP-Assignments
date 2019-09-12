package com.saucefan.stuff.m04pokebinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.saucefan.stuff.m04pokebinding.R
import com.saucefan.stuff.m04pokebinding.api.ApiInterface
import com.saucefan.stuff.m04pokebinding.api.ApiInterface.Factory.Companion.pokedexList
import com.saucefan.stuff.m04pokebinding.model.PokeForms
import com.saucefan.stuff.m04pokebinding.model.Pokedex
import com.saucefan.stuff.m04pokebinding.view.ReAdapter.Companion.deleteList
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.random.Random


class MainActivity : AppCompatActivity() {


    var pokedexRetrofit = ApiInterface.Factory.create() // make an instance just for pokedex calls


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycle_view.layoutManager = manager
        val adapter = ReAdapter(pokedexList)
        recycle_view.adapter = adapter

        //recycle_view.setHasFixedSize(true)
        //val manager = StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL)
        //  recycle_view.layoutManager = manager


        fun makeArandomPokedex(number: Int) {
            for (i in 1 until number) {
                pokedexRetrofit.getPokemonForm(Random.nextInt(1, 950).toString())
                    .enqueue(object : Callback<PokeForms> {
                        override fun onFailure(call: Call<PokeForms>, t: Throwable) {
                            t.printStackTrace()
                            val response = "faliure; ${t.message}"
                            Toast.makeText(this@MainActivity, response, Toast.LENGTH_SHORT).show()
                        }

                        override fun onResponse(
                            call: Call<PokeForms>,
                            response: Response<PokeForms>
                        ) {
                            val newPokedex: PokeForms? = response.body()
                            if (newPokedex != null) {
                                pokedexList.add(newPokedex)
                            }
                        }
                    })
            }
            adapter.notifyDataSetChanged()
        }
        makeArandomPokedex(10)
        btn_submit.setOnClickListener {
            pokedexRetrofit.getPokemonForm(et_pokeentry.text.toString())
                .enqueue(object : Callback<PokeForms> {
                    override fun onFailure(call: Call<PokeForms>, t: Throwable) {
                        t.printStackTrace()
                        val response = "faliure; ${t.message}"
                        Toast.makeText(this@MainActivity, response, Toast.LENGTH_SHORT).show()
                    }

                    override fun onResponse(
                        call: Call<PokeForms>,
                        response: Response<PokeForms>
                    ) {
                        val newPokedex: PokeForms? = response.body()
                        if (newPokedex != null) {
                            pokedexList.add(newPokedex)
                        }
                        adapter.notifyItemInserted(pokedexList.size - 1)
                    }
                })
            pokedexRetrofit.getPokedex(et_pokeentry.text.toString())
                .enqueue(object : Callback<Pokedex> {
                    override fun onFailure(call: Call<Pokedex>, t: Throwable) {
                        t.printStackTrace()
                        val response = "faliure; ${t.message}"
                        Toast.makeText(this@MainActivity, response, Toast.LENGTH_SHORT).show()

                    }

                    override fun onResponse(
                        call: Call<Pokedex>,
                        response: Response<Pokedex>
                    ) {
                        val newPokedex: Pokedex? = response.body()
                        Toast.makeText(
                            this@MainActivity,
                            newPokedex?.id.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                })
        }




        btn_delete.setOnClickListener {
            pokedexList.removeAll(deleteList)
            deleteList.removeAll(deleteList)
            adapter.notifyDataSetChanged()
        }
    }
}


/*

working pokemon details object

pokedexRetrofit.getPokemonDetails(et_pokeentry.text.toString()).enqueue(object : Callback<Pokemon> {
                override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    t.printStackTrace()
                    val response = "faliure; ${t.message}"
                    Toast.makeText(this@MainActivity, response, Toast.LENGTH_SHORT).show()

                }

                override fun onResponse(
                    call: Call<Pokemon>,
                    response: Response<Pokemon>
                ) {
                    val newPokedex: Pokemon? = response.body()
                    tv.text =
                        "name: ${newPokedex?.name.toString()} \n habitat: ${newPokedex?.id.toString()} \n" +
                                " habitat: ${newPokedex?.id.toString()}"
                    Toast.makeText(this@MainActivity, newPokedex?.id.toString(), Toast.LENGTH_SHORT)
                        .show()
                }
            })
 */