package com.kjc.myapplication.di.module;

import com.kjc.myapplication.model.Engine;
import com.kjc.myapplication.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
