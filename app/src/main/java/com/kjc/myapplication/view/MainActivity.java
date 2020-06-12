package com.kjc.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kjc.myapplication.R;

import com.kjc.myapplication.di.CarComponent;
import com.kjc.myapplication.di.DaggerCarComponent;
import com.kjc.myapplication.model.Car;


public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.getCar();
        car.drive();
    }
}