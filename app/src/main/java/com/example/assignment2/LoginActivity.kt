package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var user = findViewById<EditText>(R.id.userName)
        var pass = findViewById<EditText>(R.id.password)
        var log= findViewById<Button>(R.id.btnlog)
        var signup = findViewById<Button>(R.id.btnSign)
        signup.setOnClickListener {
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        }
        log.setOnClickListener {

            if (user.text.toString() == "Sam" && pass.text.toString() == "Musa") {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {
                var toast = Toast.makeText(
                    applicationContext,
                    "username or password incorrect",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }

        }
    }

    }
