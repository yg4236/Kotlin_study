package com.lee.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent
        val userID = intent.getStringExtra("userID")
        val userPass = intent.getStringExtra("userPass")
        tv_id.setText(userID)
        tv_pass.setText(userPass)
    }
}