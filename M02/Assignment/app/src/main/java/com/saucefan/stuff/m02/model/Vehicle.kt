package com.saucefan.stuff.m02.model


//one abstract class
abstract class Vehicle(
    id: String,
    weight: String,
    favorite: Boolean
    /// something:Something ;)
) {
    abstract fun move(): String
}


//three interfaces
interface AirTravel {
    fun fly()
}

interface WraterTravel {
    fun sail()
}

interface GroundTravel {
    fun drive()
}