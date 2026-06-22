package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekunde", "sekundi"};
    private static final String[] k = {"minuta"};
    private static final String[] l = {"sat", "sati", "sata"};
    private static final String[] m = {"Pre 1 dan", "Pre 2 dana", "Pre 3 dana", "Pre 4 dana", "Pre 5 dana", "Pre 6 dana"};
    private static final String[] n = {"nedelja", "nedelje", "nedelju"};
    private static final String[] o = {"mesec", "meseci", "meseca"};
    private static final String[] p = {"godine", "godina", "godinu"};
    private static final o0 q = new o0();

    private o0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static o0 e() {
        return q;
    }
}
