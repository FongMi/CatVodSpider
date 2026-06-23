package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class D implements z {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    D(TimeZone timeZone, Locale locale, int i) {
        this.a = com.github.catvod.spider.merge.FM.C.c.a(locale);
        this.b = i;
        this.c = N.h(timeZone, false, i, locale);
        this.d = N.h(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) N.h(calendar.getTimeZone(), calendar.get(16) != 0, this.b, this.a));
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final int c() {
        return Math.max(this.c.length(), this.d.length());
    }
}
