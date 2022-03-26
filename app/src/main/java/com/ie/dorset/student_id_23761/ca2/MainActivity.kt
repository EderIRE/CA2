package com.ie.dorset.student_id_23761.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*



class MainActivity : AppCompatActivity() {



    private var layoutManager: LayoutManager? = null
    private var adapter: Adapter<RecycleAdapter.ViewHolder> ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       layoutManager = LinearLayoutManager(this )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = layoutManager

        adapter = RecycleAdapter()
        recyclerView.adapter = adapter








    }




}