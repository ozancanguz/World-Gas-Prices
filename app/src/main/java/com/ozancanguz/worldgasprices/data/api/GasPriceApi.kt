package com.ozancanguz.worldgasprices.data.api

import com.ozancanguz.worldgasprices.data.models.eu.EuModel
import com.ozancanguz.worldgasprices.data.models.usa.Usa
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface GasPriceApi {


    // all usa price
    @Headers(
        "authorization: apikey 6XBClsiyFUwn61jEKgPcWy:7hBFCMRuNZto9F4nzaj3Mz",
        "content-type: application/json"
    )
    @GET("allUsaPrice")
    suspend fun getUsaPrice(): Response<Usa>


// get eu data
    @Headers(
        "authorization: apikey 6XBClsiyFUwn61jEKgPcWy:7hBFCMRuNZto9F4nzaj3Mz",
        "content-type: application/json"
    )
    @GET("europeanCountries")
    suspend fun getEuData():Response<EuModel>





}