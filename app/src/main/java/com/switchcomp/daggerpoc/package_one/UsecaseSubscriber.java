package com.switchcomp.daggerpoc.package_one;

import com.switchcomp.daggerpoc.error.AppException;

import rx.Subscriber;

/**
 * Created by Amit on 07/07/16.
 */
public abstract class UsecaseSubscriber<T> extends Subscriber<T> {



    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        onError(new AppException(e));
    }

    @Override
    public void onNext(T t) {
        onResult(t);
    }

    public abstract void onResult(T t);

    public abstract void onError(AppException e);
}
