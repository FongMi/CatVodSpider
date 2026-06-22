package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0792e extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"секунд", "секунду", "секунды"};
    private static final String[] k = {"хвілін", "хвіліну", "хвіліны"};
    private static final String[] l = {"гадзін", "гадзіну", "гадзіны"};
    private static final String[] m = {"дзень", "дзён", "дня", "дні"};
    private static final String[] n = {"тыдзень", "тыдня", "тыдні"};
    private static final String[] o = {"месяц", "месяца", "месяцы", "месяцаў"};
    private static final String[] p = {"год", "года", "гады", "гадоў"};
    private static final C0792e q = new C0792e();

    private C0792e() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0792e e() {
        return q;
    }
}
