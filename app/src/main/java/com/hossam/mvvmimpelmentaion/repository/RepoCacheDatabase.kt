package com.hossam.mvvmimpelmentaion.repository

import android.util.Log
import com.hossam.mvvmimpelmentaion.data.User
import com.hossam.mvvmimpelmentaion.validation.ValidateCache

class RepoCacheDatabase {

    private val validateDatabase: ValidateCache = ValidateCache()

    fun insertUser(user: User){
        validateDatabase.validateCaching().add(user)
    }

    fun deleteUser(){
        validateDatabase.validateCaching().removeLast()
    }

    fun getAll():MutableList<User>{
        return validateDatabase.validateCaching()
    }

    fun printAllUsers(){
        Log.d("AllData",validateDatabase.validateCaching().toString())
    }
}