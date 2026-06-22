package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class B extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"सेकंड"};
    private static final String[] k = {"मिनट"};
    private static final String[] l = {"घंटा", "घंटे"};
    private static final String[] m = {"दिन"};
    private static final String[] n = {"सप्ताह", "हफ़्ते"};
    private static final String[] o = {"महीना", "महीने"};
    private static final String[] p = {"वर्ष"};
    private static final B q = new B();

    private B() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static B e() {
        return q;
    }
}
