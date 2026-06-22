package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0795h extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekundi", "sekunde", "sekundu"};
    private static final String[] k = {"minuta", "minute", "minutu"};
    private static final String[] l = {"h", "sat", "sata", "sati"};
    private static final String[] m = {"dan", "dana"};
    private static final String[] n = {"sedm."};
    private static final String[] o = {"mj.", "mjesec", "mjeseca", "mjeseci"};
    private static final String[] p = {"godina", "godine", "godinu"};
    private static final C0795h q = new C0795h();

    private C0795h() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0795h e() {
        return q;
    }
}
