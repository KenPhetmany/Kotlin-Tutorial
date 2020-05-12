package com.example.mykotlinproject.SignIn.SignIn

class SignInModel {

    interface  OnSignInListener {
        fun onUsernameError()
        fun onPasswordError()
        fun onSuccess()
    }

    fun login (userName: String, password: String, listener: OnSignInListener){
        when {
            userName.isEmpty() -> listener.onUsernameError()
            password.isEmpty() -> listener.onPasswordError()
        }
    }
}