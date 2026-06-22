package com.github.catvod.spider.merge.HN;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class P {
    private final Object[] a;
    private final int b;

    P(Object... objArr) {
        this.a = objArr;
        this.b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class == obj.getClass()) {
            return Arrays.deepEquals(this.a, ((P) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
