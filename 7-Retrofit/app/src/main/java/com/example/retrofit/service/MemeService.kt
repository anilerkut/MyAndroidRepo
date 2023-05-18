package com.example.retrofit.service

import com.example.retrofit.models.Meme
import retrofit2.Call
import retrofit2.http.GET

interface MemeService {

    @GET("/get_memes")
    fun getMemes() : Call<Meme>
}