package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekund", "sekunder"};
    private static final String[] k = {"minut", "minuter"};
    private static final String[] l = {"timmar", "timme"};
    private static final String[] m = {"dag", "dagar"};
    private static final String[] n = {"vecka", "veckor"};
    private static final String[] o = {"månad", "månader"};
    private static final String[] p = {"år"};
    private static final p0 q = new p0();

    private p0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static p0 e() {
        return q;
    }
}
