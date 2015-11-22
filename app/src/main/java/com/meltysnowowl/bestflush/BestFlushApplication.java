package com.meltysnowowl.bestflush;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by alex on 11/20/15.
 */
public class BestFlushApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();


        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "XRCZXmrATdPe0mK0uSUNayVJdSCeQb4sFewI18GV",
                "qOhEuzTC8O7xPwY7AUDNEuDdMaq2BxYOQP7BKhKC");




    }
}
