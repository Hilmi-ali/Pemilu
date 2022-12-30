package com.example.pemilihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

class DetailPemilihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemilihan)

        val btn1 : TextView = findViewById(R.id.Data)
        val btn2 : TextView = findViewById(R.id.Hasil)
        val hal1 : RecyclerView = findViewById(R.id.dataPemilih)
        val hal2 : LinearLayout = findViewById(R.id.hasilPemilihan)

        btn1.setOnClickListener {
            hal1.isVisible
            hal2.setVisibility(View.INVISIBLE)
        }
        btn2.setOnClickListener {
            hal2.isVisible
            hal1.setVisibility(View.INVISIBLE)
        }
    }
}