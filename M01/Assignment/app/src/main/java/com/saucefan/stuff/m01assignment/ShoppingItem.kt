package com.saucefan.stuff.m01assignment

import android.util.Log
import android.database.sqlite.SQLiteOpenHelper



open class ShoppingItem(open val colorId:Int, val productName:String) {
    var getPN = productName
    open fun getDisplayName(): String {
        return getPN
    }
}

class Electronics(colorId:Int, productName:String): ShoppingItem(colorId, productName) {
    override val colorId = 104444
    override fun getDisplayName(): String {
        return "$getPN+electronics"
    }
}

class Groceries(colorId:Int, productName:String): ShoppingItem(colorId, productName) {
    override val colorId = 555500
    override fun getDisplayName(): String {
        return "$getPN+Groceries"
    }
}

class Dresses(colorId:Int, productName:String): ShoppingItem(colorId, productName) {
    override val colorId = 660066
    override fun getDisplayName(): String {
        return "$getPN+electronics"
    }
}
