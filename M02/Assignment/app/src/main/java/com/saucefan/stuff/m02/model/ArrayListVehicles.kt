package com.saucefan.stuff.m02.model

object ArrayListVehicles {


    val vehicleArrayList = arrayListOf<Vehicle>(
    Helicopter(), Boat(), BondCar(id="007"), BoatCar(), Car(), BoatPlane("3 hundo")
)



  private val COUNT = 25

    val ITEMS: MutableList<Vehicle> =  vehicleArrayList

    val ITEM_MAP: MutableMap<String, Vehicle> = HashMap()
 init {
      for (i in 1..vehicleArrayList.size) {
         addItem(vehicleArrayList[i]) }
  }
  private fun addItem(item: Vehicle) {
      ITEMS.add(item)
      if (item.id != null) {
          ITEM_MAP.put(item.id as String, item)
      }
  }
}