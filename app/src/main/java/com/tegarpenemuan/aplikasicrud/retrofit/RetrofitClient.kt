package com.tegarpenemuan.aplikasicrud.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * com.tegarpenemuan.aplikasicrud.retrofit
 *
 * Created by Tegar Penemuan on 30/10/2022.
 * https://github.com/tegarpenemuanr3
 *
 */

object RetrofitClient {
    private const val BASE_URL = "http://192.168.178.250/tokoonline/public/api/"

    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(Api::class.java)
    }
}