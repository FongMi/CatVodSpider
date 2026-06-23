package com.github.catvod.spider.merge.A0;

import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lj {
    public static final String[] a = {Marker.ANY_MARKER, "|", "_", "-"};
    public static final String[] b = {"-", "_"};
    public final String c;
    public int d = 0;

    public lj(String str) {
        wc.e(str);
        this.c = str;
    }

    public static String e(String str) {
        StringBuilder sbG = ws.g();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbG.append(c2);
                    c = 0;
                }
            } else {
                sbG.append(c2);
            }
            c = c2;
        }
        return ws.n(sbG);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007b A[LOOP:0: B:3:0x0008->B:45:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054 A[EDGE_INSN: B:47:0x0054->B:38:0x0054 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x007b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        L8:
            boolean r9 = r11.j()
            if (r9 == 0) goto Lf
            goto L54
        Lf:
            char r9 = r11.g()
            r10 = 92
            if (r2 == r10) goto L41
            r10 = 39
            if (r9 != r10) goto L22
            if (r9 == r12) goto L22
            if (r3 != 0) goto L22
            r4 = r4 ^ 1
            goto L2c
        L22:
            r10 = 34
            if (r9 != r10) goto L2c
            if (r9 == r12) goto L2c
            if (r4 != 0) goto L2c
            r3 = r3 ^ 1
        L2c:
            if (r4 != 0) goto L52
            if (r3 != 0) goto L52
            if (r8 == 0) goto L33
            goto L52
        L33:
            if (r9 != r12) goto L3c
            int r7 = r7 + 1
            if (r5 != r0) goto L4c
            int r5 = r11.d
            goto L4c
        L3c:
            if (r9 != r13) goto L4c
            int r7 = r7 + (-1)
            goto L4c
        L41:
            r10 = 81
            if (r9 != r10) goto L47
            r8 = 1
            goto L4c
        L47:
            r10 = 69
            if (r9 != r10) goto L4c
            r8 = 0
        L4c:
            if (r7 <= 0) goto L52
            if (r2 == 0) goto L52
            int r6 = r11.d
        L52:
            if (r7 > 0) goto L7b
        L54:
            if (r6 < 0) goto L5d
            java.lang.String r12 = r11.c
            java.lang.String r12 = r12.substring(r5, r6)
            goto L5f
        L5d:
            java.lang.String r12 = ""
        L5f:
            if (r7 > 0) goto L62
            return r12
        L62:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = "'"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.github.catvod.spider.merge.A0.gg r13 = new com.github.catvod.spider.merge.A0.gg
            r13.<init>(r12)
            throw r13
        L7b:
            r2 = r9
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.lj.f(char, char):java.lang.String");
    }

    public final char g() {
        int i = this.d;
        this.d = i + 1;
        return this.c.charAt(i);
    }

    public final String h(String... strArr) {
        String str;
        int i = this.d;
        boolean z = false;
        loop0: while (true) {
            boolean zJ = j();
            str = this.c;
            if (zJ) {
                break;
            }
            if (str.charAt(this.d) == '\\') {
                int length = this.c.length();
                int i2 = this.d;
                if (length - i2 > 1) {
                    this.d = i2 + 2;
                    z = true;
                }
            }
            if (j() || !Character.isLetterOrDigit(this.c.charAt(this.d))) {
                for (String str2 : strArr) {
                    if (!l(str2)) {
                    }
                }
                break loop0;
            }
            this.d++;
        }
        String strSubstring = str.substring(i, this.d);
        return z ? e(strSubstring) : strSubstring;
    }

    public final boolean i() {
        boolean z = false;
        while (!j() && ws.k(this.c.charAt(this.d))) {
            this.d++;
            z = true;
        }
        return z;
    }

    public final boolean j() {
        return this.c.length() - this.d == 0;
    }

    public final boolean k(String str) {
        if (!l(str)) {
            return false;
        }
        this.d = str.length() + this.d;
        return true;
    }

    public final boolean l(String str) {
        return this.c.regionMatches(true, this.d, str, 0, str.length());
    }

    public final boolean m(char... cArr) {
        if (j()) {
            return false;
        }
        for (char c : cArr) {
            if (this.c.charAt(this.d) == c) {
                return true;
            }
        }
        return false;
    }

    public final String n() {
        int i = this.d;
        String str = this.c;
        String strSubstring = str.substring(i);
        this.d = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.c.substring(this.d);
    }
}
