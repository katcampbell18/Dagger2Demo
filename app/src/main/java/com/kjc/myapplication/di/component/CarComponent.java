package com.kjc.myapplication.di.component;

import com.kjc.myapplication.di.module.DieselEngineModule;
import com.kjc.myapplication.di.module.PetrolEngineModule;
import com.kjc.myapplication.di.module.WheelsModule;
import com.kjc.myapplication.model.Car;
import com.kjc.myapplication.model.PetrolEngine;
import com.kjc.myapplication.model.Wheels;
import com.kjc.myapplication.view.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
