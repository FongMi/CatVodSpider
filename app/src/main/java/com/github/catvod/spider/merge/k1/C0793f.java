package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0793f extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"секунда", "секунди"};
    private static final String[] k = {"минута", "минути"};
    private static final String[] l = {"час", "часа"};
    private static final String[] m = {"ден", "дни"};
    private static final String[] n = {"седмица", "седмици"};
    private static final String[] o = {"месец", "месеца"};
    private static final String[] p = {"година", "години"};
    private static final C0793f q = new C0793f();

    private C0793f() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0793f e() {
        return q;
    }
}
