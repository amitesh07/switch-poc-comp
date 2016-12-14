package com.switchcomp.daggerpoc.package_two.usecase;

import com.switchcomp.daggerpoc.package_two.api.GeocoderApiv2;
import com.switchcomp.daggerpoc.package_two.geocode.GeocodeAddresses;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Amit on 07/07/16.
 */
public class GeocodeUsecasev2 {

    private GeocoderApiv2 api;

    @Inject
    public GeocodeUsecasev2(GeocoderApiv2 api) {
        this.api = api;
    }

    public Observable<GeocodeAddresses> getAddressDetails(String latlng) {
        return api.getGeocodeAddress(latlng);
    }
}
