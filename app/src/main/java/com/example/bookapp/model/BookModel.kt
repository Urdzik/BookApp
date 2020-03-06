package com.example.bookapp.model

import com.example.bookapp.BookContact.Model
import com.example.bookapp.BookContact.Model.OnFinishedListener
import com.example.bookapp.model.network.BookObject
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class BookModel : Model {
    override fun loadData(onFinishedListener: OnFinishedListener): Disposable =
        BookObject.bookService.message()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onFinishedListener.onFinished(it)
            }, {
                onFinishedListener.onError(it)
            })


}





