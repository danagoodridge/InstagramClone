package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MOgA9x9VOBJB0Hf3jZxV3o8QB0AxNKz0I8fJsqO8")
                .clientKey("eHoLYOVbYLeYguLNlfN0zVMGsK2IYwsoHut9qPA2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
