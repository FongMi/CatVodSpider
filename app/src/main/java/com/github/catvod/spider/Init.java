package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.github.catvod.crawler.SpiderDebug;

public class Init {

    private final Handler handler;
    private Application app;

    private static class Loader {
        static volatile Init INSTANCE = new Init();
    }

    public static Init get() {
        return Loader.INSTANCE;
    }

    public Init() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    public static Application context() {
        return get().app;
    }

    public static void init(Context context) {
        SpiderDebug.log("自定義爬蟲代碼載入成功！");
        get().app = ((Application) context);
    }

    public static void show(String msg) {
        get().handler.post(() -> Toast.makeText(context(), msg, Toast.LENGTH_SHORT).show());
    }
}
