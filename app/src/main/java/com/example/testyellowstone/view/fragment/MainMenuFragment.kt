package com.example.testyellowstone.view.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.testyellowstone.R
import com.example.testyellowstone.constants.Const.Companion.GAME_ID
import kotlinx.android.synthetic.main.fragment_main_menu.*

/**
 * A simple [Fragment] subclass.
 */
class MainMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val bundle = Bundle()
        llGame1.setOnClickListener {
            bundle.putInt(GAME_ID, 1)
            findNavController().navigate(R.id.action_mainMenuFragment_to_gameFragment, bundle, null)
        }

        llGame2.setOnClickListener {
            bundle.putInt(GAME_ID, 2)
            findNavController().navigate(R.id.action_mainMenuFragment_to_gameFragment, bundle, null)
        }

        llGame3.setOnClickListener {
            bundle.putInt(GAME_ID, 3)
            findNavController().navigate(R.id.action_mainMenuFragment_to_gameFragment, bundle, null)
        }

        llGame4.setOnClickListener {
            bundle.putInt(GAME_ID, 4)
            findNavController().navigate(R.id.action_mainMenuFragment_to_gameFragment, bundle, null)
        }

        llGame5.setOnClickListener {
            bundle.putInt(GAME_ID, 5)
            findNavController().navigate(R.id.action_mainMenuFragment_to_gameFragment, bundle, null)
        }
    }
}
