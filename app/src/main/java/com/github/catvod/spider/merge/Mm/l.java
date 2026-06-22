package com.github.catvod.spider.merge.Mm;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class l<A, B> implements Serializable {
    public final A c;
    public final B d;

    public l(A a, B b) {
        this.c = a;
        this.d = b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        A a = this.c;
        A a2 = lVar.c;
        if (a == null ? a2 == null : a.equals(a2)) {
            B b = this.d;
            B b2 = lVar.d;
            if (b == null ? b2 == null : b.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Dw.i.b(com.github.catvod.spider.merge.Dw.i.p(com.github.catvod.spider.merge.Dw.i.p(0, this.c), this.d), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.c, this.d);
    }
}
