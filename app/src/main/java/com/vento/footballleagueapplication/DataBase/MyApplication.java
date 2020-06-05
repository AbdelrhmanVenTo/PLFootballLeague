package com.vento.footballleagueapplication.DataBase;


import android.app.Application;

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        AppDataBase.init(this);
    }
}
