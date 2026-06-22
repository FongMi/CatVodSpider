package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.C.AbstractC0598d;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0623y extends AbstractC0598d implements X {
    public static final C0623y a = new C0623y();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) throws IOException {
        char[] charArray;
        int i2;
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.s();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Date.class && !h0Var.g(i0.WriteDateUseDateFormat)) {
            long time = ((Date) obj).getTime();
            if ((time + ((long) l.q.getOffset(time))) % 86400000 == 0 && !i0.a(h0Var.d, i, i0.WriteClassName)) {
                h0Var.v(obj.toString());
                return;
            }
        }
        if (cls == Time.class) {
            long time2 = ((Time) obj).getTime();
            if ("unixtime".equals(l.m())) {
                h0Var.r(time2 / 1000);
                return;
            } else if ("millis".equals(l.m())) {
                h0Var.r(time2);
                return;
            } else if (time2 < 86400000) {
                h0Var.v(obj.toString());
                return;
            }
        }
        int nanos = cls == Timestamp.class ? ((Timestamp) obj).getNanos() : 0;
        java.util.Date dateL = obj instanceof java.util.Date ? (java.util.Date) obj : com.github.catvod.spider.merge.H.A.l(obj, null);
        if ("unixtime".equals(l.m())) {
            h0Var.r(dateL.getTime() / 1000);
            return;
        }
        if ("millis".equals(l.m())) {
            h0Var.r(dateL.getTime());
            return;
        }
        if (h0Var.g(i0.WriteDateUseDateFormat)) {
            DateFormat dateFormatL = l.l();
            if (dateFormatL == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC1412a.f, l.r);
                simpleDateFormat.setTimeZone(l.q);
                dateFormatL = simpleDateFormat;
            }
            h0Var.v(dateFormatL.format(dateL));
            return;
        }
        if (h0Var.g(i0.WriteClassName) && cls != type) {
            if (cls == java.util.Date.class) {
                h0Var.write("new Date(");
                h0Var.r(((java.util.Date) obj).getTime());
                i2 = 41;
            } else {
                h0Var.write(123);
                h0Var.j(AbstractC1412a.d);
                l.v(cls.getName());
                h0Var.l(',', "val", ((java.util.Date) obj).getTime());
                i2 = 125;
            }
            h0Var.write(i2);
            return;
        }
        long time3 = dateL.getTime();
        if (!h0Var.g(i0.UseISO8601DateFormat)) {
            h0Var.r(time3);
            return;
        }
        int i3 = h0Var.g(i0.UseSingleQuotes) ? 39 : 34;
        h0Var.write(i3);
        Calendar calendar = Calendar.getInstance(l.q, l.r);
        calendar.setTimeInMillis(time3);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2) + 1;
        int i6 = calendar.get(5);
        int i7 = calendar.get(11);
        int i8 = calendar.get(12);
        int i9 = calendar.get(13);
        int i10 = calendar.get(14);
        if (nanos > 0) {
            charArray = "0000-00-00 00:00:00.000000000".toCharArray();
            com.github.catvod.spider.merge.H.i.c(nanos, 29, charArray);
            com.github.catvod.spider.merge.H.i.c(i9, 19, charArray);
            com.github.catvod.spider.merge.H.i.c(i8, 16, charArray);
            com.github.catvod.spider.merge.H.i.c(i7, 13, charArray);
            com.github.catvod.spider.merge.H.i.c(i6, 10, charArray);
            com.github.catvod.spider.merge.H.i.c(i5, 7, charArray);
            com.github.catvod.spider.merge.H.i.c(i4, 4, charArray);
        } else if (i10 != 0) {
            char[] charArray2 = "0000-00-00T00:00:00.000".toCharArray();
            com.github.catvod.spider.merge.H.i.c(i10, 23, charArray2);
            com.github.catvod.spider.merge.H.i.c(i9, 19, charArray2);
            com.github.catvod.spider.merge.H.i.c(i8, 16, charArray2);
            com.github.catvod.spider.merge.H.i.c(i7, 13, charArray2);
            com.github.catvod.spider.merge.H.i.c(i6, 10, charArray2);
            com.github.catvod.spider.merge.H.i.c(i5, 7, charArray2);
            com.github.catvod.spider.merge.H.i.c(i4, 4, charArray2);
            charArray = charArray2;
        } else if (i9 == 0 && i8 == 0 && i7 == 0) {
            char[] charArray3 = "0000-00-00".toCharArray();
            com.github.catvod.spider.merge.H.i.c(i6, 10, charArray3);
            com.github.catvod.spider.merge.H.i.c(i5, 7, charArray3);
            com.github.catvod.spider.merge.H.i.c(i4, 4, charArray3);
            charArray = charArray3;
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            com.github.catvod.spider.merge.H.i.c(i9, 19, charArray);
            com.github.catvod.spider.merge.H.i.c(i8, 16, charArray);
            com.github.catvod.spider.merge.H.i.c(i7, 13, charArray);
            com.github.catvod.spider.merge.H.i.c(i6, 10, charArray);
            com.github.catvod.spider.merge.H.i.c(i5, 7, charArray);
            com.github.catvod.spider.merge.H.i.c(i4, 4, charArray);
        }
        if (nanos > 0) {
            int i11 = 0;
            while (i11 < 9 && charArray[(charArray.length - i11) - 1] == '0') {
                i11++;
            }
            h0Var.write(charArray, 0, charArray.length - i11);
            h0Var.write(i3);
            return;
        }
        h0Var.write(charArray);
        float offset = calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 3600000.0f;
        int i12 = (int) offset;
        if (i12 == 0.0d) {
            h0Var.write(90);
        } else {
            if (i12 > 9) {
                h0Var.write(43);
            } else if (i12 > 0) {
                h0Var.write(43);
                h0Var.write(48);
            } else {
                if (i12 < -9) {
                    h0Var.write(45);
                } else {
                    if (i12 < 0) {
                        h0Var.write(45);
                        h0Var.write(48);
                    }
                    h0Var.write(58);
                    h0Var.b(String.format("%02d", Integer.valueOf((int) (Math.abs(offset - i12) * 60.0f))));
                }
                h0Var.q(-i12);
                h0Var.write(58);
                h0Var.b(String.format("%02d", Integer.valueOf((int) (Math.abs(offset - i12) * 60.0f))));
            }
            h0Var.q(i12);
            h0Var.write(58);
            h0Var.b(String.format("%02d", Integer.valueOf((int) (Math.abs(offset - i12) * 60.0f))));
        }
        h0Var.write(i3);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.C.AbstractC0598d
    public final Object g(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Date) {
            return obj;
        }
        if (obj instanceof BigDecimal) {
            return new java.util.Date(com.github.catvod.spider.merge.H.A.o0((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return new java.util.Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new C1415d("parse error");
        }
        String strSubstring = (String) obj;
        if (strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.length() == 23 && strSubstring.endsWith(" 000")) {
            strSubstring = strSubstring.substring(0, 19);
        }
        com.github.catvod.spider.merge.B.i iVar = new com.github.catvod.spider.merge.B.i(strSubstring);
        try {
            if (iVar.x0(false)) {
                Calendar calendarS = iVar.S();
                return type == Calendar.class ? calendarS : calendarS.getTime();
            }
            iVar.close();
            String strG = bVar.g();
            if (strSubstring.length() == strG.length() || (strSubstring.length() == 22 && strG.equals("yyyyMMddHHmmssSSSZ")) || (strSubstring.indexOf(84) != -1 && strG.contains("'T'") && strSubstring.length() + 2 == strG.length())) {
                try {
                    return bVar.h().parse(strSubstring);
                } catch (ParseException unused) {
                }
            }
            if (strSubstring.startsWith("/Date(") && strSubstring.endsWith(")/")) {
                strSubstring = strSubstring.substring(6, strSubstring.length() - 2);
            }
            if ("0000-00-00".equals(strSubstring) || "0000-00-00T00:00:00".equalsIgnoreCase(strSubstring) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(strSubstring)) {
                return null;
            }
            int iLastIndexOf = strSubstring.lastIndexOf(124);
            if (iLastIndexOf > 20) {
                TimeZone timeZone = TimeZone.getTimeZone(strSubstring.substring(iLastIndexOf + 1));
                if (!"GMT".equals(timeZone.getID())) {
                    iVar = new com.github.catvod.spider.merge.B.i(strSubstring.substring(0, iLastIndexOf));
                    try {
                        if (iVar.x0(false)) {
                            Calendar calendarS2 = iVar.S();
                            calendarS2.setTimeZone(timeZone);
                            return type == Calendar.class ? calendarS2 : calendarS2.getTime();
                        }
                    } finally {
                    }
                }
            }
            return new java.util.Date(Long.parseLong(strSubstring));
        } finally {
        }
    }
}
