package com.saucefan.stuff.mo3generics

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
data class Movies (
    val releaseDate:Int,
    val title:String,
    val language:String,
    val imdbrating:Int

)
class mockApi {
        companion object{
            fun getMovieList(): Observable<List<Movies>> {
                return Observable.just(
                    listOf<Movies>(
                    Movies(1996,
                        "That one movie",
                        "English",
                        4),
                    Movies(2019,
                        "Battle Angel Alita",
                        "Jack was the only one who liked this movie",
                        1),
                    Movies(2000,
                        "That other movie",
                        "English",
                        10),
                    Movies(1938,
                        "El Movieo",
                        "Spanish",
                        7),
                    Movies(1997,
                        "and we're done here",
                        "English",
                        8)
                ))
            }

        }

    }
/*    val person = Person(
        height = "228",
        mass = "112",
        hairColor = "brown",
        skinColor = "unknown",
        eyeColor = "blue"
    )*/

 /*   val mockMovieCall = object : Call<Movies> {
        override fun enqueue(callback: Callback<Movies>) {
            val response = Response.success(Movies)
            callback.onResponse(this, response)
        }
        override fun isExecuted(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        override fun clone(): Call<Movies> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        override fun isCanceled(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        override fun cancel() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        override fun execute(): Response<Movies> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
*/





/*    Task 9
Create a dummy network API like the one in the guided project to return four movies with custom attributes such as year of release,
title, language, imdb rating (feel free to be creative here!, you will need to create a data class for Movie to start this task)
Make a call to this NetworkAPI to fetch the movie data and then observe the response and print it to the console.

*/





/* class Factory {
            companion object {
                fun create(): mockApi {
                    return object : mockApi {
                         fun getMovie(id: Int): Call<Movies> {
                            return mockMovieCall
                        }
                    }
                }
            }
        }*/