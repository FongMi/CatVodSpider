package com.github.catvod.spider.merge.FM.A;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class n<A, B> implements Serializable {
    public final A a;
    public final B b;

    public n(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        A a = this.a;
        A a2 = nVar.a;
        if (a == null ? a2 == null : a.equals(a2)) {
            B b = this.b;
            B b2 = nVar.b;
            if (b == null ? b2 == null : b.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l.c(l.j(l.j(0, this.a), this.b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
