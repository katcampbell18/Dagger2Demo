package com.kjc.myapplication.model;

import android.util.Log;

import com.kjc.myapplication.model.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }

    public void setListener(Car car){
        Log.d(TAG, "Remote connected");
    }
}
