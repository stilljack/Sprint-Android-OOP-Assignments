package com.saucefan.stuff.m04pokebinding.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.saucefan.stuff.m04pokebinding.R
import com.saucefan.stuff.m04pokebinding.api.ApiInterface
import com.saucefan.stuff.m04pokebinding.model.PokemonDetails
import kotlinx.android.synthetic.main.activity_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity(), Callback<PokemonDetails> {
    override fun onFailure(call: Call<PokemonDetails>, t: Throwable) {
        t.printStackTrace()
        val response = "faliure; ${t.message}"
        Toast.makeText(this@DetailActivity, response, Toast.LENGTH_SHORT).show()

    }

    override fun onResponse(
        call: Call<PokemonDetails>,
        response: Response<PokemonDetails>
    ) {
        val detailedPokemon: PokemonDetails? = response.body()
        var text =""
        for (i in 0 until detailedPokemon?.flavorTextEntries?.size!!.toInt()) {
            // this boy done finds our englash languages so you aint readin no japanise
            if (detailedPokemon?.flavorTextEntries[i].language.name.toString() == "en")
            {
                text=detailedPokemon?.flavorTextEntries[i].flavorText
                }
        }
        tv1.text = text //"Pokdex number: ${detailedPokemon?.flavorTextEntries.toString()}"
        tv2.text = "Name: ${detailedPokemon?.name.toString()}"
        tv3.text = "Capture Rate: ${detailedPokemon?.captureRate.toString()}"



    }


    var pokedexRetrofit =  ApiInterface.Factory.create() // make an instance just for pokedex calls
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val sprite:String = intent.getStringExtra("pokeSpriteURL")
        val type = intent.getStringExtra("pokeID")
        Glide.with(this@DetailActivity)
            .load(sprite)
            .into(imgview)

        pokedexRetrofit.getPokemonDetails(type).enqueue(this)
        imgview.setOnClickListener{
            var intent_details = Intent(this@DetailActivity, MainActivity::class.java)
            startActivity(intent_details)
        }
    }
}
