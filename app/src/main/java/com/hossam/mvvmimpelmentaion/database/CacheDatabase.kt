package com.hossam.mvvmimpelmentaion.database

import com.hossam.mvvmimpelmentaion.data.User

object CacheDatabase {

    fun database():MutableList<User>{
        return mutableListOf(
            User("Mohamed","123456"),
            User("Ali","523145"),
            User("Othman","9966543")
        )
    }
}