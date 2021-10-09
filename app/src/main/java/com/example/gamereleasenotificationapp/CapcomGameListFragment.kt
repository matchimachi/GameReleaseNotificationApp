package com.example.gamereleasenotificationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class GameListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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