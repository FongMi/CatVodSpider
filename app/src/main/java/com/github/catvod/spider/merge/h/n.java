package com.github.catvod.spider.merge.H;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class n implements Serializable {
    public static final Locale g = new Locale("ja", "JP", "JP");
    public static final Comparator h = Comparator.reverseOrder();
    public static final ConcurrentMap[] i = new ConcurrentMap[17];
    public static final C0028d j = new C0028d(0);
    public static final C0028d k = new C0028d(1);
    public static final h l = new h(1);
    public static final h m = new h(3);
    public static final h n = new h(4);
    public static final h o = new h(6);
    public static final h p = new h(5);
    public static final C0028d q = new C0028d(2);
    public static final h r = new h(8);
    public static final h s = new h(11);
    public static final C0028d t = new C0028d(3);
    public static final C0028d u = new C0028d(4);
    public static final h v = new h(10);
    public static final h w = new h(12);
    public static final h x = new h(13);
    public static final h y = new h(14);
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final int d;
    public final int e;
    public final transient ArrayList f;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0157 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(java.lang.String r12, java.util.TimeZone r13, java.util.Locale r14) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.n.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.StringBuilder r6, java.lang.String r7) {
        /*
            r0 = 0
        L1:
            int r1 = r7.length()
            r2 = 63
            r3 = 46
            if (r0 >= r1) goto L38
            char r1 = r7.charAt(r0)
            r4 = 36
            r5 = 92
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2f
            r2 = 94
            if (r1 == r2) goto L2f
            r2 = 91
            if (r1 == r2) goto L2f
            if (r1 == r5) goto L2f
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L2f
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 == r2) goto L2f
            switch(r1) {
                case 40: goto L2f;
                case 41: goto L2f;
                case 42: goto L2f;
                case 43: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L32
        L2f:
            r6.append(r5)
        L32:
            r6.append(r1)
            int r0 = r0 + 1
            goto L1
        L38:
            int r7 = r6.length()
            int r7 = r7 + (-1)
            char r7 = r6.charAt(r7)
            if (r7 != r3) goto L47
            r6.append(r2)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.n.c(java.lang.StringBuilder, java.lang.String):void");
    }

    public final j a(int i2, Calendar calendar) {
        ConcurrentMap concurrentMap;
        ConcurrentMap[] concurrentMapArr = i;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i2] == null) {
                    concurrentMapArr[i2] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i2];
            } catch (Throwable th) {
                throw th;
            }
        }
        j mVar = (j) concurrentMap.get(this.c);
        if (mVar == null) {
            mVar = i2 == 15 ? new m(this.c) : new C0029e(i2, calendar, this.c);
            j jVar = (j) concurrentMap.putIfAbsent(this.c, mVar);
            if (jVar != null) {
                return jVar;
            }
        }
        return mVar;
    }

    public final Date b(String str, ParsePosition parsePosition) {
        int i2;
        Calendar calendar = Calendar.getInstance(this.b, this.c);
        calendar.clear();
        ListIterator listIterator = this.f.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (kVar.a.a() && listIterator.hasNext()) {
                j jVar = ((k) listIterator.next()).a;
                listIterator.previous();
                i2 = jVar.a() ? kVar.b : 0;
            } else {
                i2 = 0;
            }
            if (!kVar.a.b(this, calendar, str, parsePosition, i2)) {
                return null;
            }
        }
        return calendar.getTime();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b.equals(nVar.b) && this.c.equals(nVar.c);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    public final String toString() {
        return "FastDateParser[" + this.a + ", " + this.c + ", " + this.b.getID() + "]";
    }
}
