package com.ozancanguz.worldgasprices.data.models.eu


import com.google.gson.annotations.SerializedName

data class EuModel(
    @SerializedName("results")
    val results: List<EuResult>,
    @SerializedName("success")
    val success: Boolean
)