package com.example.pemilihan

import android.os.Parcel
import android.os.Parcelable

data class DataRiwayat (

    var desa : String,
    var status : String
)
    : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(desa)
        parcel.writeString(status)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataRiwayat> {
        override fun createFromParcel(parcel: Parcel): DataRiwayat {
            return DataRiwayat(parcel)
        }

        override fun newArray(size: Int): Array<DataRiwayat?> {
            return arrayOfNulls(size)
        }
    }
}