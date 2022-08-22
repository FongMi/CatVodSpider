package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.github.catvod.crawler.SpiderDebug;

public class Init {

    private final Handler mHandler;
    private Application mApp;

    private static class Loader {
        static volatile Init INSTANCE = new Init();
    }

    private static Init get() {
        return Loader.INSTANCE;
    }

    public Init() {
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public static void init(Context context) {
        SpiderDebug.log("自定義爬蟲代碼載入成功！");
        get().mApp = ((Application) context);
    }
}
