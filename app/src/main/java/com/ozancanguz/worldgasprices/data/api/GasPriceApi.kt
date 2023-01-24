package com.ozancanguz.worldgasprices.data.api

import com.ozancanguz.worldgasprices.data.models.usa.Usa
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface GasPriceApi {


    // all usa price
    @Headers(
        "authorization: apikey 2xAW88zA1iemGAxzWMNumI:47IyS3uICCasjqzWaFtxnn",
        "content-type: application/json"
    )
    @GET("allUsaPrice")
    suspend fun getUsaPrice(): Response<Usa>



}