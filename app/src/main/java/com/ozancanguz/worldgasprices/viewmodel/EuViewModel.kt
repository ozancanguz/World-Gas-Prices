package com.ozancanguz.worldgasprices.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.worldgasprices.data.models.eu.EuModel
import com.ozancanguz.worldgasprices.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EuViewModel@Inject constructor(private val repository: Repository, application: Application)
    :AndroidViewModel(application){

        var eudataList= MutableLiveData<EuModel>()

       fun requestEuData(){
           viewModelScope.launch {
               val response=repository.remote.getEuData()
               if(response.isSuccessful){
                   eudataList.postValue(response.body())
               }
               else{
                   Log.d("euviewmodel","no data")
               }
           }
       }



}