package com.saucefan.stuff.m02.model


//one abstract class
abstract class Vehicle(
    val id: String? = null,
    val weight: String? = null,
    val favorite: Boolean = false
    /// something:Something ;)
) {
    abstract fun move(): String
}


//three interfaces
interface AirTravel {
    fun fly():  String
}

interface WaterTravel {
    fun sail():  String
}

interface GroundTravel {
    fun drive():  String
}