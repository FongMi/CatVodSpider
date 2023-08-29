package com.github.catvod.debug;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.R;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Miss;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Logger.addLogAdapter(new AndroidLogAdapter());
        Init.init(getApplicationContext());
        new Thread(() -> {
            try {
                Miss m = new Miss();
                m.homeContent(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}