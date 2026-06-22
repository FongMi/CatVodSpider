package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0796i extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"segon", "segons"};
    private static final String[] k = {"minut", "minuts"};
    private static final String[] l = {"hora", "hores"};
    private static final String[] m = {"dia", "dies"};
    private static final String[] n = {"setmana", "setmanes"};
    private static final String[] o = {"mes", "mesos"};
    private static final String[] p = {"any", "anys"};
    private static final C0796i q = new C0796i();

    private C0796i() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0796i e() {
        return q;
    }
}
