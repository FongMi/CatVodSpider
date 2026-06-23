package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N implements Serializable {
    private static final z[] f = new z[0];
    private static final ConcurrentMap<C, String> g = new ConcurrentHashMap(7);
    private final String a;
    private final TimeZone b;
    private final Locale c;
    private transient z[] d;
    private transient int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020e A[LOOP:2: B:118:0x020a->B:120:0x020e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected N(java.lang.String r17, java.util.TimeZone r18, java.util.Locale r19) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.HN.N.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    static void a(Appendable appendable, int i) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    static void b(Appendable appendable, int i, int i2) {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i / 1000) + 48));
                        i %= 1000;
                    }
                    if (i >= 100) {
                        ((StringBuilder) appendable).append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i >= 10) {
                    ((StringBuilder) appendable).append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            ((StringBuilder) appendable).append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                ((StringBuilder) appendable).append(cArr[i5]);
            }
        }
    }

    private String c(Calendar calendar) throws IOException {
        StringBuilder sb = new StringBuilder(this.e);
        try {
            for (z zVar : this.d) {
                zVar.b(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.HN.C, java.lang.String>] */
    static String h(TimeZone timeZone, boolean z, int i, Locale locale) {
        C c = new C(timeZone, z, i, locale);
        Object r1 = g;
        String str = (String) r1.get(c);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) r1.putIfAbsent(c, displayName);
        return str2 != null ? str2 : displayName;
    }

    final String d(Object obj) throws IOException {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.b, this.c);
            calendar.setTime((Date) obj);
            return c(calendar);
        }
        if (!(obj instanceof Calendar)) {
            if (!(obj instanceof Long)) {
                StringBuilder sbB = C0925t.b(ZrJ.d("2C2D202327321763282129360A796B"));
                sbB.append(obj == null ? ZrJ.d("452D3E21247B") : obj.getClass().getName());
                throw new IllegalArgumentException(sbB.toString());
            }
            long jLongValue = ((Long) obj).longValue();
            Calendar calendar2 = Calendar.getInstance(this.b, this.c);
            calendar2.setTimeInMillis(jLongValue);
            return c(calendar2);
        }
        Calendar calendar3 = (Calendar) obj;
        StringBuilder sb = new StringBuilder(this.e);
        if (!calendar3.getTimeZone().equals(this.b)) {
            calendar3 = (Calendar) calendar3.clone();
            calendar3.setTimeZone(this.b);
        }
        try {
            for (z zVar : this.d) {
                zVar.b(sb, calendar3);
            }
            return sb.toString();
        } catch (IOException e) {
            throw e;
        }
    }

    public final Locale e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return this.a.equals(n.a) && this.b.equals(n.b) && this.c.equals(n.c);
    }

    public final String f() {
        return this.a;
    }

    public final TimeZone g() {
        return this.b;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    protected final x i(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new y(i, i2) : new I(i) : new L(i);
    }

    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("3F2238390C240D261B3F212B0D263916"));
        sbB.append(this.a);
        String strD = ZrJ.d("55");
        sbB.append(strD);
        sbB.append(this.c);
        sbB.append(strD);
        sbB.append(this.b.getID());
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
