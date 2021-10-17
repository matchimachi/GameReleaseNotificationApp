package com.example.gamereleasenotificationapp

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.PopupMenu


class CapcomGameListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btnGetCurrentBit: Button = view.findViewById(R.id.btnGetCurrentBit)
        btnGetCurrentBit.setOnClickListener{
            fun showPopup(v: View) {
                val popup = PopupMenu(context!!, v)
                val inflater = popup!!.menuInflater
                inflater.inflate(R.menu.header_menu, popup!!.menu)
                popup!!.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener {
                    override fun onMenuItemClick(item: MenuItem?): Boolean {
                        when (item!!.itemId) {
                            R.id.menu_open_in_browser -> {
                                //code here
                                return true
                            }
                            R.id.menu_cancel -> {
                                popup!!.dismiss()
                                //code here
                                return true
                            }
                            else -> return false
                        }
                    }
                })

//            popup!!.menu.findItem(R.id.menu_open_in_browser).applyFont(v.context, R.font.lato)


                popup!!.show()
            }
            showPopup(view)
        }

        // 配列の生成
        val array = arrayOf(
            getString(R.string.game_name1),
            getString(R.string.game_name2)
        )

        // xmlにて実装したListViewの取得
        val listView = view?.findViewById<ListView>(R.id.list_view)

        // ArrayAdapterの生成
        val adapter = this.getContext()
            ?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, array) }

        // ListViewに、生成したAdapterを設定
        listView?.adapter = adapter


        // 項目をタップしたときの処理
//        listView?.setOnItemClickListener { parent, view, position, id ->
//            Log.i("NewItemFragment", "ゲーム一覧へ遷移")
//            val gamelistFragment = GameListFragment()
//            val fragmentTransaction = fragmentManager?.beginTransaction()
//            fragmentTransaction?.addToBackStack(null)
//            fragmentTransaction?.replace(R.id.main_fragment, gamelistFragment)
//            fragmentTransaction?.commit()
//        }
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_capcom_game_list_view, container, false)
        return view

    }



}