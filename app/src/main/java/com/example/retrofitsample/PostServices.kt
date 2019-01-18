package com.example.retrofitsample

import retrofit2.Call
import retrofit2.http.GET

interface PostServices {

    @GET("posts")
    fun getPosts(): Call<List<PostModel>>

    @GET("users")
    fun getUsers(): Call<List<UserModel>>

}