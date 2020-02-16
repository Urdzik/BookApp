package com.example.bookapp

import com.example.bookapp.model.network.Book
import io.reactivex.disposables.Disposable

interface BookContact {
    interface Model {
        interface OnFinishedListener {
            fun onFinished(book: List<Book>)

            fun onError(t: Throwable)
        }

        fun loadData(onFinishedListener: OnFinishedListener): Disposable
    }

    interface Presenter {
        fun requestData()

        fun onDestroy()
    }

    interface View {
        fun retrieveData(book: List<Book>)

        fun onError(t: Throwable)

    }


}