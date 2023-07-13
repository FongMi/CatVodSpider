package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.github.catvod.crawler.SpiderDebug;

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

    public static Activity getActivity() throws Exception {
        Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
        Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
        Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
        activitiesField.setAccessible(true);
        Map<?, ?> activities = (Map<?, ?>) activitiesField.get(activityThread);
        for (Object activityRecord : activities.values()) {
            Class<?> activityRecordClass = activityRecord.getClass();
            Field pausedField = activityRecordClass.getDeclaredField("paused");
            pausedField.setAccessible(true);
            if (!pausedField.getBoolean(activityRecord)) {
                Field activityField = activityRecordClass.getDeclaredField("activity");
                activityField.setAccessible(true);
                Activity activity = (Activity) activityField.get(activityRecord);
                SpiderDebug.log(activity.getComponentName().getClassName());
                return activity;
            }
        }
        return null;
    }
}
