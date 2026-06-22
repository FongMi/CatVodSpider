package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class H extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"secondi", "secondo"};
    private static final String[] k = {"minuti", "minuto"};
    private static final String[] l = {"ora", "ore"};
    private static final String[] m = {"giorni", "giorno"};
    private static final String[] n = {"settimana", "settimane"};
    private static final String[] o = {"mese", "mesi"};
    private static final String[] p = {"anni", "anno"};
    private static final H q = new H();

    private H() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static H e() {
        return q;
    }
}
