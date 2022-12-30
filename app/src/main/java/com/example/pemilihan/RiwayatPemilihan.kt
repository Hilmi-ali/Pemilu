package com.example.pemilihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RiwayatPemilihan : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataRiwayat: ArrayList<DataRiwayat>
    lateinit var desa: Array<String>
    private lateinit var adapter: AdapterRiwayat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pemilihan)

        desa = arrayOf(
            "Desa Kutasari",
            "Desa Wringinharjo",
            "Desa Caruy"
        )

        recyclerView = findViewById(R.id.riwayatRecy)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = adapter

        adapter.itemKlik = {
            val intent = Intent(this, DetailPemilihan::class.java)
            startActivity(intent)
        }

    }
}