package com.example.testretrofit;

import kotlin.Unit;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiServices {
    //
//    @FormUrlEncoded
//    @GET("/api/users?")
//    fun getTodosList():Call<DataList>
    fun testFunctionOne(): Unit

    fun testFunctionTwo(): Unit

}
