package com.github.catvod.spider.merge.K1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i0 extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"секунд", "секунду", "секунды", "только что"};
    private static final String[] k = {"минут", "минуту", "минуты"};
    private static final String[] l = {"час", "часа", "часов"};
    private static final String[] m = {"день", "дней", "дня"};
    private static final String[] n = {"Неделю", "недели"};
    private static final String[] o = {"месяц", "месяца", "месяцев"};
    private static final String[] p = {"Год", "года", "лет"};
    private static final i0 q = new i0();

    private i0() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static i0 e() {
        return q;
    }
}
