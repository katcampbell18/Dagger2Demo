package com.kjc.myapplication.di.module;

import com.kjc.myapplication.model.DieselEngine;
import com.kjc.myapplication.model.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
