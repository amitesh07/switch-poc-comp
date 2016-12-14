package com.switchcomp.daggerpoc.package_one;

import android.content.Context;

import com.switchcomp.daggerpoc.annotations.ApplicationScope;
import com.switchcomp.daggerpoc.package_one.modules.AppModule;
import com.switchcomp.daggerpoc.package_one.modules.DomainApiModule;
import com.switchcomp.daggerpoc.package_one.mvp.main.MainViewComponent;
import com.switchcomp.daggerpoc.package_one.mvp.main.MainViewModule;

import dagger.Component;

/**
 * Created by Amit on 07/07/16.
 */
@ApplicationScope
@Component(modules = {AppModule.class, DomainApiModule.class})
public interface AppComponent {

    Context appContext();

    MainViewComponent plus(MainViewModule viewModule);

}
