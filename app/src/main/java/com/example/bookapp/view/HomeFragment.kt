package com.example.bookapp.view


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bookapp.BookContact
import com.example.bookapp.R
import com.example.bookapp.dagger.DaggerAppComponent
import com.example.bookapp.dagger.MainPresenterModule
import com.example.bookapp.model.BookModel
import com.example.bookapp.model.network.Book
import com.example.bookapp.presentrer.BookPresenter
import kotlinx.android.synthetic.main.fragment_home.view.*
import javax.inject.Inject

class HomeFragment : Fragment(), BookContact.View {
    lateinit var adapter: MainAdapter
    @Inject
    lateinit var presenter: BookPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        DaggerAppComponent.builder()
            .mainPresenterModule(MainPresenterModule(this, BookModel()))
            .build()
            .inject(this)

        adapter = MainAdapter(view.context)
        view.rv.adapter = adapter

        presenter.requestData()

        return view
    }

    override fun retrieveData(book: List<Book>) {
        adapter.submitList(book)
    }

    override fun onError(t: Throwable) {
        Log.d("one2", t.toString())
    }


}
