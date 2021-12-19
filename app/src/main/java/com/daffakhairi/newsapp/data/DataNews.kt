package com.daffakhairi.newsapp.data

import com.daffakhairi.newsapp.R
import java.util.ArrayList

object DataNews {
    private val titleAll = arrayOf(
        "contoh 1",
        "contoh 2",
        "contoh 3",
        "contoh 4",
        "contoh 5",
        "contoh 6",
        "contoh 7",
        "contoh 8",
        "contoh 9",
        "contoh 10",
    )

    private val contentAll = arrayOf(
        "ini adalah content 1",
        "ini adalah content 2",
        "ini adalah content 3",
        "ini adalah content 4",
        "ini adalah content 5",
        "ini adalah content 6",
        "ini adalah content 7",
        "ini adalah content 8",
        "ini adalah content 9",
        "ini adalah content 10",
    )

    private val dateAll = arrayOf(
        "2 januari 2021",
        "15 januari 2021",
        "19 januari 2021",
        "25 januari 2021",
        "28 januari 2021",
        "30 januari 2021",
        "1 februari 2021",
        "5 februari 2021",
        "17 februari 2021",
        "19 februari 2021",
    )

    private val authorAll = arrayOf(
        "hafiz anhar",
        "maulana rizki",
        "kirana tankiya",
        "supratno andiwijaya",
        "luna",
        "amelia waston",
        "sakura miko",
        "jaya wijaya",
        "ayu adelia",
        "hendi",
    )

    private val timeAll = arrayOf(
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
        "14:20 WIB",
    )

    private val photoAll = arrayOf(
        R.drawable.news_1,
        R.drawable.news_2,
        R.drawable.news_3,
        R.drawable.news_4,
        R.drawable.news_5,
        R.drawable.news_6,
        R.drawable.news_7,
        R.drawable.news_8,
        R.drawable.news_9,
        R.drawable.news_10,
    )

    private val categoryAll = arrayOf(
        "All News",
        "All News",
        "All News",
        "All News",
        "All News",
        "All News",
        "All News",
        "All News",
        "All News",
        "All News",
    )

    // properti ini digunakan untuk handle menampilkan data di dalam list nanti
    // return value adalah value dari list news
    val dataAllNews : ArrayList<News>
    // digunakan untuk mendapatkan get value dan dimasukan kedalam dataAllNews
    get() {
        val listNews = arrayListOf<News>()
        for (position in titleAll.indices){
            val news = News(
                title = titleAll[position],
                content = contentAll[position],
                date = dateAll[position],
                time = timeAll[position],
                category = categoryAll[position],
                author = authorAll[position],
                photo = photoAll[position],
            )
            // untuk memasukan data ke dalam listNews
            listNews.add(news)
        }
        return listNews
    }
}