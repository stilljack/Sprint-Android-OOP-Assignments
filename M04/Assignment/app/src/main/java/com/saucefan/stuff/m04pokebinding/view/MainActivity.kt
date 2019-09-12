package com.saucefan.stuff.m04pokebinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saucefan.stuff.m04pokebinding.R
import com.saucefan.stuff.m04pokebinding.api.ApiInterface
import com.saucefan.stuff.m04pokebinding.api.ApiInterface.Factory.Companion.pokedexList
import com.saucefan.stuff.m04pokebinding.databinding.ActivityMainBinding
import com.saucefan.stuff.m04pokebinding.model.PokeForms
import com.saucefan.stuff.m04pokebinding.viewmodel.PokeViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    companion object {
        @BindingAdapter("toastMessage")
        @JvmStatic
        fun showToast(view: View, message:String?) {
            if (message != null)
                Toast.makeText(view.context,message,Toast.LENGTH_LONG).show()
        }
    }
    var pokedexRetrofit = ApiInterface.Factory.create() // make an instance just for pokedex calls
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = PokeViewModel()
        binding.executePendingBindings()



    val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycle_view.layoutManager = manager
        val adapter = ReAdapter(pokedexList)
        recycle_view.adapter = adapter


   /*   fun makeArandomPokedex(number: Int) {
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
        makeArandomPokedex(10)*/
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
                        //adapter.notifyItemInserted(pokedexList.size - 1)
                    }
                })
        }





    }
}


/*
pokedex fun for another time

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