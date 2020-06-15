package com.kjc.myapplication.di.component;

import com.kjc.myapplication.di.module.DieselEngineModule;
import com.kjc.myapplication.di.module.PetrolEngineModule;
import com.kjc.myapplication.di.module.WheelsModule;
import com.kjc.myapplication.model.Car;
import com.kjc.myapplication.model.PetrolEngine;
import com.kjc.myapplication.model.Wheels;
import com.kjc.myapplication.view.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
