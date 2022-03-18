package com.hossam.mvvmimpelmentaion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hossam.mvvmimpelmentaion.data.User
import com.hossam.mvvmimpelmentaion.repository.RepoCacheDatabase

class MainActivity : AppCompatActivity() {

    private val repo: RepoCacheDatabase = RepoCacheDatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repo.printAllUsers()
        repo.insertUser(User("Hossam","12564777"))
        repo.printAllUsers()
        repo.deleteUser()
        repo.printAllUsers()
    }
}