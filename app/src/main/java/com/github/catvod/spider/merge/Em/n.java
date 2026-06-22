package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Fs.C0631a;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        C0631a c0631a = new C0631a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0631a.t()) {
            String strO = c0631a.o('=');
            c0631a.a();
            int i4 = Integer.parseInt(c0631a.p(a), 36);
            char cS = c0631a.s();
            c0631a.a();
            if (cS == ',') {
                i2 = Integer.parseInt(c0631a.o(';'), 36);
                c0631a.a();
            } else {
                i2 = -1;
            }
            int i5 = Integer.parseInt(c0631a.o('&'), 36);
            c0631a.a();
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void d(java.lang.Appendable r15, java.lang.String r16, com.github.catvod.spider.merge.Em.g r17, boolean r18, boolean r19, boolean r20) throws java.io.IOException {
        /*
            com.github.catvod.spider.merge.Em.m r1 = r17.c()
            java.nio.charset.CharsetEncoder r2 = r17.b()
            r3 = r17
            int r4 = r3.f
            int r5 = r16.length()
            r7 = 0
            r8 = 0
            r9 = 0
        L13:
            if (r7 >= r5) goto Lad
            r10 = r16
            int r11 = r10.codePointAt(r7)
            r12 = 1
            if (r19 == 0) goto L36
            boolean r13 = com.github.catvod.spider.merge.Dw.e.d(r11)
            if (r13 == 0) goto L34
            if (r20 == 0) goto L28
            if (r8 == 0) goto La6
        L28:
            if (r9 == 0) goto L2c
            goto La6
        L2c:
            r9 = 32
            r15.append(r9)
            r9 = 1
            goto La6
        L34:
            r8 = 1
            r9 = 0
        L36:
            r13 = 65536(0x10000, float:9.1835E-41)
            if (r11 >= r13) goto L90
            char r13 = (char) r11
            r14 = 34
            if (r13 == r14) goto L87
            r14 = 38
            if (r13 == r14) goto L84
            r14 = 60
            if (r13 == r14) goto L74
            r14 = 62
            if (r13 == r14) goto L6f
            r14 = 160(0xa0, float:2.24E-43)
            if (r13 == r14) goto L65
            int r14 = com.github.catvod.spider.merge.Dw.h.a(r4)
            if (r14 == 0) goto L5c
            if (r14 == r12) goto L62
            boolean r12 = r2.canEncode(r13)
            goto L62
        L5c:
            r14 = 128(0x80, float:1.8E-43)
            if (r13 >= r14) goto L61
            goto L62
        L61:
            r12 = 0
        L62:
            if (r12 == 0) goto La3
            goto L8c
        L65:
            com.github.catvod.spider.merge.Em.m r12 = com.github.catvod.spider.merge.Em.m.xhtml
            if (r1 == r12) goto L6c
            java.lang.String r12 = "&nbsp;"
            goto L9f
        L6c:
            java.lang.String r12 = "&#xa0;"
            goto L9f
        L6f:
            if (r18 != 0) goto L8c
            java.lang.String r12 = "&gt;"
            goto L9f
        L74:
            if (r18 == 0) goto L81
            com.github.catvod.spider.merge.Em.m r12 = com.github.catvod.spider.merge.Em.m.xhtml
            if (r1 == r12) goto L81
            int r12 = r17.g()
            r14 = 2
            if (r12 != r14) goto L8c
        L81:
            java.lang.String r12 = "&lt;"
            goto L9f
        L84:
            java.lang.String r12 = "&amp;"
            goto L9f
        L87:
            if (r18 == 0) goto L8c
            java.lang.String r12 = "&quot;"
            goto L9f
        L8c:
            r15.append(r13)
            goto La6
        L90:
            java.lang.String r12 = new java.lang.String
            char[] r13 = java.lang.Character.toChars(r11)
            r12.<init>(r13)
            boolean r13 = r2.canEncode(r12)
            if (r13 == 0) goto La3
        L9f:
            r15.append(r12)
            goto La6
        La3:
            b(r15, r1, r11)
        La6:
            int r11 = java.lang.Character.charCount(r11)
            int r7 = r7 + r11
            goto L13
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Em.n.d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.Em.g, boolean, boolean, boolean):void");
    }

    public static boolean e(String str) {
        return m.base.i(str) != -1;
    }

    public static boolean f(String str) {
        return m.extended.i(str) != -1;
    }
}
