package com.saucefan.stuff.m02.model


//one abstract class
abstract class Vehicle(
    val id: String? = null,
    val weight: String? = null,
    var favorite: Boolean = false
    /// something:Something ;)
) {
    abstract fun travel(): String
}


//three interfaces
interface AirTravel {
    fun fly():  String
    fun typeMethod():String { return "air" }
}

interface WaterTravel {
    fun sail():  String
    fun typeMethod():String { return "water" }
}

interface GroundTravel {
    fun drive():  String
    fun type():String { return "ground" }
}