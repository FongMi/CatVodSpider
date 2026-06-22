package com.github.catvod.spider.merge;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ݴ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0276 extends Format {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final AbstractC0233<C0276> f701 = new C0277();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final C0132 f702;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final C0260 f703;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ݴ$Ϳ, reason: contains not printable characters */
    static class C0277 extends AbstractC0233<C0276> {
        C0277() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.github.catvod.spider.merge.AbstractC0233
        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C0276 mo826(String str, TimeZone timeZone, Locale locale) {
            return new C0276(str, timeZone, locale);
        }
    }

    protected C0276(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0276 m1024(String str) {
        return (C0276) f701.m827(str, null, null);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static C0276 m1025(String str, Locale locale) {
        return (C0276) f701.m827(str, null, locale);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0276) {
            return this.f702.equals(((C0276) obj).f702);
        }
        return false;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f702.m469(obj));
        return stringBuffer;
    }

    public int hashCode() {
        return this.f702.hashCode();
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f703.m1011(str, parsePosition);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("3C33220230160E371719061A1B260A"));
        sb.append(this.f702.m473());
        String strD = SOY.d("56");
        sb.append(strD);
        sb.append(this.f702.m472());
        sb.append(strD);
        sb.append(this.f702.m474().getID());
        sb.append(SOY.d("27"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public Date m1026(String str) {
        return this.f703.m1008(str);
    }

    protected C0276(String str, TimeZone timeZone, Locale locale, Date date) {
        this.f702 = new C0132(str, timeZone, locale);
        this.f703 = new C0260(str, timeZone, locale, date);
    }
}
