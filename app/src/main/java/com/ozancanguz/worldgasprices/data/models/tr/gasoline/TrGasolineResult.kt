package com.ozancanguz.worldgasprices.data.models.tr.gasoline


import com.google.gson.annotations.SerializedName

data class TrGasolineResult(
    @SerializedName("benzin")
    val benzin: Double,
    @SerializedName("katkili")
    val katkili: Any,
    @SerializedName("marka")
    val marka: String
)