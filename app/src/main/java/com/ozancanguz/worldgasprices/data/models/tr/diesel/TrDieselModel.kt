package com.ozancanguz.worldgasprices.data.models.tr.diesel


import com.google.gson.annotations.SerializedName

data class TrDieselModel(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("result")
    val result: List<TrDieselResult>,
    @SerializedName("success")
    val success: Boolean
)