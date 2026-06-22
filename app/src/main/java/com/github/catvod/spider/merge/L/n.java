package com.github.catvod.spider.merge.L;

import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class n {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();

    static {
        m mVar = m.xhtml;
        Charset charset = com.github.catvod.spider.merge.J.a.a;
        new ThreadLocal();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Appendable r4, com.github.catvod.spider.merge.L.m r5, int r6) throws java.io.IOException {
        /*
            int[] r0 = r5.c
            int r0 = java.util.Arrays.binarySearch(r0, r6)
            java.lang.String r1 = ""
            if (r0 < 0) goto L1f
            java.lang.String[] r2 = r5.d
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r0 >= r3) goto L1c
            int[] r5 = r5.c
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
        L2e:
            java.lang.Appendable r4 = r4.append(r5)
            r4.append(r1)
            goto L41
        L36:
            java.lang.String r5 = "&#x"
            java.lang.Appendable r4 = r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r6)
            goto L2e
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.n.a(java.lang.Appendable, com.github.catvod.spider.merge.L.m, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.Appendable r16, java.lang.String r17, com.github.catvod.spider.merge.L.g r18, boolean r19, boolean r20, boolean r21, boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.L.n.b(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.L.g, boolean, boolean, boolean, boolean):void");
    }
}
