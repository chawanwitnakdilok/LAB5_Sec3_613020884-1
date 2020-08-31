package com.example.lab5intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
    data class student (val id:String, val name: String, var age: Int) : Parcelable