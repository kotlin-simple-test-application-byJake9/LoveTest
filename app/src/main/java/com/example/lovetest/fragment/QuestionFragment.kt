package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R

class QuestionFragment : Fragment() ,View.OnClickListener {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nextBtn : Button = view.findViewById(R.id.nextBtn)

        navController = Navigation.findNavController(view)

        nextBtn.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id ==R.id.nextBtn) {
            navController.navigate(R.id.action_questionFragment_to_selectionFragment2)
        }

    }


}