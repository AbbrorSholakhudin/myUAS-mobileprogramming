package com.abror.myuas.Api

import com.abror.myuas.Model.CatatanModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {
    @GET("data.php")
    fun data(): Call<CatatanModel>

}