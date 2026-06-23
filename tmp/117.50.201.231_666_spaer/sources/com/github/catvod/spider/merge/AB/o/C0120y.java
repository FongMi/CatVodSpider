package com.github.catvod.spider.merge.AB.o;

import android.app.Application;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0120y {
    private static C0120y b;
    private boolean a = false;

    private C0120y() {
    }

    public static C0120y a() {
        if (b == null) {
            synchronized (C0120y.class) {
                if (b == null) {
                    b = new C0120y();
                }
            }
        }
        return b;
    }

    public final void b(Application application) {
        if (this.a) {
            return;
        }
        this.a = true;
        application.registerActivityLifecycleCallbacks(new C0119x());
    }
}
