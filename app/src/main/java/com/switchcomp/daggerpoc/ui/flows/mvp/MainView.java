package com.switchcomp.daggerpoc.ui.flows.mvp;

import com.switchcomp.daggerpoc.core.View;
import com.switchcomp.daggerpoc.model.UserAddress;

/**
 * Created by Amit on 07/07/16.
 */
public interface MainView extends View {

    void displayResult(UserAddress userAddress);

}
