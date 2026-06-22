package com.github.catvod.spider.merge.K1;

import java.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class I extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"שניות", "שנייה"};
    private static final String[] k = {"דקה", "דקות"};
    private static final String[] l = {"שעה", "שעות"};
    private static final String[] m = {"יום", "ימים"};
    private static final String[] n = {"שבוע", "שבועות"};
    private static final String[] o = {"חודש", "חודשים"};
    private static final String[] p = {"שנה", "שנים"};
    private static final I q = new I();

    private I() {
        super(" ", j, k, l, m, n, o, p);
        b(ChronoUnit.HOURS, "שעתיים");
        b(ChronoUnit.DAYS, "יומיים");
        b(ChronoUnit.WEEKS, "שבועיים");
        b(ChronoUnit.MONTHS, "חודשיים");
        b(ChronoUnit.YEARS, "שנתיים");
    }

    public static I e() {
        return q;
    }
}
