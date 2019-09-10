package com.saucefan.stuff.m02.model

 class Helicopter(id:String) : Vehicle(id), AirTravel {
     val type ="helicopter"
    override fun travel(): String {
        return "$type $id can ${fly()}"
    }

    override fun fly() :  String {
        return "Fly()"
    }

}

class Car(id:String) : Vehicle(id), GroundTravel {
    val type ="car"
    override fun drive() :  String{
       return "Drive()"
    }

    override fun travel(): String {
        return "$type cam $id can ${drive()}"
    }

}

class Boat(id:String) : Vehicle(id), WaterTravel {
    val type ="boat"
    override fun travel(): String {
        return "$type $id can ${sail()}"
    }

    override fun sail():  String {
        return "Sail()"
    }


}

class BoatCar(id:String) : Vehicle(id), WaterTravel, GroundTravel {
    val type ="boatcar"
    override fun travel(): String {
        return "$type $id can ${sail()} and ${drive()}"
    }
    override fun sail():  String {
        return "Sail()"
    }
    override fun drive() :  String{
        return "Drive()"
    }



}



open class BoatPlane(id:String,weight:String) : Vehicle(id,weight), WaterTravel, AirTravel {
    open val type ="boatplane"
    override fun travel(): String {
        return "$type $id can ${fly()} and  ${sail()} "
    }
    override fun fly() :  String {
        return "Fly()"
    }
    override fun sail():  String {
        return "Sail()"
    }


}

class BondCar(id:String,weight:String) : BoatPlane(id, weight), GroundTravel {
// we also pick up the need for a weight constructor
    override fun travel(): String {
        return "$type $id can ${fly()} and ${drive()} and ${sail()} "
    }

    override fun drive() :  String{
        return "Drive()"
    }


}