package com.github.catvod.demo;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.R;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.Init;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init.init(getApplicationContext());
        new Thread(() -> {
            Ali ali = new Ali();
            ali.init("https://agit.ai/Yoursmile7/TVBox/raw/branch/master/token.txt");
            ali.playerContent("普畫", "63de1c59a77dc671045c4a35b42e96d5621f4dc0");
        }).start();
    }
}