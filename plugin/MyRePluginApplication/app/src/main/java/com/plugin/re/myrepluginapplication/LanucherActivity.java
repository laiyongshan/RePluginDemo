package com.plugin.re.myrepluginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author lys
 * @time 2018/6/14 16:41
 * @desc:
 */

public class LanucherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_luanch);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(LanucherActivity.this,MainActivity.class);
                startActivity(intent);
            }
        },3000);
    }

}
