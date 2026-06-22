package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0811y extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"seconde", "secondes"};
    private static final String[] k = {"minute", "minutes"};
    private static final String[] l = {"heures", "heure"};
    private static final String[] m = {"jour", "jours"};
    private static final String[] n = {"semaine", "semaines"};
    private static final String[] o = {"mois"};
    private static final String[] p = {"an", "ans"};
    private static final C0811y q = new C0811y();

    private C0811y() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0811y e() {
        return q;
    }
}
