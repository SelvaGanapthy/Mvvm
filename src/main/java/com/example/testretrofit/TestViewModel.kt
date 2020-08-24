package com.example.testretrofit

import android.util.Log
import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class TestViewModel : Observable(), ApiRequestListener, LifecycleObserver {

    var teztList: ObservableArrayList<String> = ObservableArrayList()
    var number = ObservableField<String>()
    val obserVerOperation = ObservableField<String>()

    init {
        teztList.add("1")
        teztList.add("2")
        teztList.add("3")
        teztList.add("4")
        teztList.add("5")
        teztList.add("6")
        teztList.add("7")
    }

    fun loadData() {
        setChanged()
        notifyObservers(teztList)
    }


    override fun onReceiveResult(request: String, response: Response<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onReceiveError(request: String, error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun performClickOperation(msg: String) {
        obserVerOperation.set(msg)
        setChanged()
        notifyObservers(msg)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun oncreate() {

        Log.i("MainViewModel", "MainViewModel Oncreate")
    }

    fun getdata(v: View) {
        setChanged()
        notifyObservers(v)
    }

}