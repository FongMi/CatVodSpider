package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class P {
    private String a;
    private int b = 0;

    public P(String str) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        this.a = str;
    }

    public static String o(String str) {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
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
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[LOOP:0: B:3:0x0008->B:19:0x0032, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x000e A[EDGE_INSN: B:41:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:3:0x0008->B:19:0x0032], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(char r10, char r11) {
        /*
            r9 = this;
            r6 = -1
            r1 = 0
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r6
            r7 = r6
        L8:
            boolean r1 = r9.i()
            if (r1 == 0) goto L19
        Le:
            if (r7 < 0) goto L55
            java.lang.String r0 = r9.a
            java.lang.String r0 = r0.substring(r5, r7)
        L16:
            if (r4 > 0) goto L58
            return r0
        L19:
            char r8 = r9.c()
            r1 = 92
            if (r0 == r1) goto L75
            r1 = 39
            if (r8 != r1) goto L34
            if (r8 == r10) goto L34
            if (r2 != 0) goto L34
            r3 = r3 ^ 1
            r1 = r2
        L2c:
            if (r3 != 0) goto L30
            if (r1 == 0) goto L40
        L30:
            if (r4 <= 0) goto Le
            r2 = r1
            goto L8
        L34:
            r1 = 34
            if (r8 != r1) goto L73
            if (r8 == r10) goto L73
            if (r3 != 0) goto L73
            r2 = r2 ^ 1
            r1 = r2
            goto L2c
        L40:
            if (r8 != r10) goto L50
            int r4 = r4 + 1
            if (r5 != r6) goto L48
            int r5 = r9.b
        L48:
            if (r4 <= 0) goto L4e
            if (r0 == 0) goto L4e
            int r7 = r9.b
        L4e:
            r0 = r8
            goto L30
        L50:
            if (r8 != r11) goto L48
            int r4 = r4 + (-1)
            goto L48
        L55:
            java.lang.String r0 = ""
            goto L16
        L58:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Did not find balanced marker at '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.github.catvod.spider.merge.C0.N.a.a(r0)
            r0 = 0
            throw r0
        L73:
            r1 = r2
            goto L2c
        L75:
            r1 = r2
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.d0.P.a(char, char):java.lang.String");
    }

    public final String b() {
        String strN;
        int iIndexOf = this.a.indexOf(")", this.b);
        if (iIndexOf != -1) {
            strN = this.a.substring(this.b, iIndexOf);
            this.b += strN.length();
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
        this.b = length + i;
    }

    public final String e() {
        boolean z;
        int i = this.b;
        while (!i()) {
            if (!m()) {
                if (!i()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            z = false;
                            break;
                        }
                        if (this.a.charAt(this.b) == new char[]{'-', '_'}[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                } else {
                    z = false;
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
            if (!(!i() && com.github.catvod.spider.merge.C0.b0.b.d(this.a.charAt(this.b)))) {
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
        this.b += str.length();
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
