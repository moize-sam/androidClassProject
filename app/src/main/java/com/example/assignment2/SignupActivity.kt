package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val btnSignIn = findViewById<Button>(R.id.btnSignIn) as Button
        val sig = findViewById<Button>(R.id.btnSignUp)
        sig.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}