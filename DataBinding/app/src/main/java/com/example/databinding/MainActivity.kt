package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

/**
 * Data Binding allows you to effortlessly communicate across views and data sources.
 */
class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }

    fun showUser(view: View) {
        val user = User(name = "Erkut Anıl", surname = "Dinç")
        binding.user = user
    }
}