package com.github.catvod.spider.merge.H;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class D {
    public final Object[] a;
    public final int b;

    public D(Object... objArr) {
        this.a = objArr;
        this.b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D.class == obj.getClass()) {
            return Arrays.deepEquals(this.a, ((D) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
