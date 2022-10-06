package com.example.ArtApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class PaintingsActivity : AppCompatActivity() {

    private lateinit var adapter: PaintingsAdapter
    private lateinit var paintingListe : ArrayList<Paintings>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paintings)

        val ressam = Intent().getSerializableExtra("ressamNesne")

        var toolbar2: Toolbar = findViewById(R.id.toolbar2)
        toolbar2.title = "Eserler"
        setSupportActionBar(toolbar2) as Ressamlar

        var recycView2: RecyclerView = findViewById(R.id.paintings_rv)
        recycView2.setHasFixedSize(true)
        recycView2.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        paintingListe = ArrayList()
        val r1 = Ressamlar(1, "Vincent Van Gogh")

        val p1 = Paintings(1, "Selvili ve Yıldızlı Yol",1890, "vangogh1",r1)
        val p2 = Paintings(1, "Ayçiçekleri",1887, "vangogh2",r1)

        paintingListe.add(p1)
        paintingListe.add(p2)

        recycView2.adapter=adapter
    }
}