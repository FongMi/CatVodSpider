package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0785a extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekonde", "sekondes"};
    private static final String[] k = {"minute", "minuut"};
    private static final String[] l = {"ure", "uur"};
    private static final String[] m = {"dae", "dag"};
    private static final String[] n = {"week", "weke"};
    private static final String[] o = {"maand", "maande"};
    private static final String[] p = {"jaar"};
    private static final C0785a q = new C0785a();

    private C0785a() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0785a e() {
        return q;
    }
}
