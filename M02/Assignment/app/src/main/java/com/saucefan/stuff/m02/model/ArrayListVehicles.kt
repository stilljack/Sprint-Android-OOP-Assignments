package com.saucefan.stuff.m02.model

object ArrayListVehicles {


    val vehicleArrayList = arrayListOf<Vehicle>(
        Helicopter("1"),
        Boat("2"),
        BondCar(id = "007", weight = "v heavy"),
        BoatCar("3"),
        Car("4"),
        BoatPlane("3", "3 hundo"),

        Helicopter("11"),
        Boat("222"),
        BondCar("008", "light as a feather"),
        BoatCar("23"),
        Car("14"),
        BoatPlane("32", "55 hundo")
    )


    private val COUNT = 25

    val ITEMS: MutableList<Vehicle> = vehicleArrayList

    var ITEM_MAP: MutableMap<String, Vehicle> = HashMap()

    init {
        buildList()
    }

    fun buildList() {
        ITEM_MAP = HashMap()
        for (i in 1..vehicleArrayList.size) {
            addItem(vehicleArrayList[i])
        }
    }
    private fun addItem(item: Vehicle) {
        ITEMS.add(item)
        if (item.id != null) {
            ITEM_MAP.put(item.id as String, item)
        }
    }
}