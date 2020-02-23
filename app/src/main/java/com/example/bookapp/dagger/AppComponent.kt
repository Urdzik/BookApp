package com.example.bookapp.dagger

import com.example.bookapp.view.HomeFragment
import dagger.Component

@Component(modules = [MainPresenterModule::class])
interface AppComponent {
    fun inject(homeFragment: HomeFragment)
}