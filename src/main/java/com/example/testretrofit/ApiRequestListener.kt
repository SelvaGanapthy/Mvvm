package com.example.testretrofit

import retrofit2.Response


interface ApiRequestListener {
    fun onReceiveResult(request: String, response: Response<*>)
    fun onReceiveError(request: String, error: String)
}