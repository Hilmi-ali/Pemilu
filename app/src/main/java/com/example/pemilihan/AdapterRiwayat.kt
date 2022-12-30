package com.example.pemilihan

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AdapterRiwayat (val listData : ArrayList<DataRiwayat>) :RecyclerView.Adapter<AdapterRiwayat.dataViewHolder>(){

    var itemKlik : ((DataRiwayat) -> Unit)? = null
    class dataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val desa : TextView = itemView.findViewById(R.id.desa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.riwayat, parent, false)
        return dataViewHolder(view)
    }

    override fun onBindViewHolder(holder: dataViewHolder, position: Int) {
        val data = listData[position]
        holder.desa.text = data.desa

        holder.itemView.setOnClickListener {
            itemKlik?.invoke(data)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}