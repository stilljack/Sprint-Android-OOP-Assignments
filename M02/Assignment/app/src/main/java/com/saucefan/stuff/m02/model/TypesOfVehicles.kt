package com.saucefan.stuff.m02.model

 class Helicopter : Vehicle(), AirTravel {
    override fun move(): String {
        return "$id can ${fly()}"
    }

    override fun fly() :  String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Car() : Vehicle(), GroundTravel {
    override fun drive() :  String{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class Boat() : Vehicle(), WaterTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail():  String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class BoatCar() : Vehicle(), WaterTravel, GroundTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail() :  String{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun drive():  String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class BondCar() : Vehicle(), WaterTravel, GroundTravel, AirTravel {
    override fun fly() :  String{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail() :  String{
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun drive():  String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class BoatPlane() : Vehicle(), WaterTravel, AirTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fly():  String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail():  String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}