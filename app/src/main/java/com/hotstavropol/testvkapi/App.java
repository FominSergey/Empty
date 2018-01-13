package com.hotstavropol.testvkapi;

import android.app.Application;
import android.widget.Toast;

import com.vk.sdk.VKSdk;

/**
 * HotStavropol corporation
 * Created by Serega on 13.01.2018.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);
        Toast.makeText(this, "VKSdk Initalized!", Toast.LENGTH_SHORT).show();
    }
}
