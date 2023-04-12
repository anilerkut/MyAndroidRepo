package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    /***
     *
     * Navigation occurs between your app's destinations—that is, anywhere in your app to which users can navigate. These destinations are connected via actions.
     * A navigation graph is a resource file that contains all of your destinations and actions. The graph represents all of your app's navigation paths.
     */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        var goYellow = view.findViewById<Button>(R.id.goYellowButton)
        var goBlue = view.findViewById<Button>(R.id.goBlueButton)
        var goGreen = view.findViewById<Button>(R.id.goGreenButton)

        goYellow.setOnClickListener { findNavController().navigate(R.id.actionMainToYellow) }
        goBlue.setOnClickListener { findNavController().navigate(R.id.actionMainToBlue) }
        goGreen.setOnClickListener { findNavController().navigate(R.id.actionMainToGreen) }

        return view
    }

}