package com.example.pemilihan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout


class Home : Fragment() {
    private lateinit var btn : RelativeLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        btn = view.findViewById(R.id.riwayat)
        val activity = getActivity()

        btn.setOnClickListener {
            val intent = Intent(activity, RiwayatPemilihan::class.java)
            startActivity(intent)
        }
    return view
    }
}