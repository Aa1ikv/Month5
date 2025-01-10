package com.example.month5

import android.os.Parcel

interface CounterContract {
    fun showCount(count: String)
    fun showToast(message: String)
    fun changeTextColor(color: Int)

    open fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    open fun writeToParcel(parcel: Parcel, flags: Int) {}
}