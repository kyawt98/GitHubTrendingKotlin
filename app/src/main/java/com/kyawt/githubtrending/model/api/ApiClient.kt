package com.kyawt.githubtrending.model.api

import com.kyawt.githubtrending.util.Constant.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val instant = Retrofit.Builder().run {
        baseUrl(BASE_URL)
        addConverterFactory(GsonConverterFactory.create())
        build()
    }.create(ApiService::class.java)

//    val instant = Retrofit.Builder()
//        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    val apiService = instant.create(ApiService::class.java)
}