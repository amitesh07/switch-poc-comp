package com.switchcomp.daggerpoc.package_one.modules;

import com.switchcomp.daggerpoc.ApplicationController;
import com.switchcomp.daggerpoc.annotations.ApplicationScope;
import com.switchcomp.daggerpoc.package_one.api.GeocoderApi;
import com.switchcomp.daggerpoc.package_one.impl.GeocoderApiImpl;


import dagger.Module;
import dagger.Provides;

/**
 * Created by Amit on 07/07/16.
 */
@Module
public class DomainApiModule {

    @Provides
    @ApplicationScope
    public GeocoderApi getGeocoderApi(ApplicationController applicationController) {
        return new GeocoderApiImpl(applicationController);
    }

}
