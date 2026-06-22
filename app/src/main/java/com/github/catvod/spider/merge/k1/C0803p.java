package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0803p extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"segundo", "segundos"};
    private static final String[] k = {"minuto", "minutos"};
    private static final String[] l = {"hora", "horas"};
    private static final String[] m = {"día", "días"};
    private static final String[] n = {"semana", "semanas"};
    private static final String[] o = {"mes", "meses"};
    private static final String[] p = {"año", "años"};
    private static final C0803p q = new C0803p();

    private C0803p() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0803p e() {
        return q;
    }
}
