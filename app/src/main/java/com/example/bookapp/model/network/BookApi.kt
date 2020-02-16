package com.example.bookapp.model.network

import com.example.bookapp.model.network.Book
import io.reactivex.Single
import retrofit2.http.GET

interface BookApi{
    @GET("book.json")
    fun message(): Single<List<Book>>
}