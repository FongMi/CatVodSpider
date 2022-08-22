package com.github.catvod.debug;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(() -> {

        }).start();
    }
}