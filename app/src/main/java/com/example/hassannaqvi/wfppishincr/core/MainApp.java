package com.example.hassannaqvi.wfppishincr.core;

import android.app.Application;

import com.example.hassannaqvi.wfppishincr.utils.TypefaceUtil;

public class MainApp extends Application {

    private static MainApp instance;

    public static MainApp get() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        TypefaceUtil.overrideFont(
                getApplicationContext(),
                "SERIF",
                "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/___.ttf


    }
}
