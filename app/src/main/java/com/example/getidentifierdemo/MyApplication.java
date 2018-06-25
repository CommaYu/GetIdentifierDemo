package com.example.getidentifierdemo;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StrManager.getInstance().init(this);
    }
}
