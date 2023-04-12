package com.example.app2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app2.databinding.ActivityMainBinding

/**
 * two-way data binding is a powerful technique that can help simplify the development of
 * complex Android applications, by reducing the amount of boilerplate code required to
 * keep the UI and data model in sync
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User()
    }
}