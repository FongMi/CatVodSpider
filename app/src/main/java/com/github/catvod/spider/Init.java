package com.github.catvod.spider;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Notify;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Init {

    private final ExecutorService executor;
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
        this.executor = Executors.newFixedThreadPool(5);
    }

    public static Application context() {
        return get().app;
    }

    public static void init(Context context) {
        get().app = ((Application) context);
        SpiderDebug.log("自定義爬蟲代碼載入成功！");
        Proxy.init();
    }

    public static void execute(Runnable runnable) {
        get().executor.execute(runnable);
    }

    public static void run(Runnable runnable) {
        get().handler.post(runnable);
    }

    public static void run(Runnable runnable, int delay) {
        get().handler.postDelayed(runnable, delay);
    }

    public static void checkPermission() {
        try {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return;
            if (context().checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) return;
            Notify.show("請允許儲存權限");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Activity getActivity() throws Exception {
        Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
        Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
        Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
        activitiesField.setAccessible(true);
        Map<?, ?> activities = (Map<?, ?>) activitiesField.get(activityThread);
        for (Object o : activities.values()) {
            Class<?> clz = o.getClass();
            Field pausedField = clz.getDeclaredField("paused");
            pausedField.setAccessible(true);
            if (!pausedField.getBoolean(o)) {
                Field activityField = clz.getDeclaredField("activity");
                activityField.setAccessible(true);
                return (Activity) activityField.get(o);
            }
        }
        return null;
    }
}
