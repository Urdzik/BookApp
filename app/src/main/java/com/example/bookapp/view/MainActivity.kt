package com.example.bookapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Вот так вот
        setContentView(R.layout.activity_main)
    }
}
