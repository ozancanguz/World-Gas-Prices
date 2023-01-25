package com.ozancanguz.worldgasprices.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.worldgasprices.data.models.tr.gasoline.TrGasolineModel
import com.ozancanguz.worldgasprices.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TrViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {

    var trgasolineData=MutableLiveData<TrGasolineModel>()




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



}