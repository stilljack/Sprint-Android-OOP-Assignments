package com.saucefan.stuff.m01assignment

import android.util.Log
import android.database.sqlite.SQLiteOpenHelper



open class ShoppingItem(open val colorId:Int, val productName:String) {
    var getPN = productName
    open fun getDisplayName(): String {
        return getPN
    }
}

class Electronics(colorId:Int = 104444, productName:String): ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return "$getPN+electronics"
    }
}

class Groceries(colorId:Int= 555500, productName:String): ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return "$getPN+Groceries"
    }
}

class Dresses(colorId:Int= 660066, productName:String): ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return "$getPN+electronics"
    }
}


object ItemMockData : ArrayList<ShoppingItem>(
    arrayListOf(
        Electronics(
            colorId =  1,
            productName = "elec1"
        ),
        Electronics(
            colorId =  1,
            productName = "elec2"
        ),
        Groceries(
            colorId =  1,
            productName = "groceries1"
        ),
        Groceries(
            colorId =  1,
            productName = "groceries2"
        ),
        Dresses(
            colorId =  1,
            productName = "dresses1"
        ),
        ShoppingItem(
            colorId =  100000,
            productName = "ShoppingItem"
        )
    )
)