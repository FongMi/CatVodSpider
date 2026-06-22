package com.github.catvod.spider.merge.KW;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Y {
    protected final Map<X, X> a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.KW.X, com.github.catvod.spider.merge.KW.X>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.KW.X, com.github.catvod.spider.merge.KW.X>] */
    public final X a(X x) {
        C0834w c0834w = X.b;
        if (x == c0834w) {
            return c0834w;
        }
        X x2 = (X) this.a.get(x);
        if (x2 != null) {
            return x2;
        }
        this.a.put(x, x);
        return x;
    }
}
