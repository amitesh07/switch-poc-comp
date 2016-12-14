package com.switchcomp.daggerpoc.package_two.mvp.main;

import com.switchcomp.daggerpoc.annotations.UserScope;
import com.switchcomp.daggerpoc.package_two.usecase.GeocodeUsecasev2;
import com.switchcomp.daggerpoc.ui.flows.mvp.MainPresenter;
import com.switchcomp.daggerpoc.ui.flows.mvp.MainPresenterv2Impl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amit on 07/07/16.
 */
@Module
public class MainViewModulev2 {

    @Provides
    @UserScope
    public MainPresenter getMainPresenter(GeocodeUsecasev2 geocodeUsecase) {
        return new MainPresenterv2Impl(geocodeUsecase);
    }
}
