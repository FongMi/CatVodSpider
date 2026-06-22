package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekunde", "sekundi", "sekundu"};
    private static final String[] k = {"minuta", "minute", "minutu"};
    private static final String[] l = {"sat", "sata", "sati"};
    private static final String[] m = {"dan", "dana"};
    private static final String[] n = {"tjedan", "tjedna"};
    private static final String[] o = {"mjesec", "mjeseca", "mjeseci"};
    private static final String[] p = {"godina", "godine", "godinu"};
    private static final C q = new C();

    private C() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C e() {
        return q;
    }
}
