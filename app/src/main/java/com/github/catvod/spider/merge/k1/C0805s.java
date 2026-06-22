package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0805s extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekund", "sekundit"};
    private static final String[] k = {"minut", "minutit"};
    private static final String[] l = {"tund", "tundi"};
    private static final String[] m = {"päev", "päeva"};
    private static final String[] n = {"nädal", "nädalat"};
    private static final String[] o = {"kuu", "kuud"};
    private static final String[] p = {"aasta", "aastat"};
    private static final C0805s q = new C0805s();

    private C0805s() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0805s e() {
        return q;
    }
}
