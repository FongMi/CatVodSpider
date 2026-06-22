package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class P {
    private String a;
    private int b = 0;

    public P(String str) {
        com.github.catvod.spider.merge.Dw.i.k(str);
        this.a = str;
    }

    public static String o(String str) {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                sbA.append(c2);
            }
            i++;
            c = c2;
        }
        return com.github.catvod.spider.merge.Dw.e.g(sbA);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0046 A[EDGE_INSN: B:41:0x0046->B:32:0x0046 BREAK  A[LOOP:0: B:3:0x0007->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:3:0x0007->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(char r10, char r11) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L7:
            boolean r7 = r9.i()
            if (r7 == 0) goto Le
            goto L46
        Le:
            char r7 = r9.c()
            r8 = 92
            if (r1 == r8) goto L3d
            r8 = 39
            if (r7 != r8) goto L21
            if (r7 == r10) goto L21
            if (r2 != 0) goto L21
            r4 = r4 ^ 1
            goto L2b
        L21:
            r8 = 34
            if (r7 != r8) goto L2b
            if (r7 == r10) goto L2b
            if (r4 != 0) goto L2b
            r2 = r2 ^ 1
        L2b:
            if (r4 != 0) goto L44
            if (r2 == 0) goto L30
            goto L44
        L30:
            if (r7 != r10) goto L39
            int r3 = r3 + 1
            if (r5 != r0) goto L3d
            int r5 = r9.b
            goto L3d
        L39:
            if (r7 != r11) goto L3d
            int r3 = r3 + (-1)
        L3d:
            if (r3 <= 0) goto L43
            if (r1 == 0) goto L43
            int r6 = r9.b
        L43:
            r1 = r7
        L44:
            if (r3 > 0) goto L7
        L46:
            if (r6 < 0) goto L4f
            java.lang.String r10 = r9.a
            java.lang.String r10 = r10.substring(r5, r6)
            goto L51
        L4f:
            java.lang.String r10 = ""
        L51:
            if (r3 > 0) goto L54
            return r10
        L54:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = "'"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.github.catvod.spider.merge.Dw.i.a(r10)
            r10 = 0
            goto L70
        L6f:
            throw r10
        L70:
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Fs.P.a(char, char):java.lang.String");
    }

    public final String b() {
        String strN;
        int iIndexOf = this.a.indexOf(")", this.b);
        if (iIndexOf != -1) {
            strN = this.a.substring(this.b, iIndexOf);
            this.b = strN.length() + this.b;
        } else {
            strN = n();
        }
        j(")");
        return strN;
    }

    public final char c() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        return str.charAt(i);
    }

    public final void d(String str) {
        if (!k(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.a.length();
        int i = this.b;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.b = i + length;
    }

    public final String e() {
        int i = this.b;
        while (!i()) {
            if (!m()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!i()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break;
                        }
                        if (this.a.charAt(this.b) == cArr[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public final String f() {
        int i = this.b;
        while (!i() && (m() || l("*|", "|", "_", "-"))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public final String g(String... strArr) {
        int i = this.b;
        while (!i() && !l(strArr)) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public final boolean h() {
        boolean z = false;
        while (true) {
            if (!(!i() && com.github.catvod.spider.merge.Dw.e.d(this.a.charAt(this.b)))) {
                return z;
            }
            this.b++;
            z = true;
        }
    }

    public final boolean i() {
        return this.a.length() - this.b == 0;
    }

    public final boolean j(String str) {
        if (!k(str)) {
            return false;
        }
        this.b = str.length() + this.b;
        return true;
    }

    public final boolean k(String str) {
        return this.a.regionMatches(true, this.b, str, 0, str.length());
    }

    public final boolean l(String... strArr) {
        for (String str : strArr) {
            if (k(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return !i() && Character.isLetterOrDigit(this.a.charAt(this.b));
    }

    public final String n() {
        String strSubstring = this.a.substring(this.b);
        this.b = this.a.length();
        return strSubstring;
    }

    public final String toString() {
        return this.a.substring(this.b);
    }
}
