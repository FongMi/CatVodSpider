package com.github.catvod.spider.merge.FM.y;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class Y {
    protected final Map<X, X> a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.y.X, com.github.catvod.spider.merge.FM.y.X>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.y.X, com.github.catvod.spider.merge.FM.y.X>] */
    public final X a(X x) {
        C0480w c0480w = X.b;
        if (x == c0480w) {
            return c0480w;
        }
        X x2 = (X) this.a.get(x);
        if (x2 != null) {
            return x2;
        }
        this.a.put(x, x);
        return x;
    }
}
