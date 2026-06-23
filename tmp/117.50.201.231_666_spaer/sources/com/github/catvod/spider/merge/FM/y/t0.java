package com.github.catvod.spider.merge.FM.y;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class t0 {
    public AbstractC0471m a;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new s0());
    }

    protected t0(AbstractC0471m abstractC0471m) {
        if (abstractC0471m == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.a = abstractC0471m;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0473o;
    }

    public com.github.catvod.spider.merge.FM.A.k c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
