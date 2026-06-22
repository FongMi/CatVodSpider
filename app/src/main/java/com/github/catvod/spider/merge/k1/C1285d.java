package com.github.catvod.spider.merge.k1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1285d {
    static int a(long j) {
        if ((j & 9218868437227405312L) == 0) {
            return -1074;
        }
        return ((int) ((r3 >>> 52) & 4294967295L)) - 1075;
    }

    static long b(long j) {
        long j2 = 4503599627370495L & j;
        return !(((j & 9218868437227405312L) > 0L ? 1 : ((j & 9218868437227405312L) == 0L ? 0 : -1)) == 0) ? j2 + 4503599627370496L : j2;
    }
}
