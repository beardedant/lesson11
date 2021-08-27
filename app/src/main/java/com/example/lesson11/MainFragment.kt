package com.example.lesson11

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mainFragment = inflater.inflate(R.layout.main_fragment, container, false)
        var buttonSingleChoice = mainFragment.findViewById<Button>(R.id.buttonSingleChoice)
//        var buttonMultiChoice = mainFragment.findViewById<Button>(R.id.buttonMultiChoice)
//        var buttonBottomAlert = mainFragment.findViewById<Button>(R.id.buttonBottomAlert)

        buttonSingleChoice.setOnClickListener(View.OnClickListener {
            Log.d("MyLog", "onCreateView: single button clicked")
            SingleChoiceFragment().show(requireActivity().supportFragmentManager,"AAA")
        })

        return mainFragment
    }


    companion object

    fun newInstance(): MainFragment {
        return MainFragment()
    }
}