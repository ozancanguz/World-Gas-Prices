package com.ozancanguz.worldgasprices.data.models.usa


import com.google.gson.annotations.SerializedName

data class Usa(
    @SerializedName("result")
    val result: List<UsaResult>,
    @SerializedName("success")
    val success: Boolean
)