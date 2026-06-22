package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0800m extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"δευτερόλεπτα", "δευτερόλεπτο"};
    private static final String[] k = {"λεπτά", "λεπτό"};
    private static final String[] l = {"ώρα", "ώρες"};
    private static final String[] m = {"ημέρα", "ημέρες"};
    private static final String[] n = {"εβδομάδα", "εβδομάδες"};
    private static final String[] o = {"μήνα", "μήνες"};
    private static final String[] p = {"χρόνια", "χρόνο"};
    private static final C0800m q = new C0800m();

    private C0800m() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0800m e() {
        return q;
    }
}
