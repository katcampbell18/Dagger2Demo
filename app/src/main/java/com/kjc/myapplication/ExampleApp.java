package com.kjc.myapplication;

import android.app.Application;

import com.kjc.myapplication.di.component.ActivityComponent;
import com.kjc.myapplication.di.component.AppComponent;
import com.kjc.myapplication.di.component.DaggerAppComponent;


public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

       component = DaggerAppComponent.create();

    }

    public AppComponent getAppComponent(){
        return component;
    }
}
