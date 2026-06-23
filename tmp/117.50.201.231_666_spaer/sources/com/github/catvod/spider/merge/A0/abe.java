package com.github.catvod.spider.merge.A0;

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

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abe implements Serializable {
    public static final Locale a = new Locale("ja", "JP", "JP");
    public static final Comparator b = Comparator.reverseOrder();
    public static final ConcurrentMap[] c = new ConcurrentMap[17];
    public static final ly d = new ly(1, 0);
    public static final ly e = new ly(2, 1);
    public static final eo f = new eo(1);
    public static final eo g = new eo(3);
    public static final eo h = new eo(4);
    public static final eo i = new eo(6);
    public static final eo j = new eo(5);
    public static final ly k = new ly(7, 2);
    public static final eo l = new eo(8);
    public static final eo m = new eo(11);
    public static final ly n = new ly(11, 3);
    public static final ly o = new ly(10, 4);
    public static final eo p = new eo(10);
    public static final eo q = new eo(12);
    public static final eo r = new eo(13);
    public static final eo s = new eo(14);
    public final String t;
    public final TimeZone u;
    public final Locale v;
    public final int w;
    public final int x;
    public final transient ArrayList y;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0160 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abe(java.lang.String r12, java.util.TimeZone r13, java.util.Locale r14) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.abe.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void z(java.lang.StringBuilder r6, java.lang.String r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.abe.z(java.lang.StringBuilder, java.lang.String):void");
    }

    public final bp aa(int i2, Calendar calendar) {
        ConcurrentMap concurrentMap;
        ConcurrentMap[] concurrentMapArr = c;
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
        bp vrVar = (bp) concurrentMap.get(this.v);
        if (vrVar == null) {
            vrVar = i2 == 15 ? new vr(this.v) : new mo(i2, calendar, this.v);
            bp bpVar = (bp) concurrentMap.putIfAbsent(this.v, vrVar);
            if (bpVar != null) {
                return bpVar;
            }
        }
        return vrVar;
    }

    public final Date ab(String str, ParsePosition parsePosition) {
        int i2;
        Calendar calendar = Calendar.getInstance(this.u, this.v);
        calendar.clear();
        ListIterator listIterator = this.y.listIterator();
        while (listIterator.hasNext()) {
            oc ocVar = (oc) listIterator.next();
            if (ocVar.a.a() && listIterator.hasNext()) {
                bp bpVar = ((oc) listIterator.next()).a;
                listIterator.previous();
                i2 = bpVar.a() ? ocVar.b : 0;
            } else {
                i2 = 0;
            }
            if (!ocVar.a.b(this, calendar, str, parsePosition, i2)) {
                return null;
            }
        }
        return calendar.getTime();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abe)) {
            return false;
        }
        abe abeVar = (abe) obj;
        return this.t.equals(abeVar.t) && this.u.equals(abeVar.u) && this.v.equals(abeVar.v);
    }

    public final int hashCode() {
        return (((this.v.hashCode() * 13) + this.u.hashCode()) * 13) + this.t.hashCode();
    }

    public final String toString() {
        return "FastDateParser[" + this.t + ", " + this.v + ", " + this.u.getID() + "]";
    }
}
