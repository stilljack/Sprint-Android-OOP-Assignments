package com.saucefan.stuff.m02

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_gererics.*


class Gererics : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gererics)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }




    }


    override fun onStart() {
        super.onStart()
        val observable = Observable.just(mark(),"Beta",)
        val observable = Observable.just("alpha","Beta",)
        val sauce =observable.subscribe(){string->println("the observable returned $string")}

        open class Person
        class Mark: Person()
        class Alan: Person()
        personObservable.subscribe(Mark(),Alan())

        class NetworkApi {
            companion object {
                fun getListOfPeople(): Observable<List<Person>> {

                    return Observable.just(listOf(Mark(),Alan()))
                }



            }
        }


    }

}
