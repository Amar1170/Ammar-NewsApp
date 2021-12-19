package com.daffakhairi.newsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daffakhairi.newsapp.data.DataNews
import com.daffakhairi.newsapp.data.News
import kotlinx.android.synthetic.main.fragment_all_news.view.*

class AllNewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all_news, container, false)

        view.rv_all_news.layoutManager = LinearLayoutManager(context)
        view.rv_all_news.adapter = NewsAdapter(DataNews.dataAllNews)
        // Inflate the layout for this fragment
        return view
    }

}