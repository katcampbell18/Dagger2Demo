package com.kjc.myapplication.di;

import com.kjc.myapplication.model.Car;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();
}
