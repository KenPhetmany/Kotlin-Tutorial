package com.example.mykotlinproject.SignIn.SignIn

interface SignInView {
    abstract val progress: Any

    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateToHome()
}