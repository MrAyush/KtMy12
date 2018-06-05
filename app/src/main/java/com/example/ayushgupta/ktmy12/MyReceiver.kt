package com.example.ayushgupta.ktmy12

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(private val mActivity: MainActivity) : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val str = intent?.action
        val tv1: TextView = mActivity.findViewById(R.id.tv1)
        tv1.text = str
    }
}