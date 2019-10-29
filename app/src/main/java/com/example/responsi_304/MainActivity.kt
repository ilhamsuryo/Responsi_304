package com.example.responsi_304

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast.makeText as makeText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener{
            val email = edtEmail1.text.toString()
            val password = edtPassword1.text.toString()
            if (email.isEmpty()||password.isEmpty()){
                makeText(this, "Tidak Kosong!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "ilham@gamil.com" || password == "qwerty") {
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            }else{
                makeText(this,"Password Anda Salah", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener{
            val intent = Intent (this, ActivityRegister::class.java)
            startActivity(intent)
        }
    }
}