package com.github.catvod.spider.merge.H;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class D implements z {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    D(TimeZone timeZone, Locale locale, int i) {
        this.a = com.github.catvod.spider.merge.D.c.a(locale);
        this.b = i;
        this.c = N.h(timeZone, false, i, locale);
        this.d = N.h(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) N.h(calendar.getTimeZone(), calendar.get(16) != 0, this.b, this.a));
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return Math.max(this.c.length(), this.d.length());
    }
}
