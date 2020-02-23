package com.example.bookapp.dagger

import android.app.Application
import com.example.bookapp.model.BookModel
import com.example.bookapp.view.HomeFragment

class App: Application(){
   companion object{
       lateinit var component: AppComponent
   }
    override fun onCreate() {
        super.onCreate()

    }
}