package com.ozancanguz.worldgasprices.data.remotedatasource

import com.ozancanguz.worldgasprices.data.api.GasPriceApi
import com.ozancanguz.worldgasprices.data.models.eu.EuModel
import com.ozancanguz.worldgasprices.data.models.tr.diesel.TrDieselModel
import com.ozancanguz.worldgasprices.data.models.tr.gasoline.TrGasolineModel
import com.ozancanguz.worldgasprices.data.models.tr.lpg.TrLpgModel
import com.ozancanguz.worldgasprices.data.models.usa.Usa
import retrofit2.Response
import javax.inject.Inject


class RemoteDataSource@Inject constructor(private val gasPriceApi: GasPriceApi){


    suspend fun getUsaData(): Response<Usa> {
        return gasPriceApi.getUsaPrice()
    }

    suspend fun getEuData():Response<EuModel>{
        return gasPriceApi.getEuData()
    }

    suspend fun getTrGasolineData(city:String):Response<TrGasolineModel>{
        return gasPriceApi.getTrGasolineData(city)
    }

    suspend fun getTrDieselData(city: String):Response<TrDieselModel>{
        return gasPriceApi.getTrDieselData(city)
    }

    suspend fun getTrLpgPrices(city: String):Response<TrLpgModel>{
        return gasPriceApi.getTrLpgData(city)
    }

}