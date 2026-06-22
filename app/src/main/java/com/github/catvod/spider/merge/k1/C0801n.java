package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0801n extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"second", "seconds", "sec"};
    private static final String[] k = {"minute", "minutes", "min"};
    private static final String[] l = {"hour", "hours", "h"};
    private static final String[] m = {"day", "days", "d"};
    private static final String[] n = {"week", "weeks", "w"};
    private static final String[] o = {"month", "months", "mo"};
    private static final String[] p = {"year", "years", "y"};
    private static final C0801n q = new C0801n();

    private C0801n() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0801n e() {
        return q;
    }
}
