package com.github.catvod.spider.merge.u;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class T {
    protected final Map<S, S> a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.u.S, com.github.catvod.spider.merge.u.S>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.u.S, com.github.catvod.spider.merge.u.S>] */
    public final S a(S s) {
        C0649s c0649s = S.b;
        if (s == c0649s) {
            return c0649s;
        }
        S s2 = (S) this.a.get(s);
        if (s2 != null) {
            return s2;
        }
        this.a.put(s, s);
        return s;
    }
}
