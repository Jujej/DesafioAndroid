package com.example.bugresma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val etUserName = findViewById<EditText>(R.id.etUserName)

        btnLogin.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java).apply {
                putExtra("USER_NAME", etUserName.text.toString())
            }
            startActivity(intent)
        }
    }
}