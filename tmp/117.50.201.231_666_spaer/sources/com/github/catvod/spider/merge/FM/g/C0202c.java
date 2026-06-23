package com.github.catvod.spider.merge.FM.G;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0202c extends Format {
    private static final C0201b c = new C0201b();
    private final N a;
    private final t b;

    protected C0202c(String str, TimeZone timeZone, Locale locale) {
        this.a = new N(str, timeZone, locale);
        this.b = new t(str, timeZone, locale);
    }

    public static C0202c a() {
        return (C0202c) c.a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public static C0202c b(String str) {
        return (C0202c) c.a(str, null);
    }

    public final Date c(String str) {
        return this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0202c) {
            return this.a.equals(((C0202c) obj).a);
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("FastDateFormat[");
        sbB.append(this.a.f());
        sbB.append(",");
        sbB.append(this.a.e());
        sbB.append(",");
        sbB.append(this.a.g().getID());
        sbB.append("]");
        return sbB.toString();
    }
}
