package com.github.catvod.spider.merge.A0;

import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ec {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();
    public static final ArrayList c = new ArrayList(106);
    public static final ThreadLocal d = ThreadLocal.withInitial(new se(3));
    public static final ThreadLocal e = new ThreadLocal();

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(java.lang.Appendable r4, com.github.catvod.spider.merge.A0.ff r5, int r6) throws java.io.IOException {
        /*
            int[] r0 = r5.g
            int r0 = java.util.Arrays.binarySearch(r0, r6)
            java.lang.String r1 = ""
            if (r0 < 0) goto L1f
            java.lang.String[] r2 = r5.h
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r0 >= r3) goto L1c
            int[] r5 = r5.g
            int r3 = r0 + 1
            r5 = r5[r3]
            if (r5 != r6) goto L1c
            r5 = r2[r3]
            goto L20
        L1c:
            r5 = r2[r0]
            goto L20
        L1f:
            r5 = r1
        L20:
            boolean r0 = r1.equals(r5)
            r1 = 59
            if (r0 != 0) goto L36
            r6 = 38
            java.lang.Appendable r4 = r4.append(r6)
            java.lang.Appendable r4 = r4.append(r5)
            r4.append(r1)
            goto L47
        L36:
            java.lang.String r5 = "&#x"
            java.lang.Appendable r4 = r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r6)
            java.lang.Appendable r4 = r4.append(r5)
            r4.append(r1)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.ec.f(java.lang.Appendable, com.github.catvod.spider.merge.A0.ff, int):void");
    }

    public static boolean g(int i, char c2, CharsetEncoder charsetEncoder) {
        int iH = wb.h(i);
        return iH != 0 ? iH != 1 ? charsetEncoder.canEncode(c2) : c2 < 55296 || c2 >= 57344 : c2 < 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(java.lang.Appendable r16, java.lang.String r17, com.github.catvod.spider.merge.A0.ut r18, int r19) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.ec.h(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.A0.ut, int):void");
    }
}
