package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.hg */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0121hg {

    /* renamed from: q */
    private String f678q;

    /* renamed from: xC */
    private int f679xC = 0;

    public C0121hg(String str) {
        C0111bw.m559se(str);
        this.f678q = str;
    }

    /* renamed from: IS */
    public static String m611IS(String str) {
        StringBuilder sbM779xC = C0157x3.m779xC();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbM779xC.append(c2);
            } else if (c == '\\') {
                sbM779xC.append(c2);
            }
            i++;
            c = c2;
        }
        return C0157x3.m778w8(sbM779xC);
    }

    /* renamed from: Tz */
    private int m612Tz() {
        return this.f678q.length() - this.f679xC;
    }

    /* renamed from: B */
    public boolean m613B(String str) {
        return this.f678q.regionMatches(true, this.f679xC, str, 0, str.length());
    }

    /* renamed from: F */
    public boolean m614F(String... strArr) {
        for (String str : strArr) {
            if (m613B(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: FN */
    public boolean m615FN(String str) {
        if (!m613B(str)) {
            return false;
        }
        this.f679xC += str.length();
        return true;
    }

    /* renamed from: KT */
    public boolean m616KT() {
        return !m622W() && Character.isLetterOrDigit(this.f678q.charAt(this.f679xC));
    }

    /* renamed from: MH */
    public String m617MH(String... strArr) {
        int i = this.f679xC;
        while (!m622W() && !m614F(strArr)) {
            this.f679xC++;
        }
        return this.f678q.substring(i, this.f679xC);
    }

    /* renamed from: Mo */
    public String m618Mo() {
        int i = this.f679xC;
        while (!m622W() && (m616KT() || m614F("*|", "|", "_", "-"))) {
            this.f679xC++;
        }
        return this.f678q.substring(i, this.f679xC);
    }

    /* renamed from: QU */
    public char m619QU() {
        String str = this.f678q;
        int i = this.f679xC;
        this.f679xC = i + 1;
        return str.charAt(i);
    }

    /* renamed from: RH */
    public boolean m620RH() {
        return !m622W() && C0157x3.m776se(this.f678q.charAt(this.f679xC));
    }

    /* renamed from: UJ */
    public void m621UJ(String str) {
        if (!m613B(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > m612Tz()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f679xC += length;
    }

    /* renamed from: W */
    public boolean m622W() {
        return m612Tz() == 0;
    }

    /* renamed from: i */
    public String m623i(String str) {
        int iIndexOf = this.f678q.indexOf(str, this.f679xC);
        if (iIndexOf == -1) {
            return m624k();
        }
        String strSubstring = this.f678q.substring(this.f679xC, iIndexOf);
        this.f679xC += strSubstring.length();
        return strSubstring;
    }

    /* renamed from: k */
    public String m624k() {
        String strSubstring = this.f678q.substring(this.f679xC);
        this.f679xC = this.f678q.length();
        return strSubstring;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0046 A[EDGE_INSN: B:39:0x0046->B:32:0x0046 BREAK  A[LOOP:0: B:3:0x0007->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:3:0x0007->B:43:?, LOOP_END, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m625q(char r10, char r11) {
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
            boolean r7 = r9.m622W()
            if (r7 == 0) goto Le
            goto L46
        Le:
            char r7 = r9.m619QU()
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
            int r5 = r9.f679xC
            goto L3d
        L39:
            if (r7 != r11) goto L3d
            int r3 = r3 + (-1)
        L3d:
            if (r3 <= 0) goto L43
            if (r0 == 0) goto L43
            int r6 = r9.f679xC
        L43:
            r0 = r7
        L44:
            if (r3 > 0) goto L7
        L46:
            if (r6 < 0) goto L4f
            java.lang.String r10 = r9.f678q
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
            com.github.catvod.spider.merge.C0111bw.m558q(r11)
        L6c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0121hg.m625q(char, char):java.lang.String");
    }

    /* renamed from: se */
    public boolean m626se() {
        boolean z = false;
        while (m620RH()) {
            this.f679xC++;
            z = true;
        }
        return z;
    }

    public String toString() {
        return this.f678q.substring(this.f679xC);
    }

    /* renamed from: u */
    public String m627u() {
        int i = this.f679xC;
        while (!m622W() && (m616KT() || m628w8('-', '_'))) {
            this.f679xC++;
        }
        return this.f678q.substring(i, this.f679xC);
    }

    /* renamed from: w8 */
    public boolean m628w8(char... cArr) {
        if (m622W()) {
            return false;
        }
        for (char c : cArr) {
            if (this.f678q.charAt(this.f679xC) == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: xC */
    public String m629xC(String str) {
        String strM623i = m623i(str);
        m615FN(str);
        return strM623i;
    }
}
