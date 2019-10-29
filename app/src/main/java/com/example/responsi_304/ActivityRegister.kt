package com.example.responsi_304

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class ActivityRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val nama=findViewById<EditText>(R.id.edtNama)
        val email=findViewById<EditText>(R.id.edtEmail2)
        val password=findViewById<EditText>(R.id.edtPassword2)
        val register =findViewById<Button>(R.id.btnRegister2)

        register.setOnClickListener {
            val nama2=nama.text.toString()
            val email2=email.text.toString()
            val password2 =password.text.toString()

            val intent= Intent(this@ActivityRegister,ActivityPreview::class.java)
            intent.putExtra("nama ",nama2)
            intent.putExtra("email ",email2)
            intent.putExtra("pass ",password2)

            startActivity(intent)
        }




    }
}
