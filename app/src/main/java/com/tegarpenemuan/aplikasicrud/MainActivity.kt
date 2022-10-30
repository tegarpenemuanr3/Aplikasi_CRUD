package com.tegarpenemuan.aplikasicrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.tegarpenemuan.aplikasicrud.model.ProductsResponse
import com.tegarpenemuan.aplikasicrud.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var tv_response: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_response = findViewById(R.id.tv_show)
        showdata()
    }

    private fun showdata() {


        RetrofitClient.instance.getProducts().enqueue(object : Callback<ProductsResponse> {
            override fun onResponse(
                call: Call<ProductsResponse>,
                response: Response<ProductsResponse>
            ) {
                Log.d("TAG","data: "+response.body().toString())
                tv_response.text = response.body().toString()
            }

            override fun onFailure(call: Call<ProductsResponse>, t: Throwable) {

            }

        })
    }
}