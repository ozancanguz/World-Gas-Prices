package com.ozancanguz.worldgasprices.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.worldgasprices.data.models.tr.diesel.TrDieselModel
import com.ozancanguz.worldgasprices.data.models.tr.gasoline.TrGasolineModel
import com.ozancanguz.worldgasprices.data.models.tr.lpg.TrLpgModel
import com.ozancanguz.worldgasprices.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TrViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {

    var trgasolineData=MutableLiveData<TrGasolineModel>()
    var trdieselData=MutableLiveData<TrDieselModel>()
    var trlpgData=MutableLiveData<TrLpgModel>()



    // tr gasoline request fun
    fun requestTrGasolineData(city:String){
        viewModelScope.launch {
            val response=repository.remote.getTrGasolineData(city)
            if(response.isSuccessful){
                trgasolineData.postValue(response.body())
            }else{
                Log.d("trviewmodel","no data for gasoline")
            }
        }
    }

    // request diesel data
    fun requestTrDieselData(city: String){
        viewModelScope.launch {
            val response=repository.remote.getTrDieselData(city)
            if (response.isSuccessful){
                trdieselData.postValue(response.body())
            }else{
                Log.d("trviewmodel","no data for diesel")
            }
        }
    }

    // request lpg data
    fun requestlpgData(city: String){
        viewModelScope.launch {
            val response=repository.remote.getTrLpgPrices(city)
            if(response.isSuccessful){
                trlpgData.postValue(response.body())
            }else{
                Log.d("trviewmodel","no data for lpg ")
            }
        }
    }



}