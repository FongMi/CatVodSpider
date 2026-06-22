package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1143i0 {
    private final String a;
    private final Class<?>[] b;

    C1143i0(Method method) {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.a = name;
        this.b = parameterTypes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1143i0)) {
            return false;
        }
        C1143i0 c1143i0 = (C1143i0) obj;
        return c1143i0.a.equals(this.a) && Arrays.equals(this.b, c1143i0.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.length;
    }
}
