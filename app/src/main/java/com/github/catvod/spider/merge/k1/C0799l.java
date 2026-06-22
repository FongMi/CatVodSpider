package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0799l extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"Sekunde", "Sekunden"};
    private static final String[] k = {"Minute", "Minuten"};
    private static final String[] l = {"Stunde", "Stunden"};
    private static final String[] m = {"Tag", "Tagen"};
    private static final String[] n = {"Woche", "Wochen"};
    private static final String[] o = {"Monat", "Monaten"};
    private static final String[] p = {"Jahr", "Jahren"};
    private static final C0799l q = new C0799l();

    private C0799l() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0799l e() {
        return q;
    }
}
