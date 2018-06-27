package com.example.yadong.androidapollolithosonardemo;


import android.app.Application;

import com.facebook.soloader.SoLoader;
//import com.facebook.sonar.android.AndroidSonarClient;
//import com.facebook.sonar.android.utils.SonarUtils;
//import com.facebook.sonar.core.SonarClient;
//import com.facebook.sonar.plugins.inspector.DescriptorMapping;
//import com.facebook.sonar.plugins.inspector.InspectorSonarPlugin;
//import com.facebook.sonar.plugins.network.NetworkSonarPlugin;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SoLoader.init(this, false);

//        if (BuildConfig.DEBUG && SonarUtils.shouldEnableSonar(this)) {
//            final SonarClient client = AndroidSonarClient.getInstance(this);
//            client.addPlugin(new NetworkSonarPlugin());
//
//            client.addPlugin(new InspectorSonarPlugin(
//                    getApplicationContext(), DescriptorMapping.withDefaults()));
//            client.start();
//        }
    }
}
