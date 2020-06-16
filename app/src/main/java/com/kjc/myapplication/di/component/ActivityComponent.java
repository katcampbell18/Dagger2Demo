package com.kjc.myapplication.di.component;

import com.kjc.myapplication.di.PerActivity;
import com.kjc.myapplication.di.module.DieselEngineModule;
import com.kjc.myapplication.di.module.PetrolEngineModule;
import com.kjc.myapplication.di.module.WheelsModule;
import com.kjc.myapplication.model.Car;
import com.kjc.myapplication.view.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }
}
