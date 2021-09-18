package com.example.gamereleasenotificationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 配列の生成
        val array = arrayOf(getString(R.string.company_name1), getString(R.string.company_name2), getString(R.string.company_name3), getString(R.string.company_name4), getString(R.string.company_name5))

        // xmlにて実装したListViewの取得
        val listView = findViewById<ListView>(R.id.list_view)

        // ArrayAdapterの生成
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)

        // ListViewに、生成したAdapterを設定
        listView.adapter = adapter
    }
}