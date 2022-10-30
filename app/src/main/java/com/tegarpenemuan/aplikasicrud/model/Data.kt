package com.tegarpenemuan.aplikasicrud.model

data class Data(
    val created_at: String,
    val description: String,
    val id: Int,
    val image_url: String,
    val name: String,
    val price: String,
    val updated_at: String
)