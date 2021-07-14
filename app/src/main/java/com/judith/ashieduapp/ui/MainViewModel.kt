package com.judith.ashieduapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.judith.ashieduapp.api.RetrofitProvider
import com.judith.ashieduapp.models.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    val usersLiveData = MutableLiveData<List<User>>()

    fun getUsers(){
        CoroutineScope(Dispatchers.IO).launch {
            usersLiveData.postValue(RetrofitProvider.placeHolderAPI.getUsers())
        }
    }

}