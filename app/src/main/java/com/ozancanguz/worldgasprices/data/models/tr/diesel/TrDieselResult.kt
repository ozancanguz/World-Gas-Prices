package com.ozancanguz.worldgasprices.data.models.tr.diesel


import com.google.gson.annotations.SerializedName

data class TrDieselResult(
    @SerializedName("dizel")
    val dizel: Double,
    @SerializedName("katkili")
    val katkili: Any,
    @SerializedName("marka")
    val marka: String
)