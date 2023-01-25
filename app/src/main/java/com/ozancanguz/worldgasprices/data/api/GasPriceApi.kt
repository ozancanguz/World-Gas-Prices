package com.ozancanguz.worldgasprices.data.api

import com.ozancanguz.worldgasprices.data.models.eu.EuModel
import com.ozancanguz.worldgasprices.data.models.tr.diesel.TrDieselModel
import com.ozancanguz.worldgasprices.data.models.tr.gasoline.TrGasolineModel
import com.ozancanguz.worldgasprices.data.models.usa.Usa
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

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


    // get tr gasoline data
    @Headers(
        "authorization: apikey 6XBClsiyFUwn61jEKgPcWy:7hBFCMRuNZto9F4nzaj3Mz",
        "content-type: application/json"
    )
    @GET("turkeyGasoline")
    suspend fun getTrGasolineData(@Query("city")city:String):Response<TrGasolineModel>


    // get tr diesel prices
    @Headers(
        "authorization: apikey 6XBClsiyFUwn61jEKgPcWy:7hBFCMRuNZto9F4nzaj3Mz",
        "content-type: application/json"
    )
    suspend fun getTrDieselData(@Query("city")city: String):Response<TrDieselModel>




}