package com.hossam.mvvmimpelmentaion.validation

import com.hossam.mvvmimpelmentaion.data.User
import com.hossam.mvvmimpelmentaion.database.CacheDatabase

class ValidateCache {

    private var database = CacheDatabase.database()

    fun validateCaching(): MutableList<User> {
        return if (database.isNullOrEmpty()) throw IllegalArgumentException("There is no data") else database
    }
}