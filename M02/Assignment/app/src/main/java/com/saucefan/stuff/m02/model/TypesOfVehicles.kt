package com.saucefan.stuff.m02.model

 class Helicopter(id:String) : Vehicle(id), AirTravel {

    override fun move(): String {
        return "$id can ${fly()}"
    }

    override fun fly() :  String {
        return "Fly()"
    }

}

class Car(id:String) : Vehicle(id), GroundTravel {

    override fun drive() :  String{
       return "Drive()"
    }

    override fun move(): String {
        return "$id can ${drive()}"
    }

}

class Boat(id:String) : Vehicle(id), WaterTravel {

    override fun move(): String {
        return "$id can ${sail()}"
    }

    override fun sail():  String {
        return "Sail()"
    }


}

class BoatCar(id:String) : Vehicle(id), WaterTravel, GroundTravel {

    override fun move(): String {
        return "$id can ${sail()} and ${drive()}"
    }
    override fun sail():  String {
        return "Sail()"
    }
    override fun drive() :  String{
        return "Drive()"
    }



}

class BondCar(id:String) : Vehicle(id), WaterTravel, GroundTravel, AirTravel {
    override fun fly() :  String {
        return "Fly()"
    }

    override fun move(): String {
        return "$id can ${fly()} and ${drive()} and ${sail()} "
    }

    override fun sail():  String {
        return "Sail()"
    }

    override fun drive() :  String{
        return "Drive()"
    }


}

class BoatPlane(id:String,weight:String) : Vehicle(id,weight), WaterTravel, AirTravel {
    override fun move(): String {
        return "$id can ${fly()} and  ${sail()} "
    }
    override fun fly() :  String {
        return "Fly()"
    }
    override fun sail():  String {
        return "Sail()"
    }


}