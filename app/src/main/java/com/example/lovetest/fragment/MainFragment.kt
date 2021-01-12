package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R

class MainFragment : Fragment() {


    lateinit var navController: NavController // 나중에 생성한다는 약속어

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nextBtn : Button = view.findViewById(R.id.nextBtn)

            navController = Navigation.findNavController(view)

        nextBtn.setOnClickListener{
            navController.navigate(R.id.action_mainFragment2_to_questionFragment)

        }

    }

}