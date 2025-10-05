package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.catvod.crawler.SpiderDebug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Init {

    private final ExecutorService executor;
    private final Handler handler;
    private Activity activity;
    private Application app;

    private static class Loader {
        static volatile Init INSTANCE = new Init();
    }

    public static Init get() {
        return Loader.INSTANCE;
    }

    public Init() {
        this.handler = new Handler(Looper.getMainLooper());
        this.executor = Executors.newFixedThreadPool(5);
    }

    public static Application context() {
        return get().app;
    }

    public static Activity activity() {
        return get().activity;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    public static void init(Context context) {
        get().app = ((Application) context);
        SpiderDebug.log("自定義爬蟲代碼載入成功！");
        registerActivityLifecycleCallbacks();
        Proxy.init();
    }

    public static void execute(Runnable runnable) {
        get().executor.execute(runnable);
    }

    public static void post(Runnable runnable) {
        get().handler.post(runnable);
    }

    public static void post(Runnable runnable, int delay) {
        get().handler.postDelayed(runnable, delay);
    }

    private static void registerActivityLifecycleCallbacks() {
        get().app.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
                if (activity != activity()) get().setActivity(activity);
            }

            @Override
            public void onActivityStarted(@NonNull Activity activity) {
                if (activity != activity()) get().setActivity(activity);
            }

            @Override
            public void onActivityResumed(@NonNull Activity activity) {
                if (activity != activity()) get().setActivity(activity);
            }

            @Override
            public void onActivityPaused(@NonNull Activity activity) {
                if (activity == activity()) get().setActivity(null);
            }

            @Override
            public void onActivityStopped(@NonNull Activity activity) {
                if (activity == activity()) get().setActivity(null);
            }

            @Override
            public void onActivityDestroyed(@NonNull Activity activity) {
                if (activity == activity()) get().setActivity(null);
            }

            @Override
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
            }
        });
    }
}
