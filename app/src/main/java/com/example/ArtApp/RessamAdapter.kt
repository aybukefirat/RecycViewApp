package com.example.ArtApp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RessamAdapter ( private val mContext : Context, private val ressamListe : List<Ressamlar>)
    : RecyclerView.Adapter<RessamAdapter.CardDesignHolder>() {


    inner class CardDesignHolder(tasarim : View) : RecyclerView.ViewHolder(tasarim){

        var artists_card : CardView
        var artistsName : TextView

        init {
            artists_card = tasarim.findViewById(R.id.artists_card)
            artistsName = tasarim.findViewById(R.id.artistsName)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.artists_card_design, parent, false)
        return CardDesignHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val ressam = ressamListe.get(position)
        holder.artistsName.text = ressam.ressam_ad
        holder.artists_card.setOnClickListener {
            val intent = Intent(mContext,PaintingsActivity::class.java)
            intent.putExtra("ressamNesne", ressam)
            mContext.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return ressamListe.size
    }

}