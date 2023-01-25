package com.ozancanguz.worldgasprices.data.models.eu


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EuResult(
    @SerializedName("country")
    val country: String,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("diesel")
    val diesel: String,
    @SerializedName("gasoline")
    val gasoline: String,
    @SerializedName("lpg")
    val lpg: String
):Parcelable