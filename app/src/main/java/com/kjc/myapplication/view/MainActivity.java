package com.kjc.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kjc.myapplication.ExampleApp;
import com.kjc.myapplication.R;

import com.kjc.myapplication.di.component.ActivityComponent;



import com.kjc.myapplication.di.module.DieselEngineModule;
import com.kjc.myapplication.model.Car;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
               .getActivityComponentBuilder()
               .horsePower(150)
               .engineCapacity(1400)
               .build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}