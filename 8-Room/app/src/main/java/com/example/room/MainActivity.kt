package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db: UserDao = AppDatabase.getInstance(this)?.userDao()!!

        val user = User(name = "John Doe", age = 25)
        db.insertUser(user)

        val userList = db.getAllUsers()
        Log.d("user",userList.get(0).name)
    }

}