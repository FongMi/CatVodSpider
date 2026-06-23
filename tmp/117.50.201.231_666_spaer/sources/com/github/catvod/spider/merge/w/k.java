package com.github.catvod.spider.merge.w;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k<A, B> implements Serializable {
    public final A a;
    public final B b;

    public k(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        A a = this.a;
        A a2 = kVar.a;
        if (a == null ? a2 == null : a.equals(a2)) {
            B b = this.b;
            B b2 = kVar.b;
            if (b == null ? b2 == null : b.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.i(0, this.a), this.b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
