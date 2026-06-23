package com.github.catvod.spider.merge.AB.o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.github.catvod.crawler.SpiderDebug;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0119x implements Application.ActivityLifecycleCallbacks {
    C0119x() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String lowerCase = activity.getClass().getName().toLowerCase();
        SpiderDebug.log("activityName: " + lowerCase);
        if (lowerCase.contains("videoactivity") || lowerCase.contains("detailactivity") || lowerCase.contains("playactivity")) {
            C0101e c0101e = new C0101e(activity);
            if (c0101e.b) {
                return;
            }
            try {
                c0101e.e();
                c0101e.b = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
