package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class v0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"секунд", "секунди", "секунду"};
    private static final String[] k = {"хвилин", "хвилини", "хвилину"};
    private static final String[] l = {"годин", "години", "годину"};
    private static final String[] m = {"день", "дні", "днів"};
    private static final String[] n = {"тиждень", "тижні"};
    private static final String[] o = {"місяць", "місяці", "місяців"};
    private static final String[] p = {"роки", "років", "рік"};
    private static final v0 q = new v0();

    private v0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static v0 e() {
        return q;
    }
}
