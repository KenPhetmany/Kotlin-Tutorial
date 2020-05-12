package com.example.mykotlinproject.SignIn.SignIn

class SignInPresenter(var signInView: SignInView?, val signInModel: SignInModel): SignInModel.OnSignInListener{
    fun validateCredentials(userName: String, password: String){
        signInView?.showProgress();
        signInModel.login(userName, password, this)
    }
    fun onDestroy() {
        signInView = null
    }

    override fun onUsernameError() {
        signInView?.apply {
            setUsernameError()
            hideProgress()
        }    }

    override fun onPasswordError() {
        signInView?.apply {
            setPasswordError()
            hideProgress()
        }
    }

    override fun onSuccess() {
        signInView?.navigateToHome();
    }

}