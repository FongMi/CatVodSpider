package com.github.catvod.spider.merge.C0.c0;

import com.github.catvod.spider.merge.C0.d0.C0123a;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class n {
    private static final char[] a = {',', ';'};
    private static final HashMap<String, String> b = new HashMap<>();

    static {
        new g();
    }

    static void a(m mVar, String str, int i) {
        int i2;
        mVar.c = new String[i];
        mVar.d = new int[i];
        mVar.e = new int[i];
        mVar.f = new String[i];
        C0123a c0123a = new C0123a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0123a.t()) {
            String strO = c0123a.o('=');
            c0123a.a();
            int i4 = Integer.parseInt(c0123a.p(a), 36);
            char cS = c0123a.s();
            c0123a.a();
            if (cS == ',') {
                i2 = Integer.parseInt(c0123a.o(';'), 36);
                c0123a.a();
            } else {
                i2 = -1;
            }
            int i5 = Integer.parseInt(c0123a.o('&'), 36);
            c0123a.a();
            mVar.c[i3] = strO;
            mVar.d[i3] = i4;
            mVar.e[i5] = i4;
            mVar.f[i5] = strO;
            if (i2 != -1) {
                b.put(strO, new String(new int[]{i4, i2}, 0, 2));
            }
            i3++;
        }
        if (!(i3 == i)) {
            throw new IllegalArgumentException("Unexpected count of entities loaded");
        }
    }

    private static void b(Appendable appendable, m mVar, int i) throws IOException {
        Appendable appendableAppend;
        String strJ = mVar.j(i);
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
        int i = m.extended.i(str);
        if (i == -1) {
            return 0;
        }
        iArr[0] = i;
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void d(java.lang.Appendable r12, java.lang.String r13, com.github.catvod.spider.merge.C0.c0.g r14, boolean r15, boolean r16, boolean r17) {
        /*
            com.github.catvod.spider.merge.C0.c0.m r5 = r14.c()
            java.nio.charset.CharsetEncoder r6 = r14.b()
            int r7 = r14.f
            int r8 = r13.length()
            r1 = 0
            r0 = 0
            r2 = 0
            r4 = r1
        L12:
            if (r4 >= r8) goto Lad
            int r9 = r13.codePointAt(r4)
            r3 = 1
            if (r16 == 0) goto Lb0
            boolean r1 = com.github.catvod.spider.merge.C0.b0.b.d(r9)
            if (r1 == 0) goto L36
            if (r17 == 0) goto L25
            if (r0 == 0) goto L27
        L25:
            if (r2 == 0) goto L2e
        L27:
            int r1 = java.lang.Character.charCount(r9)
            int r1 = r1 + r4
            r4 = r1
            goto L12
        L2e:
            r1 = 32
            r12.append(r1)
            r1 = 1
            r2 = r1
            goto L27
        L36:
            r1 = 1
            r2 = 0
        L38:
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r0) goto L98
            char r10 = (char) r9
            r0 = 34
            if (r10 == r0) goto L93
            r0 = 38
            if (r10 == r0) goto L90
            r0 = 60
            if (r10 == r0) goto L80
            r0 = 62
            if (r10 == r0) goto L7b
            r0 = 160(0xa0, float:2.24E-43)
            if (r10 == r0) goto L6d
            int r0 = com.github.catvod.spider.merge.C0.l.a.a(r7)
            if (r0 == 0) goto L65
            r11 = 1
            if (r0 == r11) goto Lae
            boolean r0 = r6.canEncode(r10)
        L5e:
            if (r0 == 0) goto La7
        L60:
            r12.append(r10)
            r0 = r1
            goto L27
        L65:
            r0 = 128(0x80, float:1.8E-43)
            if (r10 >= r0) goto L6b
            r0 = r3
            goto L5e
        L6b:
            r0 = 0
            goto L5e
        L6d:
            com.github.catvod.spider.merge.C0.c0.m r0 = com.github.catvod.spider.merge.C0.c0.m.xhtml
            if (r5 == r0) goto L78
            java.lang.String r0 = "&nbsp;"
        L73:
            r12.append(r0)
            r0 = r1
            goto L27
        L78:
            java.lang.String r0 = "&#xa0;"
            goto L73
        L7b:
            if (r15 != 0) goto L60
            java.lang.String r0 = "&gt;"
            goto L73
        L80:
            if (r15 == 0) goto L8d
            com.github.catvod.spider.merge.C0.c0.m r0 = com.github.catvod.spider.merge.C0.c0.m.xhtml
            if (r5 == r0) goto L8d
            int r0 = r14.g()
            r3 = 2
            if (r0 != r3) goto L60
        L8d:
            java.lang.String r0 = "&lt;"
            goto L73
        L90:
            java.lang.String r0 = "&amp;"
            goto L73
        L93:
            if (r15 == 0) goto L60
            java.lang.String r0 = "&quot;"
            goto L73
        L98:
            java.lang.String r0 = new java.lang.String
            char[] r3 = java.lang.Character.toChars(r9)
            r0.<init>(r3)
            boolean r3 = r6.canEncode(r0)
            if (r3 != 0) goto L73
        La7:
            b(r12, r5, r9)
            r0 = r1
            goto L27
        Lad:
            return
        Lae:
            r0 = r3
            goto L5e
        Lb0:
            r1 = r0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.c0.n.d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.C0.c0.g, boolean, boolean, boolean):void");
    }

    public static boolean e(String str) {
        return m.base.i(str) != -1;
    }

    public static boolean f(String str) {
        return m.extended.i(str) != -1;
    }
}
