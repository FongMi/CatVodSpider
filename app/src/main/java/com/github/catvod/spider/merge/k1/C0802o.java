package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0802o extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"second", "seconds", "sec"};
    private static final String[] k = {"minute", "minutes", "min"};
    private static final String[] l = {"hour", "hours", "hr"};
    private static final String[] m = {"day", "days"};
    private static final String[] n = {"week", "weeks", "wk"};
    private static final String[] o = {"month", "months", "mo"};
    private static final String[] p = {"year", "years", "yr"};
    private static final C0802o q = new C0802o();

    private C0802o() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0802o e() {
        return q;
    }
}
