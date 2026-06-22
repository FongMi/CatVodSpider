package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0788b0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"seconde", "seconden"};
    private static final String[] k = {"minuten", "minuut"};
    private static final String[] l = {"uur"};
    private static final String[] m = {"dag", "dagen"};
    private static final String[] n = {"week", "weken"};
    private static final String[] o = {"maand", "maanden"};
    private static final String[] p = {"jaar"};
    private static final C0788b0 q = new C0788b0();

    private C0788b0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0788b0 e() {
        return q;
    }
}
