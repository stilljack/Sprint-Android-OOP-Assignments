package com.saucefan.stuff.m04pokebinding.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

import com.saucefan.stuff.m04pokebinding.model.PokeForms
import com.saucefan.stuff.m04pokebinding.model.Sprites


class LoginViewModel : BaseObservable() {

    private var poke: PokeForms? = null
    private var pokeSprite:Sprites? = null
    init {
        pokeSprite = Sprites("","","","")
        poke = PokeForms(1,"",pokeSprite as Sprites)
    }

    @Bindable
    fun getName():String? {
        return poke?.name ?: "name not found"
    }

    @Bindable
    fun getID():Int? {
        return poke?.id  ?: 152 // out of bounds, in joke
    }

    @Bindable
    fun getSprite():String? {
        return poke?.sprites?.front_default ?: "Sprite not found"
    }


}