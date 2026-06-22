package com.github.catvod.spider.merge.H;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class B implements Serializable {
    public static final t[] f = new t[0];
    public static final ConcurrentHashMap g = new ConcurrentHashMap(7);
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final transient t[] d;
    public final transient int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021c A[LOOP:2: B:119:0x0218->B:121:0x021c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.github.catvod.spider.merge.H.r] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B(java.lang.String r20, java.util.TimeZone r21, java.util.Locale r22) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.B.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static void b(StringBuilder sb, int i, int i2) {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                sb.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        sb.append((char) ((i / 1000) + 48));
                        i %= 1000;
                    }
                    if (i >= 100) {
                        sb.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        sb.append('0');
                    }
                }
                if (i >= 10) {
                    sb.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    sb.append('0');
                }
            }
            sb.append((char) (i + 48));
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
            sb.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                sb.append(cArr[i5]);
            }
        }
    }

    public static String c(TimeZone timeZone, boolean z, int i, Locale locale) {
        w wVar = new w(timeZone, z, i, locale);
        ConcurrentHashMap concurrentHashMap = g;
        String str = (String) concurrentHashMap.get(wVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) concurrentHashMap.putIfAbsent(wVar, displayName);
        return str2 != null ? str2 : displayName;
    }

    public static r d(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new s(i, i2) : new A(i, 0) : new A(i, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        return this.a.equals(b.a) && this.b.equals(b.b) && this.c.equals(b.c);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    public final String toString() {
        return "FastDatePrinter[" + this.a + "," + this.c + "," + this.b.getID() + "]";
    }
}
