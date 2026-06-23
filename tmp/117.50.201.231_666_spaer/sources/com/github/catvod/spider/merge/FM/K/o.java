package com.github.catvod.spider.merge.FM.K;

import com.github.catvod.spider.merge.FM.L.C0217a;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class o {
    private static final char[] a = {',', ';'};
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        new g();
    }

    static void a(n nVar, String str, int i) {
        int i2;
        nVar.a = new String[i];
        nVar.b = new int[i];
        nVar.c = new int[i];
        nVar.d = new String[i];
        C0217a c0217a = new C0217a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0217a.w()) {
            try {
                String strP = c0217a.p('=');
                c0217a.a();
                int i4 = Integer.parseInt(c0217a.q(a), 36);
                char cU = c0217a.u();
                c0217a.a();
                if (cU == ',') {
                    i2 = Integer.parseInt(c0217a.p(';'), 36);
                    c0217a.a();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c0217a.p('&'), 36);
                c0217a.a();
                nVar.a[i3] = strP;
                nVar.b[i3] = i4;
                nVar.c[i5] = i4;
                nVar.d[i5] = strP;
                if (i2 != -1) {
                    b.put(strP, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } finally {
                c0217a.d();
            }
        }
        com.github.catvod.spider.merge.FM.I.c.d(i3 == i, "Unexpected count of entities loaded");
    }

    private static void b(Appendable appendable, n nVar, int i) throws IOException {
        Appendable appendableAppend;
        String strJ = nVar.j(i);
        if ("".equals(strJ)) {
            appendableAppend = appendable.append("&#x");
            strJ = Integer.toHexString(i);
        } else {
            appendableAppend = appendable.append('&');
        }
        appendableAppend.append(strJ).append(';');
    }

    public static int c(String str, int[] iArr) {
        String str2 = b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int i = n.extended.i(str);
        if (i == -1) {
            return 0;
        }
        iArr[0] = i;
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void d(java.lang.Appendable r16, java.lang.String r17, com.github.catvod.spider.merge.FM.K.g r18, boolean r19, boolean r20, boolean r21, boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.K.o.d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.FM.K.g, boolean, boolean, boolean, boolean):void");
    }

    public static boolean e(String str) {
        return n.base.i(str) != -1;
    }

    public static boolean f(String str) {
        return n.extended.i(str) != -1;
    }
}
