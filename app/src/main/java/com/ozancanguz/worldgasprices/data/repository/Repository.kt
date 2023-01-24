package com.ozancanguz.worldgasprices.data.repository

import com.ozancanguz.worldgasprices.data.remotedatasource.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject


@ViewModelScoped
class Repository@Inject constructor( remoteDataSource: RemoteDataSource) {

    val remote=remoteDataSource

}