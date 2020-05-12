package com.example.mykotlinproject.SignIn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.mykotlinproject.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var email = findViewById(R.id.inputEmail) as EditText
        var password = findViewById(R.id.inputPassword) as EditText
        var onSignIn = findViewById(R.id.buttonSignIn) as Button

        onSignIn.setOnClickListener{

            password.setText("");
            println("Email")
            println(email)

        }
    }

    fun main (item: String) {
        println(item)
    }
}
