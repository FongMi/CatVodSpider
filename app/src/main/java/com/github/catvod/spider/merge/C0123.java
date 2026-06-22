package com.github.catvod.spider.merge;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˉ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0123<A, B> implements Serializable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final A f309;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public final B f310;

    public C0123(A a, B b) {
        this.f309 = a;
        this.f310 = b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0123)) {
            return false;
        }
        C0123 c0123 = (C0123) obj;
        C0121 c0121 = C0121.f308;
        return c0121.mo412(this.f309, c0123.f309) && c0121.mo412(this.f310, c0123.f310);
    }

    public int hashCode() {
        return C0120.m406(C0120.m411(C0120.m411(C0120.m408(), this.f309), this.f310), 2);
    }

    public String toString() {
        return String.format(SOY.d("5277225A5452097B"), this.f309, this.f310);
    }
}
