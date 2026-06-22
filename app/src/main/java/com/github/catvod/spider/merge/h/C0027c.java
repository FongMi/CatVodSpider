package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.A.T;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0027c extends Format {
    public static final C0026b c = new C0026b();
    public final B a;
    public final n b;

    public C0027c(String str, TimeZone timeZone, Locale locale) {
        this.a = new B(str, timeZone, locale);
        this.b = new n(str, timeZone, locale);
    }

    public static C0027c a(String str) {
        return (C0027c) c.a(str, null);
    }

    public final Date b(String str) throws ParseException {
        n nVar = this.b;
        nVar.getClass();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateB = nVar.b(str, parsePosition);
        if (dateB != null) {
            return dateB;
        }
        Locale locale = n.g;
        Locale locale2 = nVar.c;
        if (!locale2.equals(locale)) {
            throw new ParseException(T.f("Unparseable date: ", str), parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + locale2 + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0027c) {
            return this.a.equals(((C0027c) obj).a);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String string;
        B b = this.a;
        b.getClass();
        boolean z = obj instanceof Date;
        int i = 0;
        Locale locale = b.c;
        TimeZone timeZone = b.b;
        if (z) {
            Calendar calendar = Calendar.getInstance(timeZone, locale);
            calendar.setTime((Date) obj);
            StringBuilder sb = new StringBuilder(b.e);
            t[] tVarArr = b.d;
            int length = tVarArr.length;
            while (i < length) {
                tVarArr[i].a(sb, calendar);
                i++;
            }
            string = sb.toString();
        } else if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb2 = new StringBuilder(b.e);
            if (!calendar2.getTimeZone().equals(timeZone)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(timeZone);
            }
            t[] tVarArr2 = b.d;
            int length2 = tVarArr2.length;
            while (i < length2) {
                tVarArr2[i].a(sb2, calendar2);
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
            StringBuilder sb3 = new StringBuilder(b.e);
            t[] tVarArr3 = b.d;
            int length3 = tVarArr3.length;
            while (i < length3) {
                tVarArr3[i].a(sb3, calendar3);
                i++;
            }
            string = sb3.toString();
        }
        stringBuffer.append(string);
        return stringBuffer;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.b.b(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastDateFormat[");
        B b = this.a;
        sb.append(b.a);
        sb.append(",");
        sb.append(b.c);
        sb.append(",");
        sb.append(b.b.getID());
        sb.append("]");
        return sb.toString();
    }
}
