package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b1.C0906c;
import com.github.catvod.spider.merge.d1.C0973a;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o {
    private static final char[] a = {',', ';'};
    private static final HashMap<String, String> b = new HashMap<>();
    private static final g c = new g();

    static void a(n nVar, String str, int i) {
        int i2;
        nVar.b = new String[i];
        nVar.c = new int[i];
        nVar.d = new int[i];
        nVar.e = new String[i];
        C0973a c0973a = new C0973a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0973a.w()) {
            try {
                String strP = c0973a.p('=');
                c0973a.a();
                int i4 = Integer.parseInt(c0973a.q(a), 36);
                char cU = c0973a.u();
                c0973a.a();
                if (cU == ',') {
                    i2 = Integer.parseInt(c0973a.p(';'), 36);
                    c0973a.a();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c0973a.p('&'), 36);
                c0973a.a();
                nVar.b[i3] = strP;
                nVar.c[i3] = i4;
                nVar.d[i5] = i4;
                nVar.e[i5] = strP;
                if (i2 != -1) {
                    b.put(strP, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } finally {
                c0973a.d();
            }
        }
        C0899d.e(i3 == i, "Unexpected count of entities loaded");
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

    public static String d(String str) {
        g gVar = c;
        if (str == null) {
            return "";
        }
        StringBuilder sbB = C0906c.b();
        try {
            e(sbB, str, gVar, false, false, false, false);
            return C0906c.h(sbB);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z0.a(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e(java.lang.Appendable r16, java.lang.String r17, com.github.catvod.spider.merge.c1.g r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c1.o.e(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.c1.g, boolean, boolean, boolean, boolean):void");
    }

    public static boolean f(String str) {
        return n.base.i(str) != -1;
    }

    public static boolean g(String str) {
        return n.extended.i(str) != -1;
    }
}
