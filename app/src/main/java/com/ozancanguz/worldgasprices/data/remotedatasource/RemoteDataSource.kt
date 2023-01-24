package com.ozancanguz.worldgasprices.data.remotedatasource

import com.ozancanguz.worldgasprices.data.api.GasPriceApi
import com.ozancanguz.worldgasprices.data.models.usa.Usa
import retrofit2.Response
import javax.inject.Inject


class RemoteDataSource@Inject constructor(private val gasPriceApi: GasPriceApi){


    suspend fun getUsaData(): Response<Usa> {
        return gasPriceApi.getUsaPrice()
    }

}