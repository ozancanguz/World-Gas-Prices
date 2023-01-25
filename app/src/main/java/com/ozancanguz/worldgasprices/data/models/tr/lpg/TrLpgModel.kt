package com.ozancanguz.worldgasprices.data.models.tr.lpg


import com.google.gson.annotations.SerializedName

data class TrLpgModel(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("result")
    val result: List<TrLpgResult>,
    @SerializedName("success")
    val success: Boolean
)