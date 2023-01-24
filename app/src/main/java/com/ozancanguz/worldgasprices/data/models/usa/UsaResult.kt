package com.ozancanguz.worldgasprices.data.models.usa


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UsaResult(
    @SerializedName("currency")
    val currency: String,
    @SerializedName("diesel")
    val diesel: String,
    @SerializedName("gasoline")
    val gasoline: String,
    @SerializedName("midGrade")
    val midGrade: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("premium")
    val premium: String
):Parcelable