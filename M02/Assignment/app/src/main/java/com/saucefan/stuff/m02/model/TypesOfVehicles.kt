package com.saucefan.stuff.m02.model

 class Helicopter : Vehicle(), AirTravel {
    override var id= "1"
    override fun move(): String {
        return "$id can ${fly()}"
    }

    override fun fly() :  String {
        return "Fly()"
    }

}

class Car() : Vehicle(), GroundTravel {
    override var id= "2"
    override fun drive() :  String{
       return "Drive()"
    }

    override fun move(): String {
        return "$id can ${drive()}"
    }

}

class Boat() : Vehicle(), WaterTravel {
    override var id= "3"
    override fun move(): String {
        return "$id can ${sail()}"
    }

    override fun sail():  String {
        return "Sail()"
    }


}

class BoatCar() : Vehicle(), WaterTravel, GroundTravel {
    override var id= "4"
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

class BondCar(id:String) : Vehicle(), WaterTravel, GroundTravel, AirTravel {
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

class BoatPlane(weight:String) : Vehicle(weight), WaterTravel, AirTravel {
    override var id= "5"
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