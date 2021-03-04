package com.tech.mynewstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)setting Layout Manager
        my_recycler_view.layoutManager = LinearLayoutManager(this)


        var list = getData()

        //passing data to recyclerView
        var adapter = MyRecyclerView(list)

        //2 setting adater to recyclerView
        my_recycler_view.adapter = adapter
    }

    fun getData(): MutableList<String> {
        var list = mutableListOf<String>()
        for (i in 1..100) {
            list.add("hello $i")
        }
        return list
    }
}