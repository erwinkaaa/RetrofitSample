package com.example.retrofitsample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataRepository {

    var BASE_URL : String = "https://jsonplaceholder.typicode.com/"

    fun create(): PostServices {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return retrofit.create(PostServices::class.java)
    }
}