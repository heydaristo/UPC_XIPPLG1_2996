package com.example.upc_xipplg1_2996

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgbtnTerong = findViewById<ImageButton>(R.id.image_Terong)
        val imgbtnSelada = findViewById<ImageButton>(R.id.image_Selada)
        val imgbtnCabai = findViewById<ImageButton>(R.id.image_Cabai)
        val imgbtnWortel = findViewById<ImageButton>(R.id.image_Wortel)
        val imgbtnBawang = findViewById<ImageButton>(R.id.image_Bawang)
        val imgbtnTomat = findViewById<ImageButton>(R.id.image_Tomat)

        imgbtnTerong.setOnClickListener {
            val intent = Intent(this, TerongActivity::class.java)
            startActivity(intent)
        }
        imgbtnCabai.setOnClickListener {
            val intent = Intent(this, CabaiActivity::class.java)
            startActivity(intent)
        }
        imgbtnBawang.setOnClickListener {
            val intent = Intent(this, BawangActivity::class.java)
            startActivity(intent)
        }
        imgbtnSelada.setOnClickListener {
            val intent = Intent(this, SeladaActivity::class.java)
            startActivity(intent)
        }
        imgbtnTomat.setOnClickListener {
            val intent = Intent(this, TomatActivity::class.java)
            startActivity(intent)
        }
        imgbtnWortel.setOnClickListener {
            val intent = Intent(this, WortelActivity::class.java)
            startActivity(intent)
        }
    }
}