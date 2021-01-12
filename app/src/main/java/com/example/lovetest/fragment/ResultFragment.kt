package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R


class ResultFragment : Fragment() {

    var optionIndex = -1
    lateinit var navController :NavController
     lateinit var result1 : TextView
    lateinit var result2 : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        optionIndex = arguments?.getInt("index")?: -1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        result1= view.findViewById(R.id.result1)
        result2 = view.findViewById(R.id.result2)
        navController = Navigation.findNavController(view)

        setResult(optionIndex,view)

        val home : Button = view.findViewById(R.id.home)

        home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment2)
        }

    }

    private fun setResult(optionIndex: Int,view : View) {
        when(optionIndex) {

            1->{
                result1.text =" 당신의 스코어는 100점!"
                result2.text = getString(R.string.result1)

            }
            2->{
                result1.text =" 당신의 스코어는 80점!"
                result2.text = getString(R.string.result2)
            }
            3->{
                result1.text =" 당신의 스코어는 60점!"
                result2.text = getString(R.string.result3)
            }
            4->{
                result1.text =" 당신의 스코어는 0점!"
                result2.text = getString(R.string.result4)
            }

        }
    }


}