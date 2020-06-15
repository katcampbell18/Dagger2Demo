package com.kjc.myapplication.di.component;

import com.kjc.myapplication.di.module.WheelsModule;
import com.kjc.myapplication.model.Car;
import com.kjc.myapplication.model.Wheels;
import com.kjc.myapplication.view.MainActivity;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
