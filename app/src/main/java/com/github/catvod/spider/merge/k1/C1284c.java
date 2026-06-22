package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.I.t0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1284c {
    private long a;
    private int b;

    C1284c() {
        this.a = 0L;
        this.b = 0;
    }

    C1284c(long j, int i) {
        this.a = j;
        this.b = i;
    }

    static C1284c c(C1284c c1284c, C1284c c1284c2) {
        C1284c c1284c3 = new C1284c(c1284c.a, c1284c.b);
        c1284c3.a -= c1284c2.a;
        return c1284c3;
    }

    static C1284c g(C1284c c1284c, C1284c c1284c2) {
        C1284c c1284c3 = new C1284c(c1284c.a, c1284c.b);
        long j = c1284c3.a;
        long j2 = j >>> 32;
        long j3 = j & 4294967295L;
        long j4 = c1284c2.a;
        long j5 = j4 >>> 32;
        long j6 = j4 & 4294967295L;
        long j7 = j2 * j5;
        long j8 = j5 * j3;
        long j9 = j2 * j6;
        c1284c3.b = c1284c2.b + 64 + c1284c3.b;
        c1284c3.a = j7 + (j9 >>> 32) + (j8 >>> 32) + ((((((j3 * j6) >>> 32) + (j9 & 4294967295L)) + (4294967295L & j8)) + 2147483648L) >>> 32);
        return c1284c3;
    }

    final int a() {
        return this.b;
    }

    final long b() {
        return this.a;
    }

    final void d() {
        long j = this.a;
        int i = this.b;
        while (((-18014398509481984L) & j) == 0) {
            j <<= 10;
            i -= 10;
        }
        while ((Long.MIN_VALUE & j) == 0) {
            j <<= 1;
            i--;
        }
        this.a = j;
        this.b = i;
    }

    final void e(int i) {
        this.b = i;
    }

    final void f(long j) {
        this.a = j;
    }

    public final String toString() {
        StringBuilder sbB = t0.b("[DiyFp f:");
        sbB.append(this.a);
        sbB.append(", e:");
        sbB.append(this.b);
        sbB.append("]");
        return sbB.toString();
    }
}
