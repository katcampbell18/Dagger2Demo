package com.kjc.myapplication.di;

import com.kjc.myapplication.model.Car;
import com.kjc.myapplication.view.MainActivity;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
