package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S {
    private String a;
    private int b = 0;

    public S(String str) {
        com.github.catvod.spider.merge.XU.k.g(str);
        this.a = str;
    }

    public static String o(String str) {
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
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
        return com.github.catvod.spider.merge.XU.n.h(sbB);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[LOOP:0: B:3:0x0009->B:45:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056 A[EDGE_INSN: B:47:0x0056->B:38:0x0056 BREAK  A[LOOP:0: B:3:0x0009->B:45:0x0087], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        L9:
            boolean r9 = r11.i()
            if (r9 == 0) goto L10
            goto L56
        L10:
            char r9 = r11.c()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L54
            if (r3 != 0) goto L54
            if (r8 == 0) goto L34
            goto L54
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.b
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = 0
        L4d:
            if (r7 <= 0) goto L54
            if (r2 == 0) goto L54
            int r2 = r11.b
            r6 = r2
        L54:
            if (r7 > 0) goto L87
        L56:
            if (r6 < 0) goto L5f
            java.lang.String r12 = r11.a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L61
        L5f:
            java.lang.String r12 = ""
        L61:
            if (r7 > 0) goto L64
            return r12
        L64:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "3D2A2F6D262A0D632D24262159212A21292B1A262F6D25240B282E3F68240D636C"
            java.lang.String r0 = com.github.catvod.spider.merge.ZrJ.d(r0)
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = "5E"
            java.lang.String r12 = com.github.catvod.spider.merge.ZrJ.d(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.github.catvod.spider.merge.XU.k.a(r12)
            r12 = 0
            throw r12
        L87:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Mp.S.a(char, char):java.lang.String");
    }

    public final String b() {
        String strN;
        String str = this.a;
        int i = this.b;
        String strD = ZrJ.d("50");
        int iIndexOf = str.indexOf(strD, i);
        if (iIndexOf != -1) {
            strN = this.a.substring(this.b, iIndexOf);
            this.b = strN.length() + this.b;
        } else {
            strN = n();
        }
        j(strD);
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
            throw new IllegalStateException(ZrJ.d("28362E382D651D2A2F6D262A0D63262C3C2611632E3538201A372E2968361C323E2826261C"));
        }
        int length = str.length();
        int length2 = this.a.length();
        int i = this.b;
        if (length > length2 - i) {
            throw new IllegalStateException(ZrJ.d("28362E382D65172C3F6D242A17246B28262A0C24236D3C2A592024233B3014266B3E2D340C26252E2D"));
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
        while (!i() && (m() || l(ZrJ.d("533F"), ZrJ.d("05"), ZrJ.d("26"), ZrJ.d("54")))) {
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
            if (!(!i() && com.github.catvod.spider.merge.XU.n.e(this.a.charAt(this.b)))) {
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
