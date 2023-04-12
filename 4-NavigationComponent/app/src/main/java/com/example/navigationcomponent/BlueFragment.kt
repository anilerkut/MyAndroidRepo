package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class BlueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_blue, container, false)

        var buttonBluetoGreen = view.findViewById<Button>(R.id.buttonBlueToGreen)

        buttonBluetoGreen.setOnClickListener { findNavController().navigate(R.id.actionBlueToGreen) }

        return view
    }

}