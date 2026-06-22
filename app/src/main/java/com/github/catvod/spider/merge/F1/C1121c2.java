package com.github.catvod.spider.merge.f1;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1121c2 {
    final Class<?>[] a;
    final int b;

    C1121c2(Object[] objArr, int i) {
        this.b = i;
        this.a = new Class[objArr.length];
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object objC = objArr[i2];
            objC = objC instanceof L2 ? ((L2) objC).c() : objC;
            this.a[i2] = objC == null ? null : objC.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1121c2)) {
            return false;
        }
        C1121c2 c1121c2 = (C1121c2) obj;
        return Arrays.equals(this.a, c1121c2.a) && this.b == c1121c2.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
