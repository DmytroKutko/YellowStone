package com.example.testyellowstone.view.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.postDelayed
import androidx.navigation.fragment.findNavController

import com.example.testyellowstone.R

/**
 * A simple [Fragment] subclass.
 */
class LoadingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        view!!.postDelayed(
            {
                findNavController()
                    .navigate(R.id.action_loadingFragment_to_mainMenuFragment)
            },
            2000
        )
    }


}
