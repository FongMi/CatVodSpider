package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ང, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0466 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private String f1128;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private int f1129 = 0;

    public C0466(String str) {
        C0034.m284(str);
        this.f1128 = str;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private int m1700() {
        return this.f1128.length() - this.f1129;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public static String m1701(String str) {
        StringBuilder sbM136 = C0008.m136();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbM136.append(c2);
            } else if (c == '\\') {
                sbM136.append(c2);
            }
            i++;
            c = c2;
        }
        return C0008.m147(sbM136);
    }

    public String toString() {
        return this.f1128.substring(this.f1129);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0046 A[EDGE_INSN: B:39:0x0046->B:32:0x0046 BREAK  A[LOOP:0: B:3:0x0007->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:3:0x0007->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m1702(char r10, char r11) {
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
            boolean r7 = r9.m1711()
            if (r7 == 0) goto Le
            goto L46
        Le:
            char r7 = r9.m1704()
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
            int r5 = r9.f1129
            goto L3d
        L39:
            if (r7 != r11) goto L3d
            int r3 = r3 + (-1)
        L3d:
            if (r3 <= 0) goto L43
            if (r0 == 0) goto L43
            int r6 = r9.f1129
        L43:
            r0 = r7
        L44:
            if (r3 > 0) goto L7
        L46:
            if (r6 < 0) goto L4f
            java.lang.String r10 = r9.f1128
            java.lang.String r10 = r10.substring(r5, r6)
            goto L51
        L4f:
            java.lang.String r10 = ""
        L51:
            if (r3 <= 0) goto L74
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "3E3B35561A180E72371F1A135A30301A15191937355619160839340454160E7276"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = "5D"
            java.lang.String r0 = com.github.catvod.spider.merge.SOY.d(r0)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.github.catvod.spider.merge.C0034.m276(r11)
        L74:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0466.m1702(char, char):java.lang.String");
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public String m1703(String str) {
        String strM1708 = m1708(str);
        m1712(str);
        return strM1708;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public char m1704() {
        String str = this.f1128;
        int i = this.f1129;
        this.f1129 = i + 1;
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public void m1705(String str) {
        if (!m1713(str)) {
            throw new IllegalStateException(SOY.d("2B27340311571E3B35561A180E723C1700141272340E04121926341254041F2324131A141F"));
        }
        int length = str.length();
        if (length > m1700()) {
            throw new IllegalStateException(SOY.d("2B2734031157143D25561818143571131A180F35395600185A313E1807021737710511060F373F1511"));
        }
        this.f1129 += length;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public String m1706() {
        int i = this.f1129;
        while (!m1711() && (m1717() || m1714('-', '_'))) {
            this.f1129++;
        }
        return this.f1128.substring(i, this.f1129);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public String m1707() {
        int i = this.f1129;
        while (!m1711() && (m1717() || m1715(SOY.d("502E"), SOY.d("06"), SOY.d("25"), SOY.d("57")))) {
            this.f1129++;
        }
        return this.f1128.substring(i, this.f1129);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public String m1708(String str) {
        int iIndexOf = this.f1128.indexOf(str, this.f1129);
        if (iIndexOf == -1) {
            return m1718();
        }
        String strSubstring = this.f1128.substring(this.f1129, iIndexOf);
        this.f1129 += strSubstring.length();
        return strSubstring;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public String m1709(String... strArr) {
        int i = this.f1129;
        while (!m1711() && !m1715(strArr)) {
            this.f1129++;
        }
        return this.f1128.substring(i, this.f1129);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public boolean m1710() {
        boolean z = false;
        while (m1716()) {
            this.f1129++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public boolean m1711() {
        return m1700() == 0;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public boolean m1712(String str) {
        if (!m1713(str)) {
            return false;
        }
        this.f1129 += str.length();
        return true;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public boolean m1713(String str) {
        return this.f1128.regionMatches(true, this.f1129, str, 0, str.length());
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public boolean m1714(char... cArr) {
        if (m1711()) {
            return false;
        }
        for (char c : cArr) {
            if (this.f1128.charAt(this.f1129) == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public boolean m1715(String... strArr) {
        for (String str : strArr) {
            if (m1713(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public boolean m1716() {
        return !m1711() && C0008.m143(this.f1128.charAt(this.f1129));
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public boolean m1717() {
        return !m1711() && Character.isLetterOrDigit(this.f1128.charAt(this.f1129));
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public String m1718() {
        String strSubstring = this.f1128.substring(this.f1129);
        this.f1129 = this.f1128.length();
        return strSubstring;
    }
}
