package com.judith.ashieduapp.api

import com.judith.ashieduapp.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {

    @GET("users")
    fun getUsers():List<User>

}