package com.switchcomp.daggerpoc.package_two.mvp.main;

import com.switchcomp.daggerpoc.annotations.UserScope;
import com.switchcomp.daggerpoc.ui.flows.MainFragment;

import dagger.Subcomponent;

/**
 * Created by Amit on 07/07/16.
 */
@UserScope
@Subcomponent(modules = {MainViewModulev2.class})
public interface MainViewComponentv2 {

    void inject(MainFragment fragment);
}
