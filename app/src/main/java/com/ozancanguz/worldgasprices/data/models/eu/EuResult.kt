package com.ozancanguz.worldgasprices.data.models.eu


import com.google.gson.annotations.SerializedName

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
)