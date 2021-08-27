package com.example.lesson11

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment

class SingleChoiceFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = requireActivity().layoutInflater.inflate(R.layout.single_choice_fragment, null)
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("123")
            .setView(view)
        
        return builder.create()
    }
}