package com.switchcomp.daggerpoc.core;

/**
 * Created by Amit on 07/07/16.
 */
public interface Presenter<V extends View> {

    void attachView(V view);

    void detachView();

}
