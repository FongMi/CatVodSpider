package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.a.C0529a;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b extends Format {
    private static final g<b> c = new a();
    private final e a;
    private final d b;

    static class a extends g<b> {
        a() {
        }
    }

    protected b(String str, TimeZone timeZone, Locale locale) {
        this.a = new e(str, timeZone, locale);
        this.b = new d(str, timeZone, locale);
    }

    public static b a() {
        return (b) c.a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public static b b(String str) {
        return (b) c.a(str, null);
    }

    public final Date c(String str) {
        return this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.a.d(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.b.i(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("FastDateFormat[");
        sbA.append(this.a.f());
        sbA.append(",");
        sbA.append(this.a.e());
        sbA.append(",");
        sbA.append(this.a.g().getID());
        sbA.append("]");
        return sbA.toString();
    }
}
