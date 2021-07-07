package com.saucefan.stuff.mo3generics

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.saucefan.stuff.mo3generics.mockApi.Companion.getMovieList
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onStart() {
        super.onStart()
        getMovieList().subscribe() {
            println(it)
        }
        /*    Task 1
      Create a simple example of a mutableList that takes strings as parameters.
      Try adding an integer to the list and see what happens and fix any potential issues.*/
        /*
 Task 7
    Create an observable that emits 3 objects of type Int
    To finish this task, you will need to import rxjava, rxAndroid dependencies using gradle.
*/

        var observableInt = Observable.just("1", "2", "3")
        var observableActors = Observable.just(
            BradPit("id", "never talk about fight club"),
            TomCruise("notid", "impossible")
        )

        /*  Task 8


        Create an observable that emits objects of a custom data class Actor
        To finish this task, create two actors Tom Cruise, Brad Pitt and return these objects using an observable.*/
        observableActors.subscribe() {
            println(it.toString())
        }


        val exampleMutableList = mutableListOf<String>("1")
        //I can't add an int of course!
        //    stringClass(1) cant do that either

        //STEP 4 exposure
        val step4 = containerClass(this).stringCheck("bah hum bug")
        exampleMutableList.add(step4)
        Toast.makeText(this, "$step4 -- step4 worked", Toast.LENGTH_LONG).show()

    }

    /*       Task 2
Create a class that accepts a particular type.
Define the class and the type and see what happens when you pass an object that is of type other than the given one.*/
    class stringClass(str: String) {
        var getter: String = str

        fun doTheThing(): String {
            getter += "stringclass.dothething()"
            return getter
        }
    }


    /*        Task 3
    Create a Function that can specify the type of arguments it can accept
    Check to see what happens if you pass on object that is not of this type.*/


    class containerClass(context: Context) {
        fun stringCheck(str: String): String {
            return str + "altered by containerClass.stringCheck()"
        }

        fun <T> getter(t: T, context: Context) {
            Toast.makeText(
                context,
                "$t was pssed to the getter method successfully",
                Toast.LENGTH_SHORT
            ).show()

            /*        Task 4
         Steps
         Create a function that returns a certain type
         Expose this function to another class which can then directly call this function and retrive the object returned by the function*/


        }
    }

    /*
Steps

Enforce Generic Constraints by creating a class and denoting the type of objects it can hold.
To finish this task 5, create a class Phone that only accepts objects of type CellularService.
*/
/*    Steps

Enforce restricted types for a class to related types of objects.
To finish task 6, after task 5, refactor class Phone so that it can accept two types of CellularService like TMobile and Verizon.*/
    open class CellularService(val id: String)

    open class Person()
    open class Actor(open val id: String) : Person()
    data class TomCruise(override var id: String, val misson: String) : Actor(id)
    data class BradPit(override var id: String, val fightClub: String) : Actor(id)

    class Tmobile(id: String) : CellularService(id)
    class Verizon(id: String) : CellularService(id)
    class Phone<T : CellularService>() {
        fun ringRing(T: CellularService) {


        }
    }


}



