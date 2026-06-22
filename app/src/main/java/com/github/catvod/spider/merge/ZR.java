package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class ZR {
    private int S = 0;
    private String l8;

    public ZR(String str) {
        Rc.HM(str);
        this.l8 = str;
    }

    public static String c(String str) {
        StringBuilder sbS = tv.S();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbS.append(c2);
            } else if (c == '\\') {
                sbS.append(c2);
            }
            i++;
            c = c2;
        }
        return tv.cD(sbS);
    }

    private int uS() {
        return this.l8.length() - this.S;
    }

    public boolean A(String str) {
        return this.l8.regionMatches(true, this.S, str, 0, str.length());
    }

    public String E9() {
        String strSubstring = this.l8.substring(this.S);
        this.S = this.l8.length();
        return strSubstring;
    }

    public boolean HM() {
        boolean z = false;
        while (hR()) {
            this.S++;
            z = true;
        }
        return z;
    }

    public boolean Kf() {
        return !n() && Character.isLetterOrDigit(this.l8.charAt(this.S));
    }

    public String N(String... strArr) {
        int i = this.S;
        while (!n() && !s(strArr)) {
            this.S++;
        }
        return this.l8.substring(i, this.S);
    }

    public String OL() {
        int i = this.S;
        while (!n() && (Kf() || cD('-', '_'))) {
            this.S++;
        }
        return this.l8.substring(i, this.S);
    }

    public String S(String str) {
        String strTT = tT(str);
        v(str);
        return strTT;
    }

    public char T4() {
        String str = this.l8;
        int i = this.S;
        this.S = i + 1;
        return str.charAt(i);
    }

    public void b(String str) {
        if (!A(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > uS()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.S += length;
    }

    public boolean cD(char... cArr) {
        if (n()) {
            return false;
        }
        for (char c : cArr) {
            if (this.l8.charAt(this.S) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean hR() {
        return !n() && tv.HM(this.l8.charAt(this.S));
    }

    public String l() {
        int i = this.S;
        while (!n() && (Kf() || s("*|", "|", "_", "-"))) {
            this.S++;
        }
        return this.l8.substring(i, this.S);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0046 A[EDGE_INSN: B:39:0x0046->B:32:0x0046 BREAK  A[LOOP:0: B:3:0x0007->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:3:0x0007->B:43:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String l8(char r10, char r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L7:
            boolean r7 = r9.n()
            if (r7 == 0) goto Le
            goto L46
        Le:
            char r7 = r9.T4()
            r8 = 92
            if (r0 == r8) goto L3d
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
            if (r5 != r1) goto L3d
            int r5 = r9.S
            goto L3d
        L39:
            if (r7 != r11) goto L3d
            int r3 = r3 + (-1)
        L3d:
            if (r3 <= 0) goto L43
            if (r0 == 0) goto L43
            int r6 = r9.S
        L43:
            r0 = r7
        L44:
            if (r3 > 0) goto L7
        L46:
            if (r6 < 0) goto L4f
            java.lang.String r10 = r9.l8
            java.lang.String r10 = r10.substring(r5, r6)
            goto L51
        L4f:
            java.lang.String r10 = ""
        L51:
            if (r3 <= 0) goto L6c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.github.catvod.spider.merge.Rc.l8(r11)
        L6c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ZR.l8(char, char):java.lang.String");
    }

    public boolean n() {
        return uS() == 0;
    }

    public boolean s(String... strArr) {
        for (String str : strArr) {
            if (A(str)) {
                return true;
            }
        }
        return false;
    }

    public String tT(String str) {
        int iIndexOf = this.l8.indexOf(str, this.S);
        if (iIndexOf == -1) {
            return E9();
        }
        String strSubstring = this.l8.substring(this.S, iIndexOf);
        this.S += strSubstring.length();
        return strSubstring;
    }

    public String toString() {
        return this.l8.substring(this.S);
    }

    public boolean v(String str) {
        if (!A(str)) {
            return false;
        }
        this.S += str.length();
        return true;
    }
}
