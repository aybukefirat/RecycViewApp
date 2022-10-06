package com.example.ArtApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val resim = Intent().getSerializableExtra("resimNesne") as Paintings

        var textViewResimAd : TextView = findViewById(R.id.textViewResimAd)
        textViewResimAd.text = resim.tablo_adi

        var textViewResimYil : TextView = findViewById(R.id.textViewResimYil)
        textViewResimYil.text =(resim.tablo_yil).toString()

        var textViewRessam : TextView = findViewById(R.id.textViewRessam)
        textViewRessam.text = resim.tablo_ressam.ressam_ad

        var imageViewResim : ImageView = findViewById(R.id.imageViewResim)
        imageViewResim.setImageResource(resources.getIdentifier(painting.tablo_resim,
            "drawable",packageName))



    }
}