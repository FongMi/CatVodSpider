package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class J extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"秒前"};
    private static final String[] k = {"分前"};
    private static final String[] l = {"時間前"};
    private static final String[] m = {"日前"};
    private static final String[] n = {"週間前"};
    private static final String[] o = {"か月前"};
    private static final String[] p = {"年前"};
    private static final J q = new J();

    private J() {
        super("", j, k, l, m, n, o, p);
    }

    public static J e() {
        return q;
    }
}
