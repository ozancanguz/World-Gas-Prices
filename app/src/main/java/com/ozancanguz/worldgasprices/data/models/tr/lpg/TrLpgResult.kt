package com.ozancanguz.worldgasprices.data.models.tr.lpg


import com.google.gson.annotations.SerializedName

data class TrLpgResult(
    @SerializedName("lpg")
    val lpg: String,
    @SerializedName("marka")
    val marka: String
)