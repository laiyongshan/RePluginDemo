package com.plugin.re.myrepluginapplication;

import android.app.Application;

/**
 * @author lys
 * @time 2018/6/14 16:51
 * @desc:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initJPush();
    }



    public void initJPush() {

    }
}
