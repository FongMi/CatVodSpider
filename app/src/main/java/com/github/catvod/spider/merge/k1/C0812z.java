package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0812z extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"segundo", "segundos"};
    private static final String[] k = {"minuto", "minutos"};
    private static final String[] l = {"hora", "horas"};
    private static final String[] m = {"día", "días"};
    private static final String[] n = {"semana", "semanas"};
    private static final String[] o = {"mes", "meses"};
    private static final String[] p = {"ano", "anos"};
    private static final C0812z q = new C0812z();

    private C0812z() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0812z e() {
        return q;
    }
}
