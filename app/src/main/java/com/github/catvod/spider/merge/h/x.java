package com.github.catvod.spider.merge.H;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class x implements t {
    public final Locale a;
    public final int b;
    public final String c;
    public final String d;

    public x(TimeZone timeZone, Locale locale, int i) {
        this.a = com.github.catvod.spider.merge.E.b.a(locale);
        this.b = i;
        this.c = B.c(timeZone, false, i, locale);
        this.d = B.c(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        TimeZone timeZone = calendar.getTimeZone();
        int i = calendar.get(16);
        Locale locale = this.a;
        sb.append((CharSequence) B.c(timeZone, i != 0, this.b, locale));
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        return Math.max(this.c.length(), this.d.length());
    }
}
