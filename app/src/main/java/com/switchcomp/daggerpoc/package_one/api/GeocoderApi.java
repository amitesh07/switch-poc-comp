package com.switchcomp.daggerpoc.package_one.api;


import android.location.Address;

import rx.Observable;

/**
 * Created by Amit on 07/07/16.
 */
public interface GeocoderApi {

    Observable<Address> getGeocode(double latitude, double longitude);

}
