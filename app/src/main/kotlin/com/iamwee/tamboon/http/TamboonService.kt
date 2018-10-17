package com.iamwee.tamboon.http

import com.iamwee.tamboon.data.Charity
import retrofit2.Call
import retrofit2.http.GET

interface TamboonService {

    @GET("charities")
    fun getCharities(): Call<List<Charity>>

}