package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class cl {
    public static void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        ko.f("<this>", th);
        ko.f("exception", th2);
        if (th != th2) {
            Integer num = nc.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = gv.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
