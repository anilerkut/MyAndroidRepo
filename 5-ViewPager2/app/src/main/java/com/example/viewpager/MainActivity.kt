package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.interstellar,
            R.drawable.banshees,
            R.drawable.batman,
            R.drawable.budapest
        )

        var viewPager : ViewPager2 = findViewById(R.id.viewPager)
        val adapter = ViewPageAdapter(images)
        viewPager.adapter = adapter
    }
}