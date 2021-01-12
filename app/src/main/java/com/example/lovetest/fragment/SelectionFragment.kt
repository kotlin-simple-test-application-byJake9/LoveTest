package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R


class SelectionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val option1: Button = view.findViewById(R.id.option1)
        val option2: Button = view.findViewById(R.id.option2)
        val option3: Button = view.findViewById(R.id.option3)
        val option4: Button = view.findViewById(R.id.option4)

        val backBtn: Button = view.findViewById(R.id.backBtn)

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        backBtn.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.option1 -> {navigationWithIndex(1)
            }
            R.id.option2 -> {navigationWithIndex(2)
            }
            R.id.option3 -> {navigationWithIndex(3)
            }
            R.id.option4 -> {navigationWithIndex(4)
            }

            R.id.backBtn -> {
                navController.popBackStack()
            }

        }
    }

    fun navigationWithIndex(index :Int){
        val bundle = bundleOf("index" to index)

        navController.navigate(R.id.action_selectionFragment2_to_resultFragment,bundle)
    }
}