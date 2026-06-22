package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class U extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"секунда", "секунди"};
    private static final String[] k = {"минута", "минути"};
    private static final String[] l = {"час", "часа"};
    private static final String[] m = {"ден", "дена"};
    private static final String[] n = {"недела", "недели"};
    private static final String[] o = {"месец", "месеци"};
    private static final String[] p = {"година", "години"};
    private static final U q = new U();

    private U() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static U e() {
        return q;
    }
}
