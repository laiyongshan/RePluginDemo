package com.qihoo360.replugin.sample.host;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * @author lys
 * @time 2018/6/15 09:23
 * @desc:
 */

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();
    }


    public void initView(){

        //检测更新是否需要更新插件
        findViewById(R.id.check_updata_plugin_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //直接打开插件
        findViewById(R.id.open_plugin_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        //卸载插件
        findViewById(R.id.uninstall_plugin_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
