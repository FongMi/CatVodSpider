package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"sekund", "sekundy", "sekundę"};
    private static final String[] k = {"minut", "minuty", "minutę"};
    private static final String[] l = {"godzin", "godziny", "godzinę"};
    private static final String[] m = {"dni", "dzień"};
    private static final String[] n = {"tydzień", "tygodnie"};
    private static final String[] o = {"miesiąc", "miesiące", "miesięcy"};
    private static final String[] p = {"lat", "lata", "rok"};
    private static final e0 q = new e0();

    private e0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static e0 e() {
        return q;
    }
}
