package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0810x extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"seconde", "secondes"};
    private static final String[] k = {"minute", "minutes"};
    private static final String[] l = {"heure", "heures"};
    private static final String[] m = {"jour", "jours"};
    private static final String[] n = {"semaine", "semaines"};
    private static final String[] o = {"mois"};
    private static final String[] p = {"an", "ans"};
    private static final C0810x q = new C0810x();

    private C0810x() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0810x e() {
        return q;
    }
}
