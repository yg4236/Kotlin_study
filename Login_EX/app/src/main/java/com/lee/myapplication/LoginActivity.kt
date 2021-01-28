package com.lee.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_login.*
import org.json.JSONException
import org.json.JSONObject

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_register.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        })
        btn_login.setOnClickListener(View.OnClickListener {
            val userID = et_id.getText().toString()
            val userPass = et_pass.getText().toString()
            val responseListener = Response.Listener<String>(){
            }
            Toast.makeText(this, "로그인에 성공하였습니다", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("userID", userID)
            intent.putExtra("userPass", userPass)
            startActivity(intent)
            val loginRequest = LoginRequest(userID, userPass, responseListener)
            val queue = Volley.newRequestQueue(this@LoginActivity)
            queue.add(loginRequest)
        })
    }
}