package com.switchcomp.daggerpoc.package_two.modules;

import com.switchcomp.daggerpoc.package_two.api.GeocoderApiv2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Amit on 07/07/16.
 */
@Module
public class DomainApiModulev2 {

    @Provides
    @Singleton
    public GeocoderApiv2 provideGeocoderApiInterfacev2(Retrofit retrofit) {
        return retrofit.create(GeocoderApiv2.class);
    }


}
