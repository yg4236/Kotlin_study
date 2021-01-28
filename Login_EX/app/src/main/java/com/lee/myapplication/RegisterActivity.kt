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
import kotlinx.android.synthetic.main.activity_login.btn_register
import kotlinx.android.synthetic.main.activity_login.et_id
import kotlinx.android.synthetic.main.activity_login.et_pass
import kotlinx.android.synthetic.main.activity_register.*
import org.json.JSONException
import org.json.JSONObject

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //아이디 값 찾아주기

        btn_register.setOnClickListener(View.OnClickListener {
            val userID = et_id.getText().toString()
            val userPass = et_pass.getText().toString()
            val userName = et_name.getText().toString()
            val userAge = et_age.getText().toString().toInt()
            val responseListener = Response.Listener<String>() {
            }
            Toast.makeText(this, "회원 등록에 성공하였습니다", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
            val registerRequest = RegisterRequest(userID, userPass, userName, userAge, responseListener)
            val queue = Volley.newRequestQueue(this@RegisterActivity)
            queue.add(registerRequest)

        })
    }
}