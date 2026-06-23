package com.github.catvod.spider.merge.u;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class i0 {
    public AbstractC0640i a;

    static class a extends HashMap<Class<? extends i0>, Integer> {
        a() {
            put(C0650t.class, 1);
            put(X.class, 2);
            put(a0.class, 3);
            put(Q.class, 4);
            put(C0644m.class, 5);
            put(C0642k.class, 6);
            put(c0.class, 7);
            put(K.class, 8);
            put(j0.class, 9);
            put(P.class, 10);
        }
    }

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new a());
    }

    protected i0(AbstractC0640i abstractC0640i) {
        if (abstractC0640i == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.a = abstractC0640i;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0642k;
    }

    public com.github.catvod.spider.merge.w.i c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
