package com.example.gamereleasenotificationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ListView表示用のフラグメントをセット
        val gamecompanylistFragment = GameCompanyListFragment()
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_fragment, gamecompanylistFragment)
        transaction.commit()
    }
}