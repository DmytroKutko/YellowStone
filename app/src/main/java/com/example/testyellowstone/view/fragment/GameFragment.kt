package com.example.testyellowstone.view.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testyellowstone.R
import com.example.testyellowstone.adapter.ItemsAdapter
import com.example.testyellowstone.constants.Const.Companion.GAME_ID
import kotlinx.android.synthetic.main.game_fragment.*
import java.util.*

class GameFragment : Fragment() {

    private lateinit var rvItems: RecyclerView
    private lateinit var adapter: ItemsAdapter
    private lateinit var listItems: ArrayList<String>

    private var gameNumber: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.game_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
    }

    private fun initView() {
        initText()
        initList()
        initRecyclerView()
        initButton()
    }

    @SuppressLint("SetTextI18n")
    private fun initText() {
        gameNumber = arguments!!.getInt(GAME_ID)
        tvGameNumber.text = getString(R.string.game) + gameNumber
    }

    private fun initList() {
        listItems = ArrayList()
        listItems.add("#6200EE")
        listItems.add("#3700B3")
        listItems.add("#03DAC6")
        listItems.add("#B00020")
        listItems.add("#BB86FC")
        listItems.add("#9E9E9E")
        listItems.add("#212121")
        listItems.add("#BDBDBD")
        listItems.add("#03A9F4")
        listItems.add("#CDDC39")
        listItems.add("#AFB42B")
        listItems.add("#FF5722")
        listItems.add("#3F51B5")
        listItems.add("#C5CAE9")
        listItems.add("#689F38")
    }

    private fun initButton() {
        ivGameBack.setOnClickListener {
            activity!!.onBackPressed()
        }

        btnShuffle.setOnClickListener {
            listItems.shuffle()
            adapter = ItemsAdapter(listItems, context!!)
            rvItems.swapAdapter(adapter, true)
        }
    }

    private fun initRecyclerView() {
        rvItems = activity!!.findViewById(R.id.rvItems)
        val gridLayoutManager = GridLayoutManager(context!!, 3)
        rvItems.layoutManager = gridLayoutManager
        adapter = ItemsAdapter(listItems, context!!)
        rvItems.adapter = adapter
    }

}
