package com.github.catvod.utils;

import android.text.TextUtils;
import android.widget.Toast;

import com.github.catvod.spider.Init;

public class Notify {

    private Toast mToast;

    private static class Loader {
        static volatile Notify INSTANCE = new Notify();
    }

    private static Notify get() {
        return Loader.INSTANCE;
    }

    public static void show(String text) {
        Init.post(new Runnable() {
            @Override
            public void run() {
                get().makeText(text);
            }
        });
    }

    private void makeText(String message) {
        if (TextUtils.isEmpty(message)) return;
        if (mToast != null) mToast.cancel();
        com.github.catvod.spider.DanmakuSpider.safeShowToast(Init.context(), message);
    }
}
