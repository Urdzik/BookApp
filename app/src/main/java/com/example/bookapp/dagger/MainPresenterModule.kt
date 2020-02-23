package com.example.bookapp.dagger

import com.example.bookapp.BookContact
import com.example.bookapp.model.BookModel
import dagger.Module
import dagger.Provides

@Module
class MainPresenterModule(var view: BookContact.View, var module: BookModel) {

    @Provides
    fun provideBookContact(): BookContact.View = view

    @Provides
    fun provideBookModule(): BookModel = module

}