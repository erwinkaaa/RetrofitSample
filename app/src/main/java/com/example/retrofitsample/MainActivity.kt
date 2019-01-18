package com.example.retrofitsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postServices = DataRepository.create()
        postServices.getUsers().enqueue(object : Callback<List<UserModel>> {

            override fun onResponse(call: Call<List<UserModel>>, response: Response<List<UserModel>>) {
                if (response.isSuccessful) {
                    val data = response.body()
                    Log.d("tag", "responsennya ${data?.size}")

                    data?.map {
                        Log.d("tag", "datanya ${it.company.catchPhrase}")
                    }
                }
            }

            override fun onFailure(call: Call<List<UserModel>>, error: Throwable) {
                Log.e("tag", "errornya ${error.message}")
            }
        })
    }
}
