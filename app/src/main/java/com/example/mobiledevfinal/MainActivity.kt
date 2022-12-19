package com.example.mobiledevfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signIn = findViewById<Button>(R.id.signIn)

        signIn.setOnClickListener {
            signIn()
        }

    }

    private fun signIn() {
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.passwordInput)

        if (username.text.isEmpty() || password.text.isEmpty()) {
            Toast.makeText(this, "please fill all the fields", Toast.LENGTH_SHORT).show()
            return
        }

        val usernameText = username.text.toString()
        val passwordText = password.text.toString()

        if (usernameText == "akim" || passwordText == "akim") {
            val intent = Intent(this, StudentActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "incorrect credentials", Toast.LENGTH_SHORT).show()
            return
        }

    }
}
