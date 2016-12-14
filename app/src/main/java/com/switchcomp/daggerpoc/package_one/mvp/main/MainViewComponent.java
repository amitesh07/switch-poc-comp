package com.switchcomp.daggerpoc.package_one.mvp.main;

import com.switchcomp.daggerpoc.annotations.ViewScope;
import com.switchcomp.daggerpoc.ui.flows.MainFragment;

import dagger.Subcomponent;

/**
 * Created by Amit on 07/07/16.
 */
@ViewScope
@Subcomponent(modules = MainViewModule.class)
public interface MainViewComponent {

    void inject(MainFragment mainFragment);
}
