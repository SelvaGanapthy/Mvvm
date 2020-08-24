package com.example.testretrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.UnknownHostException

class RetrofitConnect {

//    private var retryCount = 0
//    private var httpClient: OkHttpClient.Builder? = null
//    private var retroApiServices: ApiServices? = null
//    private var httpClientGlide: OkHttpClient.Builder? = null
//
//    private object Holder {
//        internal val INSTANCE = RetrofitConnect()
//    }
//
//    fun getInstance(): RetrofitConnect {
//        return Holder.INSTANCE
//    }
//
//
//    fun gsonMapper(): Gson {
//        return GsonBuilder()
//            .registerTypeAdapter(Int::class.java, IntegerDefault0Adapter())
//            .registerTypeAdapter(Int::class.javaPrimitiveType, IntegerDefault0Adapter())
//            .serializeNulls()
//            .create()
//    }
//
//
//    fun retrofit(UrlBasePath: String): ApiServices {
//
//        retroApiServices = Retrofit.Builder().baseUrl(UrlBasePath)
//            .addConverterFactory(ToStringConverterFactory())
//            .addConverterFactory(GsonConverterFactory.create(gsonMapper()))
//            .client(httpClient!!.build())
//            .build().create(ApiServices::class.java)
//        return retroApiServices!!
//
//    }
//
//
//    fun <T> AddToEnqueue(baseCall: retrofit2.Call<T>, listener: ApiRequestListener, ReqType: Int) {
//        baseCall.enqueue(object : retrofit2.Callback<T> {
//            override fun onResponse(call: retrofit2.Call<T>, response: retrofit2.Response<T>) {
//                try {
//                    if (null != response.body()) {
//                        if (response.code() == 200) {
//                            listener.onReceiveResult(ReqType, response)
//                        } else {
//                            ExceptionTrack.getInstance()
//                                .TrackFailure(false, null, "" + ReqType, "" + call.request().url())
////                            GAAnalyticsOperations.getInstance().sendAnalyticsEvent(
////                                CommunityApplication.getInstance().getContext(),
////                                CommunityApplication.getInstance().getResources().getString(R.string.category_API_Service_Error),
////                                CommunityApplication.getInstance().getResources().getString(R.string.action_impression),
////                                "ServerResponseException",
////                                1
////                            )
//                            retryCount++
//                            if (retryCount <= 1) {
//                                call.clone().enqueue(this)
//                            } else {
//                                listener.onReceiveError(ReqType, "2")
//                                call.cancel()
//                            }
//                        }
//                    } else {
//                        ExceptionTrack.getInstance()
//                            .TrackFailure(false, null, "" + ReqType, "" + call.request().url())
////                        GAAnalyticsOperations.getInstance().sendAnalyticsEvent(
////                            CommunityApplication.getInstance().getContext(),
////                            CommunityApplication.getInstance().getResources().getString(R.string.category_API_Service_Error),
////                            CommunityApplication.getInstance().getResources().getString(R.string.action_impression),
////                            "ServerResponseException",
////                            2
////                        )
//                        retryCount++
//                        if (retryCount <= 1) {
//                            call.clone().enqueue(this)
//                        } else {
//                            listener.onReceiveError(ReqType, "3")
//                            call.cancel()
//                        }
//                    }
//                } catch (e: Exception) {
//                    ExceptionTrack.getInstance().TrackLog(e, "" + call.request().url(), ReqType)
//                }
//
//            }
//
//            override fun onFailure(call: retrofit2.Call<T>, t: Throwable) {
//                try {
//                    if (call.isCanceled || "Canceled" == t.message)
//                        return
//
//                    GAAnalyticsOperations.getInstance().sendAnalyticsEvent(
//                        CommunityApplication.getInstance().getContext(),
//                        CommunityApplication.getInstance().getResources().getString(R.string.category_API_Service_Error),
//                        CommunityApplication.getInstance().getResources().getString(R.string.action_impression),
//                        t.message,
//                        1
//                    )
//
//                    if (t is UnknownHostException)
//                        ExceptionTrack.getInstance().TrackFailure(
//                            true,
//                            t,
//                            "" + ReqType,
//                            "" + call.request().url()
//                        )
//                    else
//                        ExceptionTrack.getInstance().TrackFailure(
//                            false,
//                            t,
//                            "" + ReqType,
//                            "" + call.request().url()
//                        )
//                    retryCount++
//                    if (retryCount <= 1) {
//                        call.clone().enqueue(this)
//                    } else {
//                        listener.onReceiveError(ReqType, "1")
//                        call.cancel()
//                    }
//                } catch (e: Exception) {
//                    ExceptionTrack.getInstance().TrackLog(e, "" + call.request().url(), ReqType)
//                }
//
//            }
//        })
//    }


}