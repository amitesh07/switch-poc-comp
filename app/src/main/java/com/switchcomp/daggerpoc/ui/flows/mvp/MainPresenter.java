package com.switchcomp.daggerpoc.ui.flows.mvp;

import com.switchcomp.daggerpoc.core.Presenter;

/**
 * Created by Amit on 07/07/16.
 */
public interface MainPresenter extends Presenter<MainView> {

    void getUserAddress(double latitude, double longitude);

}
