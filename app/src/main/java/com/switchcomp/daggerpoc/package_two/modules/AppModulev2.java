package com.switchcomp.daggerpoc.package_two.modules;

import android.content.Context;

import com.switchcomp.daggerpoc.ApplicationController;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amit on 07/07/16.
 */
@Module
public class AppModulev2 {

    private ApplicationController app;

    public AppModulev2(ApplicationController app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return app;
    }

    @Provides
    @Singleton
    public ApplicationController provideApplication() {
        return app;
    }

}
