package com.switchcomp.daggerpoc.package_one.mvp.main;

import com.switchcomp.daggerpoc.annotations.ViewScope;
import com.switchcomp.daggerpoc.package_one.usecase.GeocodeUsecase;
import com.switchcomp.daggerpoc.ui.flows.mvp.MainPresenter;
import com.switchcomp.daggerpoc.ui.flows.mvp.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amit on 07/07/16.
 */
@Module
public class MainViewModule {

    @Provides
    @ViewScope
    public MainPresenter getMainPresenter(GeocodeUsecase geocodeUsecase) {
        return new MainPresenterImpl(geocodeUsecase);
    }
}
