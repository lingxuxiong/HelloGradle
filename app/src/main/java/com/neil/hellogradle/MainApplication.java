package com.neil.hellogradle;

import android.app.Application;
import android.util.Log;

import com.neil.hellogradle.utils.Constants;

/**
 * Created by nling on 3/24/2017.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(Constants.LOG_TAG, "onCreate.");

        if (BuildConfig.enableLog) {
            Log.d(Constants.LOG_TAG, "Logging enabled.");
        } else {
            Log.d(Constants.LOG_TAG, "Logging disabled.");
        }
    }

}
