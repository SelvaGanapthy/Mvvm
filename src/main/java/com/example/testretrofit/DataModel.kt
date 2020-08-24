package com.example.testretrofit

import java.io.Serializable

class DataModel : Serializable {

    private var name: String? = null
    private var email: String? = null

    fun getName(): String {
        return name!!
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getEmail(): String {
        return email!!
    }

    fun setEmail(email: String) {
        this.email = email
    }

}