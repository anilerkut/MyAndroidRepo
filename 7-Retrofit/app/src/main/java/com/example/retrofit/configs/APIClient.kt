package com.example.retrofit.configs

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    private val Base_URL = "https://api.imgflip.com"
    var retrofit: Retrofit? = null

    fun getClient() : Retrofit {
        if ( retrofit == null ) {
            retrofit = Retrofit
                .Builder()
                .baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit as Retrofit
    }
}