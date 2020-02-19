package com.example.mvp.Model;

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
        void onErrorCuenta();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
