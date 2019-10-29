package com.example.responsi_304

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        setContentView(R.layout.activity_preview)
        val btnback=findViewById<Button>(R.id.btnBack)
        var intent=intent
        val nama=intent.getStringExtra("nama")
        val email=intent.getStringExtra("email")
        val password=intent.getStringExtra("pass")

        val resultTv =findViewById<TextView>(R.id.tvPreview)
        resultTv.text="Nama : "+nama+"\nEmail : "+email+"\nPassword : "+password

    }
}
