package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"секунде", "секунди"};
    private static final String[] k = {"минута"};
    private static final String[] l = {"сат", "сата", "сати"};
    private static final String[] m = {"Пре 1 дан", "Пре 2 дана", "Пре 3 дана", "Пре 4 дана", "Пре 5 дана", "Пре 6 дана"};
    private static final String[] n = {"недеље", "недељу"};
    private static final String[] o = {"месец", "месеца", "месеци"};
    private static final String[] p = {"година", "године", "годину"};
    private static final n0 q = new n0();

    private n0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static n0 e() {
        return q;
    }
}
