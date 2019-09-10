package com.saucefan.stuff.m02.model

class Helicopter(id:String, weight:String, favorite:Boolean) : Vehicle(id,weight,favorite), AirTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fly() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Car(id:String, weight:String, favorite:Boolean) : Vehicle(id,weight,favorite), GroundTravel {
    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class Boat(id:String, weight:String, favorite:Boolean) : Vehicle(id,weight,favorite), WaterTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class BoatCar(id:String, weight:String, favorite:Boolean) : Vehicle(id,weight,favorite), WaterTravel, GroundTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

class BondCar(id:String, weight:String, favorite:Boolean) : Vehicle(id,weight,favorite), WaterTravel, GroundTravel, AirTravel {
    override fun fly() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class BoatPlane(id:String, weight:String, favorite:Boolean) : Vehicle(id,weight,favorite), WaterTravel, AirTravel {
    override fun move(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fly() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sail() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}