package com.ozancanguz.worldgasprices.data.models.tr.gasoline


import com.google.gson.annotations.SerializedName

data class TrGasolineModel(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("result")
    val result: List<TrGasolineResult>,
    @SerializedName("success")
    val success: Boolean
)