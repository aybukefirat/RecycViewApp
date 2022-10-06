package com.example.ArtApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RessamAdapter
    private lateinit var ressamListe : ArrayList<Ressamlar>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Ressamlar"
        setSupportActionBar(toolbar)

        var recycView: RecyclerView = findViewById(R.id.artists_rv)
        recycView.setHasFixedSize(true)
        recycView.layoutManager = LinearLayoutManager(this)

        ressamListe = ArrayList()
        val r1 = Ressamlar(1, "Vincent Van Gogh")
        val r2 = Ressamlar(2, "Salvador Dali")
        val r3 = Ressamlar(3, "Pablo Picasso")

        ressamListe.add(r1)
        ressamListe.add(r2)
        ressamListe.add(r3)

        adapter = RessamAdapter(this,ressamListe)

        recycView.adapter = adapter

    }
}