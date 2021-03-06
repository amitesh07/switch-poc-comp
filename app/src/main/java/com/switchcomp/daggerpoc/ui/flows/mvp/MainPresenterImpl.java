package com.switchcomp.daggerpoc.ui.flows.mvp;

import android.location.Address;

import com.switchcomp.daggerpoc.error.AppException;
import com.switchcomp.daggerpoc.model.UserAddress;
import com.switchcomp.daggerpoc.package_one.UsecaseSubscriber;
import com.switchcomp.daggerpoc.package_one.usecase.GeocodeUsecase;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

/**
 * Created by Amit on 07/07/16.
 */
public class MainPresenterImpl implements MainPresenter {

    private MainView view;
    private GeocodeUsecase geocodeUsecase;
    private CompositeSubscription compositeSubscription;

    public MainPresenterImpl(GeocodeUsecase geocodeUsecase) {
        this.compositeSubscription = new CompositeSubscription();
        this.geocodeUsecase = geocodeUsecase;
    }

    @Override
    public void getUserAddress(double latitude, double longitude) {
        Subscription subscription;

        Timber.d("through geocoder");
        subscription = geocodeUsecase.execute(latitude, longitude)
                .observeOn(view.getUiScheduler())
                .subscribe(new UsecaseSubscriber<Address>() {
                    @Override
                    public void onResult(Address address) {
                        String addressLine1 = address.getAddressLine(0) + " " + address.getAddressLine(1).split(",")[0];
                        String addressLine2 = address.getSubLocality();
                        String state = address.getAdminArea();
                        String city = address.getLocality();
                        String postalCode = address.getPostalCode();
                        UserAddress userAddress = new UserAddress(
                                addressLine1,
                                addressLine2,
                                city,
                                state,
                                postalCode,
                                "Geocoder"
                        );

                        view.displayResult(userAddress);
                    }

                    @Override
                    public void onError(AppException e) {
                        Timber.e("Exception (geocoder): " + e.toString());
                        view.displayServerError();
                    }
                });

        compositeSubscription.add(subscription);
    }

    @Override
    public void attachView(MainView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
