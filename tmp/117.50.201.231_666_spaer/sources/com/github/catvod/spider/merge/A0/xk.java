package com.github.catvod.spider.merge.A0;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xk implements u {
    public final Locale a;
    public final int b;
    public final String c;
    public final String d;

    public xk(TimeZone timeZone, Locale locale, int i) {
        this.a = at.a(locale);
        this.b = i;
        this.c = hi.j(timeZone, false, i, locale);
        this.d = hi.j(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        TimeZone timeZone = calendar.getTimeZone();
        int i = calendar.get(16);
        Locale locale = this.a;
        int i2 = this.b;
        if (i == 0) {
            sb.append((CharSequence) hi.j(timeZone, false, i2, locale));
        } else {
            sb.append((CharSequence) hi.j(timeZone, true, i2, locale));
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        return Math.max(this.c.length(), this.d.length());
    }
}
