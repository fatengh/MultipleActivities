package com.example.multipleactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        rv = findViewById(R.id.rv)
        val user=intent.extras?.get("user") as ArrayList<String>
        rv.adapter=MyAdap(user)
        rv.layoutManager=LinearLayoutManager(this)

    }
}