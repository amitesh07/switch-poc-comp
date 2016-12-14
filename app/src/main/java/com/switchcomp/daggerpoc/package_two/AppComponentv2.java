package com.switchcomp.daggerpoc.package_two;

import android.content.Context;
import android.content.SharedPreferences;


import com.switchcomp.daggerpoc.package_two.modules.AppModulev2;
import com.switchcomp.daggerpoc.package_two.modules.DomainApiModulev2;
import com.switchcomp.daggerpoc.package_two.modules.NetModulev2;
import com.switchcomp.daggerpoc.package_two.mvp.main.MainViewComponentv2;
import com.switchcomp.daggerpoc.package_two.mvp.main.MainViewModulev2;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by Amit on 07/07/16.
 */
@Singleton
@Component(modules = {DomainApiModulev2.class, AppModulev2.class, NetModulev2.class})
public interface AppComponentv2 {

    Context context();

    Retrofit retrofit();
    OkHttpClient okHttpClient();
    SharedPreferences sharedPreferences();

    MainViewComponentv2 plus (MainViewModulev2 viewModulev2);

    //void inject(MainFragment fragment);
}
