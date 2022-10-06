package com.example.ArtApp

import java.io.Serializable

data class Paintings( var tablo_id : Int,
                      var tablo_adi: String,
                      var tablo_yil : Int,
                      var tablo_resim: String,
                      var tablo_ressam : Ressamlar) : Serializable{

}
