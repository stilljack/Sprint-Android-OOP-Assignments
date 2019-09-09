package com.saucefan.stuff.m01assignment

import android.util.Log

open class ShoppingItem(val colorId:Int, val productName:String) {
    var getPN = productName
    fun getDisplayName(): String {
        return getPN
    }
}

class Electronics(colorId:Int, productName:String): ShoppingItem(colorId, productName) {

}

class Groceries(colorId:Int, productName:String): ShoppingItem(colorId, productName) {

}

class Dresses(colorId:Int, productName:String): ShoppingItem(colorId, productName) {

}