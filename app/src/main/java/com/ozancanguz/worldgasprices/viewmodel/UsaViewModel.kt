package com.ozancanguz.worldgasprices.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.worldgasprices.data.models.usa.Usa
import com.ozancanguz.worldgasprices.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsaViewModel@Inject constructor(private val repository: Repository, application: Application)
    :AndroidViewModel(application){


        var usaDataList=MutableLiveData<Usa>()


    fun requestUsaData(){
        viewModelScope.launch {
            val response=repository.remote.getUsaData()
            if(response.isSuccessful){
                usaDataList.postValue(response.body())
            }
            else{
                Log.d("usaviewmodel","no data")
            }
        }

    }


}