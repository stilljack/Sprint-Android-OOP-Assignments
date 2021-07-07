package com.lambdaschool.abstractionintpoly.model

import java.io.Serializable

// TODO 1: S05M02-1 Add Parent Model Object

abstract class SwApiObject (
    open var name:String?=null,
    open val url: String? = null,
    open var id: Int = 0,
    open var category:String =""

): Serializable {

    open fun info() : String = "A star wars object"

    override fun toString(): String {
        return "Swapiobject(name=$name, url=$url,id=$id,category=$category"
    }
}