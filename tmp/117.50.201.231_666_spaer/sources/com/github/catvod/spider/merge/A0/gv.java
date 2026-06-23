package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class gv {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        ko.c(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (ko.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                ko.e("getParameterTypes(...)", parameterTypes);
                if (ko.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !ko.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
