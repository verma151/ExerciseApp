package com.example.fitness_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


class StartFragment : Fragment() {

    lateinit var goButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_start, container, false)

        goButton = v.findViewById(R.id.go_button)

        goButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_startFragment_to_exerciseFragment)
        )

        setHasOptionsMenu(true)

        return v
    }


}
