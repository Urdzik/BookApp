package com.example.bookapp.model.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object BookObject {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl("https://raw.githubusercontent.com/Urdzik/helper/master/")
        .build()
    val bookService: BookApi = retrofit.create(BookApi::class.java)
}