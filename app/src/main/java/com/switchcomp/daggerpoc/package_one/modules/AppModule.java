package com.switchcomp.daggerpoc.package_one.modules;

import android.content.Context;

import com.switchcomp.daggerpoc.ApplicationController;
import com.switchcomp.daggerpoc.annotations.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amit on 07/07/16.
 */
@Module
public class AppModule {

    private ApplicationController app;

    public AppModule(ApplicationController app) {
        this.app = app;
    }

    @Provides
    @ApplicationScope
    public Context provideApplicationContext() {
        return app;
    }

    @Provides
    @ApplicationScope
    public ApplicationController provideApplication() {
        return app;
    }


}
