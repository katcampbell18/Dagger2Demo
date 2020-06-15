package com.kjc.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kjc.myapplication.R;

import com.kjc.myapplication.di.component.CarComponent;
import com.kjc.myapplication.di.DaggerCarComponent;
import com.kjc.myapplication.di.component.DaggerCarComponent;
import com.kjc.myapplication.di.module.DieselEngineModule;
import com.kjc.myapplication.model.Car;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);
        car.drive();
    }
}