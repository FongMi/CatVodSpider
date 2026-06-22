package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0002c extends Format {
    private static final C0001b c = new C0001b();
    private final N a;
    private final t b;

    protected C0002c(String str, TimeZone timeZone, Locale locale) {
        this.a = new N(str, timeZone, locale);
        this.b = new t(str, timeZone, locale);
    }

    public static C0002c a() {
        return (C0002c) c.a(oZP.d("302A326D4C31114F3A0C21750C160E384C1D3D551A2C5626064F2D"), Locale.US);
    }

    public static C0002c b(String str) {
        return (C0002c) c.a(str, null);
    }

    public final Date c(String str) {
        return this.b.h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0002c) {
            return this.a.equals(((C0002c) obj).a);
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
        StringBuilder sbC = C0133t.c(oZP.d("330E04352834010A312E1E38141B2C"));
        sbC.append(this.a.f());
        String strD = oZP.d("59");
        sbC.append(strD);
        sbC.append(this.a.e());
        sbC.append(strD);
        sbC.append(this.a.g().getID());
        sbC.append(oZP.d("28"));
        return sbC.toString();
    }
}
