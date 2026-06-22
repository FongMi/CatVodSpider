package com.github.catvod.spider.merge.C;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class h implements Serializable {
    public final Object a;
    public final Object b;

    public h(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        Object obj2 = hVar.a;
        Object obj3 = this.a;
        if (obj3 == null ? obj2 == null : obj3.equals(obj2)) {
            Object obj4 = this.b;
            Object obj5 = hVar.b;
            if (obj4 == null ? obj5 == null : obj4.equals(obj5)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.c(0, this.a), this.b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
