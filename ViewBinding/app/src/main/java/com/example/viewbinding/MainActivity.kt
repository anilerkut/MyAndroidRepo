package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //View binding ensures us that views that we access in an activity,fragment,recylerview are non-null.There is no way null pointer exception
    //error. View binding only bind our views. it creates binding class and in here we can access our views.

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var myMessageButton = binding.viewBindingButton

        myMessageButton.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(p0: View?)
            {
                Toast.makeText(applicationContext,"Button Clicked",Toast.LENGTH_SHORT).show()
            }
        })
    }

}