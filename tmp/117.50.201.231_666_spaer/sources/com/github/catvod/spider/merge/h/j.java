package com.github.catvod.spider.merge.H;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j {
    private String a;
    private int b = 0;

    public j(String str) {
        com.github.catvod.spider.merge.E.c.g(str);
        this.a = str;
    }

    public static String o(String str) {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                sbB.append(c2);
            }
            i++;
            c = c2;
        }
        return com.github.catvod.spider.merge.F.b.h(sbB);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007e A[LOOP:0: B:3:0x0008->B:45:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(char r12, char r13) {
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
            boolean r9 = r11.i()
            if (r9 == 0) goto Lf
            goto L55
        Lf:
            char r9 = r11.c()
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
            if (r4 != 0) goto L53
            if (r3 != 0) goto L53
            if (r8 == 0) goto L33
            goto L53
        L33:
            if (r9 != r12) goto L3c
            int r7 = r7 + 1
            if (r5 != r0) goto L4c
            int r5 = r11.b
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
            if (r7 <= 0) goto L53
            if (r2 == 0) goto L53
            int r2 = r11.b
            r6 = r2
        L53:
            if (r7 > 0) goto L7e
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r12 = r11.a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r12 = ""
        L60:
            if (r7 > 0) goto L63
            return r12
        L63:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = "'"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.github.catvod.spider.merge.E.c.a(r12)
            r12 = 0
            throw r12
        L7e:
            r2 = r9
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.j.a(char, char):java.lang.String");
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
            if (!(!i() && com.github.catvod.spider.merge.F.b.e(this.a.charAt(this.b)))) {
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
