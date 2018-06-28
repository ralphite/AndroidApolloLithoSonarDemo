package com.example.yadong.androidapollolithosonardemo;

import android.app.Application;

import com.apollographql.apollo.ApolloClient;
import com.facebook.soloader.SoLoader;
import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;

public class DemoApplication extends Application {

    private static final String BASE_URL = "http://127.0.0.1:8000/graphql";
    private ApolloClient apolloClient;

    @Override
    public void onCreate() {
        super.onCreate();

        SoLoader.init(this, false);

        Stetho.initializeWithDefaults(this);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();

        apolloClient = ApolloClient.builder().serverUrl(BASE_URL).okHttpClient(okHttpClient).build();
    }

    public ApolloClient apolloClient() {
        return apolloClient;
    }
}
