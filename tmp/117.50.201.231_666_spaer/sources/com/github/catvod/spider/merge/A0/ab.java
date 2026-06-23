package com.github.catvod.spider.merge.A0;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ab {
    public final Object[] a;
    public final int b;

    public ab(Object... objArr) {
        this.a = objArr;
        this.b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ab.class == obj.getClass()) {
            return Arrays.deepEquals(this.a, ((ab) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
