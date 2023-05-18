package com.example.retrofit.models

data class Meme (
    val success: Boolean,
    val data: Data
)

data class Data (
    val memes: List<MemeElement>
)

data class MemeElement (
    val id: String,
    val name: String,
    val url: String,
    val width: Long,
    val height: Long,
    val boxCount: Long,
    val captions: Long
)
