package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0808v extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekunti", "sekuntia"};
    private static final String[] k = {"minuutti", "minuuttia"};
    private static final String[] l = {"tunti", "tuntia"};
    private static final String[] m = {"päivä", "päivää"};
    private static final String[] n = {"viikko", "viikkoa"};
    private static final String[] o = {"kuukausi", "kuukautta"};
    private static final String[] p = {"vuosi", "vuotta"};
    private static final C0808v q = new C0808v();

    private C0808v() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0808v e() {
        return q;
    }
}
