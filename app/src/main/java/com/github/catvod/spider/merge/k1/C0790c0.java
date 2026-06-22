package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0790c0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekund", "sekunder"};
    private static final String[] k = {"minutt", "minutter"};
    private static final String[] l = {"time", "timer"};
    private static final String[] m = {"dag", "dager"};
    private static final String[] n = {"uke", "uker"};
    private static final String[] o = {"md."};
    private static final String[] p = {"år"};
    private static final C0790c0 q = new C0790c0();

    private C0790c0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0790c0 e() {
        return q;
    }
}
