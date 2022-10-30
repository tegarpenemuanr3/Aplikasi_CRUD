package com.tegarpenemuan.aplikasicrud.retrofit

import com.tegarpenemuan.aplikasicrud.model.ProductsResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * com.tegarpenemuan.aplikasicrud.retrofit
 *
 * Created by Tegar Penemuan on 30/10/2022.
 * https://github.com/tegarpenemuanr3
 *
 */

interface Api {
    @GET("products")
    fun getProducts(): Call<ProductsResponse>
}