package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class B0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"秒前"};
    private static final String[] k = {"分鐘前"};
    private static final String[] l = {"小時前"};
    private static final String[] m = {"天前"};
    private static final String[] n = {"週前"};
    private static final String[] o = {"個月前"};
    private static final String[] p = {"年前"};
    private static final B0 q = new B0();

    private B0() {
        super("", j, k, l, m, n, o, p);
    }

    public static B0 e() {
        return q;
    }
}
