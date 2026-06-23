package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aam implements Serializable {
    public final Object a;
    public final Object b;

    public aam(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aam)) {
            return false;
        }
        aam aamVar = (aam) obj;
        Object obj2 = aamVar.a;
        Object obj3 = this.a;
        if (obj3 == null ? obj2 == null : obj3.equals(obj2)) {
            Object obj4 = this.b;
            Object obj5 = aamVar.b;
            if (obj4 == null ? obj5 == null : obj4.equals(obj5)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return po.e(po.k(po.k(0, this.a), this.b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
