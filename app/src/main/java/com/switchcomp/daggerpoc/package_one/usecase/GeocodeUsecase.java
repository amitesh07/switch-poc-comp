package com.switchcomp.daggerpoc.package_one.usecase;

import android.location.Address;

import com.switchcomp.daggerpoc.package_one.api.GeocoderApi;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Amit on 07/07/16.
 */
public class GeocodeUsecase {

    private GeocoderApi geocoderApi;

    @Inject
    public GeocodeUsecase(GeocoderApi _api) {
        this.geocoderApi = _api;
    }

    public Observable<Address> execute(double latitude, double longitude) {
        return geocoderApi.getGeocode(latitude, longitude);
    }
}
