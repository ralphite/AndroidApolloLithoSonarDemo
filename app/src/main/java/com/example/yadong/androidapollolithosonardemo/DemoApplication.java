package com.example.yadong.androidapollolithosonardemo;


import android.app.Application;

import com.facebook.soloader.SoLoader;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SoLoader.init(this, false);
    }
}
