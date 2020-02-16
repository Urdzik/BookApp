package com.example.bookapp.model.network

data class Book(
    val title : String,
    val text : String,
    val author : String,
    val genre : String,
    val volume : String,
    val date : String,
    val url : String,
    val rating : Rating
)

data class Rating (

    val litres : Double,
    val liveLib : Double
)