package com.example.bookapp.presentrer

import android.util.Log
import com.example.bookapp.BookContact
import com.example.bookapp.model.BookModel
import com.example.bookapp.model.network.Book
import io.reactivex.disposables.Disposable

class BookPresenter(private val bookView: BookContact.View) : BookContact.Model.OnFinishedListener,
    BookContact.Presenter {

    private val model = BookModel()
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