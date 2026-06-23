package com.github.catvod.spider.merge.D;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class r extends com.github.catvod.spider.merge.C.g implements X, InterfaceC0621w {
    public static final r b = new r();
    private DatatypeFactory a;

    @Override // com.github.catvod.spider.merge.D.InterfaceC0621w
    public final void b(L l, Object obj, C0610k c0610k) {
        h0 h0Var = l.j;
        String strB = c0610k.b();
        Calendar calendar = (Calendar) obj;
        if (strB.equals("unixtime")) {
            h0Var.q((int) (calendar.getTimeInMillis() / 1000));
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strB);
        simpleDateFormat.setTimeZone(l.q);
        h0Var.v(simpleDateFormat.format(calendar.getTime()));
    }

    @Override // com.github.catvod.spider.merge.C.g, com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        return (T) f(bVar, type, obj, null, 0);
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) throws IOException {
        char[] charArray;
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.s();
            return;
        }
        Calendar gregorianCalendar = obj instanceof XMLGregorianCalendar ? ((XMLGregorianCalendar) obj).toGregorianCalendar() : (Calendar) obj;
        if (!h0Var.g(i0.UseISO8601DateFormat)) {
            l.u(gregorianCalendar.getTime());
            return;
        }
        int i2 = h0Var.g(i0.UseSingleQuotes) ? 39 : 34;
        h0Var.write(i2);
        int i3 = gregorianCalendar.get(1);
        int i4 = gregorianCalendar.get(2) + 1;
        int i5 = gregorianCalendar.get(5);
        int i6 = gregorianCalendar.get(11);
        int i7 = gregorianCalendar.get(12);
        int i8 = gregorianCalendar.get(13);
        int i9 = gregorianCalendar.get(14);
        if (i9 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            com.github.catvod.spider.merge.H.i.c(i9, 23, charArray);
            com.github.catvod.spider.merge.H.i.c(i8, 19, charArray);
            com.github.catvod.spider.merge.H.i.c(i7, 16, charArray);
            com.github.catvod.spider.merge.H.i.c(i6, 13, charArray);
            com.github.catvod.spider.merge.H.i.c(i5, 10, charArray);
            com.github.catvod.spider.merge.H.i.c(i4, 7, charArray);
            com.github.catvod.spider.merge.H.i.c(i3, 4, charArray);
        } else if (i8 == 0 && i7 == 0 && i6 == 0) {
            charArray = "0000-00-00".toCharArray();
            com.github.catvod.spider.merge.H.i.c(i5, 10, charArray);
            com.github.catvod.spider.merge.H.i.c(i4, 7, charArray);
            com.github.catvod.spider.merge.H.i.c(i3, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            com.github.catvod.spider.merge.H.i.c(i8, 19, charArray);
            com.github.catvod.spider.merge.H.i.c(i7, 16, charArray);
            com.github.catvod.spider.merge.H.i.c(i6, 13, charArray);
            com.github.catvod.spider.merge.H.i.c(i5, 10, charArray);
            com.github.catvod.spider.merge.H.i.c(i4, 7, charArray);
            com.github.catvod.spider.merge.H.i.c(i3, 4, charArray);
        }
        h0Var.write(charArray);
        float offset = gregorianCalendar.getTimeZone().getOffset(gregorianCalendar.getTimeInMillis()) / 3600000.0f;
        int i10 = (int) offset;
        if (i10 == 0.0d) {
            h0Var.write(90);
        } else {
            if (i10 > 9) {
                h0Var.write(43);
            } else if (i10 > 0) {
                h0Var.write(43);
                h0Var.write(48);
            } else if (i10 < -9) {
                h0Var.write(45);
            } else {
                if (i10 < 0) {
                    h0Var.write(45);
                    h0Var.write(48);
                    h0Var.q(-i10);
                }
                h0Var.write(58);
                h0Var.b(String.format("%02d", Integer.valueOf((int) ((offset - i10) * 60.0f))));
            }
            h0Var.q(i10);
            h0Var.write(58);
            h0Var.b(String.format("%02d", Integer.valueOf((int) ((offset - i10) * 60.0f))));
        }
        h0Var.write(i2);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.util.Calendar] */
    @Override // com.github.catvod.spider.merge.C.g
    public final <T> T f(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj, String str, int i) {
        T t = (T) C0623y.a.f(bVar, type, obj, str, i);
        if (t instanceof Calendar) {
            return t;
        }
        Date date = (Date) t;
        if (date == null) {
            return null;
        }
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        Object r7 = (T) Calendar.getInstance(dVar.M(), dVar.G());
        r7.setTime(date);
        return type == XMLGregorianCalendar.class ? (T) g((GregorianCalendar) r7) : r7;
    }

    public final XMLGregorianCalendar g(Calendar calendar) {
        if (this.a == null) {
            try {
                this.a = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e) {
                throw new IllegalStateException("Could not obtain an instance of DatatypeFactory.", e);
            }
        }
        return this.a.newXMLGregorianCalendar((GregorianCalendar) calendar);
    }
}
