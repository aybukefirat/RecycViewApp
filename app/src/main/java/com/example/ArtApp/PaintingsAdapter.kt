package com.example.ArtApp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class PaintingsAdapter (private val mContext: Context, private val resimlerListe : List<Paintings>)
    : RecyclerView.Adapter<PaintingsAdapter.CardDesignHolder2>() {

    inner class CardDesignHolder2(tasarim : View) : RecyclerView.ViewHolder(tasarim){

        var painting_card : CardView
        var imageViewPainting : ImageView
        var textViewPainting : TextView

        init {
            painting_card = tasarim.findViewById(R.id.painting_card)
            imageViewPainting = tasarim.findViewById(R.id.imageViewPainting)
            textViewPainting = tasarim.findViewById(R.id.textViewPainting)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder2 {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.paintings_card_design, parent, false)
        return CardDesignHolder2(tasarim)
    }

    override fun onBindViewHolder(holder: CardDesignHolder2, position: Int) {
        val painting = resimlerListe.get(position)
        holder.imageViewPainting.setImageResource(mContext.resources.getIdentifier(painting.tablo_resim,
            "drawable", mContext.packageName))
        holder.textViewPainting.text = painting.tablo_adi
        holder.painting_card.setOnClickListener {

            val intent = Intent(mContext,DetailActivity::class.java)
            intent.putExtra("resimNesne", painting)
            mContext.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return resimlerListe.size
    }
}