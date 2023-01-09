package com.github.catvod.spider;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.github.catvod.crawler.Spider;

public class Live extends Spider {

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        Init.run(this::openLive, delay(extend));
    }

    private int delay(String extend) {
        try {
            return TextUtils.isEmpty(extend) ? 0 : Integer.parseInt(extend);
        } catch (Throwable ignored) {
            return 0;
        }
    }

    private void openLive() {
        try {
            Activity activity = Init.getActivity();
            activity.startActivity(new Intent().setComponent(new ComponentName(activity, "com.fongmi.android.tv.ui.activity.LiveActivity")));
        } catch (Throwable ignored) {
        }
    }
}
