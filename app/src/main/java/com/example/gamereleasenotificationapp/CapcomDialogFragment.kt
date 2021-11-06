package com.example.gamereleasenotificationapp

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment


class CapcomDialogFragment: DialogFragment() {

    companion object {
        // リストに表示する値を配列として定義
        val GENDERS = arrayOf("ホームページ", "Twitter")
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Here Title")
            // .setMessage("Here Message") // setMessageは使うとリスト表示されないので注意！
            .setItems(GENDERS) { dialog, which ->
                Toast.makeText(context, "${GENDERS[which]} が選択されました", Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton(R.string.close, null)
            return builder.create()
    }
}

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_capcom_dialog, container, false)
//    }
