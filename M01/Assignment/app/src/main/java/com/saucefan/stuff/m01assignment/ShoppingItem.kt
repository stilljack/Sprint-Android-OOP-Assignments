package com.saucefan.stuff.m01assignment

import android.util.Log
import android.database.sqlite.SQLiteOpenHelper



open class ShoppingItem(open val colorId:String, val productName:String) {
    var getPN = productName
    open fun getDisplayName(): String {
        return getPN
    }
}

class Electronics(colorId:String, productName:String): ShoppingItem(colorId, productName) {
    override val colorId  = "104444"
    override fun getDisplayName(): String {
        return "$getPN+electronics"
    }
}

class Groceries(colorId:String, productName:String): ShoppingItem(colorId, productName) {
    override val colorId = "555500"
        override fun getDisplayName(): String {
        return "$getPN+Groceries"
    }
}

class Dresses(colorId:String, productName:String): ShoppingItem(colorId, productName) {
    override val colorId = "660066"
    override fun getDisplayName(): String {
        return "$getPN+dresses"
    }
}


object ItemMockData : ArrayList<ShoppingItem>(
    arrayListOf(
        Electronics(
            colorId =  "000000",
            productName = "1elec1"
        ),
        Electronics(
            colorId =  "000000",
            productName = "2elec2"
        ),
        Groceries(
            colorId =  "000000",
            productName = "1groceries1"
        ),
        ShoppingItem(
            colorId =  "000000",
            productName = "shopshops"
        ),
        Groceries(
            colorId =  "000000",
            productName = "2groceries2"
        ),
        Dresses(
            colorId =  "000000",
            productName = "1dresses1"
        ),
        ShoppingItem(
            colorId =  "000000",
            productName = "si"
        )
    )
)