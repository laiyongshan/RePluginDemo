package com.plugin.re.myrepluginapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

/**
 * @author lys
 * @time 2018/6/15 09:41
 * @desc:
 */

public class FragActvity extends FragmentActivity {

    FrameLayout fram_layout;
    Fragment1 mFragment1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        initView();
    }

    public void initView(){
        fram_layout=findViewById(R.id.fram_layout);
        mFragment1=new Fragment1();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction ft =manager.beginTransaction();
        ft.add(R.id.fram_layout, mFragment1);
        ft.commit();
    }
}
