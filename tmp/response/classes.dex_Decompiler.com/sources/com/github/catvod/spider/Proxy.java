package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.n.C0197c;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Proxy extends Spider {
    private static int a = -1;

    static void a() {
        if (a > 0) {
            return;
        }
        for (int i = 9978; i < 10000; i++) {
            if (C0197c.l(C0098a.a(new byte[]{-60, 99, 0, -60, -41, 4, -3, 81, -98, 32, 90, -124, -61, 27, -4, 81, -106}, new byte[]{-84, 23, 116, -76, -19, 43, -46, 96}) + i + C0098a.a(new byte[]{65, -122, -28, 97, 53, -94, -35, -122, 1, -53, -11, 101}, new byte[]{110, -10, -106, 14, 77, -37, -30, -30}), null).equals(C0098a.a(new byte[]{79, 29}, new byte[]{32, 118, 25, 122, 92, 93, -76, -13}))) {
                SpiderDebug.log(C0098a.a(new byte[]{-54, 39, 78, 60, -90, -114, -18, -33, -17, 41, 87, 114, -79, -53, -16, -58, -23, 58, 27, 34, -83, -36, -10, -112}, new byte[]{-116, 72, 59, 82, -62, -82, -126, -80}) + i);
                a = i;
                return;
            }
        }
    }

    public static int getPort() {
        a();
        return a;
    }

    public static String getUrl() {
        a();
        StringBuilder sb = new StringBuilder();
        sb.append(C0098a.a(new byte[]{-46, -49, -18, 1, 118, 76, -20, 54, -120, -116, -76, 65, 98, 83, -19, 54, -128}, new byte[]{-70, -69, -102, 113, 76, 99, -61, 7}));
        sb.append(a);
        return C0133t.b(new byte[]{-84, 107, -12, -30, 124, -23}, new byte[]{-125, 27, -122, -115, 4, -112, 17, 120}, sb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] proxy(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Proxy.proxy(java.util.Map):java.lang.Object[]");
    }
}
