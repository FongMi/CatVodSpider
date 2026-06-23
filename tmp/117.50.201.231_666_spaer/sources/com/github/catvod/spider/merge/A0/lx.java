package com.github.catvod.spider.merge.A0;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lx extends Format {
    public static final eq a = new eq();
    public final hi b;
    public final abe c;

    public lx(String str, TimeZone timeZone, Locale locale) {
        this.b = new hi(str, timeZone, locale);
        this.c = new abe(str, timeZone, locale);
    }

    public static lx d(String str) {
        return (lx) a.b(str, null);
    }

    public final Date e(String str) throws ParseException {
        abe abeVar = this.c;
        abeVar.getClass();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateAb = abeVar.ab(str, parsePosition);
        if (dateAb != null) {
            return dateAb;
        }
        Locale locale = abe.a;
        Locale locale2 = abeVar.v;
        if (!locale2.equals(locale)) {
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + locale2 + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lx) {
            return this.b.equals(((lx) obj).b);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String string;
        hi hiVar = this.b;
        hiVar.getClass();
        boolean z = obj instanceof Date;
        int i = 0;
        Locale locale = hiVar.e;
        TimeZone timeZone = hiVar.d;
        if (z) {
            Calendar calendar = Calendar.getInstance(timeZone, locale);
            calendar.setTime((Date) obj);
            StringBuilder sb = new StringBuilder(hiVar.g);
            u[] uVarArr = hiVar.f;
            int length = uVarArr.length;
            while (i < length) {
                uVarArr[i].e(sb, calendar);
                i++;
            }
            string = sb.toString();
        } else if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb2 = new StringBuilder(hiVar.g);
            if (!calendar2.getTimeZone().equals(timeZone)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(timeZone);
            }
            u[] uVarArr2 = hiVar.f;
            int length2 = uVarArr2.length;
            while (i < length2) {
                uVarArr2[i].e(sb2, calendar2);
                i++;
            }
            string = sb2.toString();
        } else {
            if (!(obj instanceof Long)) {
                throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
            }
            long jLongValue = ((Long) obj).longValue();
            Calendar calendar3 = Calendar.getInstance(timeZone, locale);
            calendar3.setTimeInMillis(jLongValue);
            StringBuilder sb3 = new StringBuilder(hiVar.g);
            u[] uVarArr3 = hiVar.f;
            int length3 = uVarArr3.length;
            while (i < length3) {
                uVarArr3[i].e(sb3, calendar3);
                i++;
            }
            string = sb3.toString();
        }
        stringBuffer.append(string);
        return stringBuffer;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.c.ab(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastDateFormat[");
        hi hiVar = this.b;
        sb.append(hiVar.c);
        sb.append(",");
        sb.append(hiVar.e);
        sb.append(",");
        sb.append(hiVar.d.getID());
        sb.append("]");
        return sb.toString();
    }
}
