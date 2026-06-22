package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0798k extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekund", "sekunder"};
    private static final String[] k = {"minut", "minutter"};
    private static final String[] l = {"time", "timer"};
    private static final String[] m = {"dag", "dage"};
    private static final String[] n = {"uge", "uger"};
    private static final String[] o = {"måned", "måneder"};
    private static final String[] p = {"år"};
    private static final C0798k q = new C0798k();

    private C0798k() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0798k e() {
        return q;
    }
}
