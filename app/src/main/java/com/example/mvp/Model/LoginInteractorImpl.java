package com.example.mvp.Model;

import android.os.Handler;
import android.text.TextUtils;

import com.example.mvp.Model.LoginInteractor;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    return;
                }

                //Consulta con el servidor
                //respuesta positiva
                //respuesta
                listener.onSuccess();
                //listener.onerror();

                listener.onSuccess();
            }
        }, 1000);
    }
}
