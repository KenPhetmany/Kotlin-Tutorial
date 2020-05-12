package com.example.mykotlinproject.SignIn.SignIn

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mykotlinproject.R
import kotlinx.android.synthetic.main.activity_main.*

class SignInActivity: AppCompatActivity(), SignInView{

    private val presenter = SignInPresenter(this, SignInModel())

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var email = findViewById(R.id.inputEmail) as EditText
        var password = findViewById(R.id.inputPassword) as EditText
        var onSignIn = findViewById(R.id.buttonSignIn) as Button

        onSignIn.setOnClickListener{validateCredentials()}
    }

    private  fun validateCredentials() {
        presenter.validateCredentials(inputEmail.text.toString(), inputPassword.text.toString())
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE    }

    override fun hideProgress() {
        println("I am loading")
    }

    override fun setUsernameError() {
        inputEmail.error = "Please input a valid email"
    }


    override fun setPasswordError() {
        inputPassword.error = "Password is invalid"
    }

    override fun navigateToHome() {
        println("I am loading")
    }

}