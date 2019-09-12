package com.saucefan.stuff.m04pokebinding.viewmodel

import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.library.baseAdapters.BR

import com.saucefan.stuff.m04pokebinding.model.PokeForms
import com.saucefan.stuff.m04pokebinding.model.Sprites


class PokeViewModel : BaseObservable() {

    private var poke: PokeForms? = null

    init {
        poke = PokeForms(1,"",Sprites("","","",""))
    }

    @Bindable
    var toastMessage: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.toastMessage)
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
    fun onImageClicked() {
        toastMessage = "at least we got something to work"
    }

}