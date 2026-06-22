package com.github.catvod.spider.merge.A;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class l0 {
    public final AbstractC0008i a;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new k0());
    }

    public l0(AbstractC0008i abstractC0008i) {
        if (abstractC0008i == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.a = abstractC0008i;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0010k;
    }

    public com.github.catvod.spider.merge.C.f c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
