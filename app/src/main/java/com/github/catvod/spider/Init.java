package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Trans;

import java.lang.reflect.Field;
import java.util.Map;

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
        Trans.init();
    }

    public static void run(Runnable runnable) {
        get().handler.post(runnable);
    }

    public static void show(String msg) {
        get().handler.post(() -> Toast.makeText(context(), msg, Toast.LENGTH_LONG).show());
    }

    public static Activity getActivity() {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
