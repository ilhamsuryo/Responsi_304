package com.example.responsi_304

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityPreview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        setContentView(R.layout.activity_preview)
        val btnback=findViewById<Button>(R.id.btnBack)
        var intent=intent
        val nama=intent.getStringExtra("nama")
        val email=intent.getStringExtra("email")
        val password=intent.getStringExtra("pass")

        btnback.setOnClickListener {
            intent= Intent(this@ActivityPreview,MainActivity::class.java)

            startActivity(intent)
        }
        val resultTv =findViewById<TextView>(R.id.tvPreview)
        resultTv.text="Nama : "+nama+"\nEmail : "+email+"\nPassword : "+password

    }
}


