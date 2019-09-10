package com.saucefan.stuff.m02.model

 class Helicopter : Vehicle(), AirTravel {
    override fun move(): String {
        return "$id can ${fly()}"
    }

    override fun fly() :  String {
        return "Fly()"
    }

}

class Car() : Vehicle(), GroundTravel {
    override fun drive() :  String{
       return "Drive()"
    }

    override fun move(): String {
        return "$id can ${drive()}"
    }

}

class Boat() : Vehicle(), WaterTravel {
    override fun move(): String {
        return "$id can ${sail()}"
    }

    override fun sail():  String {
        return "Sail()"
    }


}

class BoatCar() : Vehicle(), WaterTravel, GroundTravel {
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

class BondCar() : Vehicle(), WaterTravel, GroundTravel, AirTravel {
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

class BoatPlane() : Vehicle(), WaterTravel, AirTravel {
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