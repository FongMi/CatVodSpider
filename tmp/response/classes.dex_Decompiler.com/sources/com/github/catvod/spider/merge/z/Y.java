package com.github.catvod.spider.merge.z;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class Y {
    protected final Map<X, X> a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.z.X, com.github.catvod.spider.merge.z.X>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.z.X, com.github.catvod.spider.merge.z.X>] */
    public final X a(X x) {
        C0303w c0303w = X.b;
        if (x == c0303w) {
            return c0303w;
        }
        X x2 = (X) this.a.get(x);
        if (x2 != null) {
            return x2;
        }
        this.a.put(x, x);
        return x;
    }
}
