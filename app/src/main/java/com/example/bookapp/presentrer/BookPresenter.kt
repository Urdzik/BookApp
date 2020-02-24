package com.example.bookapp.presentrer

import android.util.Log
import com.example.bookapp.BookContact
import com.example.bookapp.model.BookModel
import com.example.bookapp.model.network.Book
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class BookPresenter @Inject constructor(
    private var bookView: BookContact.View,
    private var model: BookModel
) : BookContact.Model.OnFinishedListener,
    BookContact.Presenter {

    lateinit var disposable: Disposable



    override fun onFinished(book: List<Book>) {
        bookView.retrieveData(book)
    }

    override fun onError(t: Throwable) {
        Log.d("one2", t.toString())
    }

    override fun requestData() {
        disposable = model.loadData(this)
    }

    override fun onDestroy() {
        disposable.dispose()
    }


}