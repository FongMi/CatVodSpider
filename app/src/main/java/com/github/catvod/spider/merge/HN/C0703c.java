package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0703c extends Format {
    private static final C0702b c = new C0702b();
    private final N a;
    private final t b;

    protected C0703c(String str, TimeZone timeZone, Locale locale) {
        this.a = new N(str, timeZone, locale);
        this.b = new t(str, timeZone, locale);
    }

    public static C0703c a() {
        return (C0703c) c.a(ZrJ.d("3C060E6168211D6306000565003A3234680D3179262072360A6311"), Locale.US);
    }

    public static C0703c b(String str) {
        return (C0703c) c.a(str, null);
    }

    public final Date c(String str) {
        return this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0703c) {
            return this.a.equals(((C0703c) obj).a);
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
        StringBuilder sbB = C0925t.b(ZrJ.d("3F2238390C240D260D223A28183710"));
        sbB.append(this.a.f());
        String strD = ZrJ.d("55");
        sbB.append(strD);
        sbB.append(this.a.e());
        sbB.append(strD);
        sbB.append(this.a.g().getID());
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
