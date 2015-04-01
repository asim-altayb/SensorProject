package com.sensorproject;


import android.app.Application;
import android.content.Intent;
import android.location.Location;
import android.util.Log;

public class SApplication extends Application {
    private final String TAG = SApplication.class.getSimpleName();
    public static Location LOCATION = null;

    @Override
    public void onCreate() {
        Log.d(TAG, "OnCreate");
        Intent location = new Intent(getApplicationContext(), LocationService.class);
        startService(location);
    }
}
