package com.lee.basiclayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = object : View.OnClickListener {
            override fun onClick(v: View?) {
               Log.d("리스너","클릭되었습니다")
            }
        }

        button.setOnClick
    }
}