package com.github.catvod.spider;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import com.github.catvod.crawler.Spider;

public class Live extends Spider {

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        try {
            Activity activity = Init.getActivity();
            activity.startActivity(new Intent().setComponent(new ComponentName(activity, "com.fongmi.android.tv.ui.activity.LiveActivity")));
        } catch (Throwable ignored) {
        }
    }
}
