package com.kjc.myapplication.di.component;

import com.kjc.myapplication.di.module.DieselEngineModule;
import com.kjc.myapplication.di.module.DriverModule;
import com.kjc.myapplication.model.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Builder getActivityComponentBuilder();
}
