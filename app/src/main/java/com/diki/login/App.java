package com.diki.login;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(this);
    }
}
