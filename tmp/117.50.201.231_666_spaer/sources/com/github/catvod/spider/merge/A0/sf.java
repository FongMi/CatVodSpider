package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sf {
    public static final abb a = new abb(new se(0));
    public static final abb b = new abb(new se(1));
    public StringReader d;
    public int f;
    public int g;
    public int i;
    public boolean k;
    public String n;
    public int o;
    public int h = 0;
    public int j = -1;
    public ArrayList l = null;
    public int m = 1;
    public char[] e = (char[]) b.g();
    public String[] c = (String[]) a.g();

    public sf(StringReader stringReader) {
        this.d = stringReader;
        r();
    }

    public static String p(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            int i9 = i2;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    return str;
                }
                int i11 = i8 + 1;
                int i12 = i4 + 1;
                if (cArr[i8] != str.charAt(i4)) {
                    break;
                }
                i8 = i11;
                i9 = i10;
                i4 = i12;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i7] = str2;
        return str2;
    }

    public final char aa() {
        r();
        int i = this.f;
        if (i >= this.g) {
            return (char) 65535;
        }
        return this.e[i];
    }

    public final boolean ab() {
        r();
        return this.f >= this.g;
    }

    public final int ac(int i) {
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    public final boolean ad(String str) {
        r();
        r();
        int length = str.length();
        if (length <= this.g - this.f) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.e[this.f + i]) {
                }
            }
            this.f = str.length() + this.f;
            return true;
        }
        return false;
    }

    public final boolean ae(String str) {
        r();
        int length = str.length();
        if (length <= this.g - this.f) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.e[this.f + i])) {
                }
            }
            this.f = str.length() + this.f;
            return true;
        }
        return false;
    }

    public final boolean af(char c) {
        return !ab() && this.e[this.f] == c;
    }

    public final boolean ag(char... cArr) {
        if (ab()) {
            return false;
        }
        r();
        char c = this.e[this.f];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public final boolean ah() {
        if (ab()) {
            return false;
        }
        char c = this.e[this.f];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public final boolean ai() {
        if (ab()) {
            return false;
        }
        char c = this.e[this.f];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    public final int aj(String str) {
        r();
        char cCharAt = str.charAt(0);
        int i = this.f;
        while (i < this.g) {
            if (cCharAt != this.e[i]) {
                do {
                    i++;
                    if (i >= this.g) {
                        break;
                    }
                } while (cCharAt != this.e[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.g;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.e[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int ak() {
        return this.i + this.f;
    }

    public final String al() {
        int iAc;
        StringBuilder sb = new StringBuilder();
        int iAk = ak();
        int i = 1;
        if (this.l != null) {
            int iAc2 = ac(iAk);
            i = iAc2 == -1 ? this.m : 1 + iAc2 + this.m;
        }
        sb.append(i);
        sb.append(":");
        int iAk2 = ak();
        if ((this.l != null) && (iAc = ac(iAk2)) != -1) {
            iAk2 -= ((Integer) this.l.get(iAc)).intValue();
        }
        sb.append(iAk2 + 1);
        return sb.toString();
    }

    public final void am() {
        int i = this.j;
        if (i == -1) {
            throw new adk(new IOException("Mark invalid"));
        }
        this.f = i;
        this.j = -1;
    }

    public final void an() {
        int i = this.f;
        if (i < 1) {
            throw new adk(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f = i - 1;
    }

    public final void q() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r5.k = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r5 = this;
            boolean r0 = r5.k
            if (r0 != 0) goto La3
            int r0 = r5.f
            int r1 = r5.h
            if (r0 < r1) goto La3
            int r1 = r5.j
            r2 = -1
            if (r1 == r2) goto L11
            goto La3
        L11:
            int r1 = r5.i
            int r1 = r1 + r0
            r5.i = r1
            int r1 = r5.g
            int r1 = r1 - r0
            r5.g = r1
            r3 = 0
            if (r1 <= 0) goto L23
            char[] r4 = r5.e
            java.lang.System.arraycopy(r4, r0, r4, r3, r1)
        L23:
            r5.f = r3
        L25:
            int r0 = r5.g
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L49
            java.io.StringReader r1 = r5.d     // Catch: java.io.IOException -> L3b
            char[] r3 = r5.e     // Catch: java.io.IOException -> L3b
            int r4 = r3.length     // Catch: java.io.IOException -> L3b
            int r4 = r4 - r0
            int r0 = r1.read(r3, r0, r4)     // Catch: java.io.IOException -> L3b
            if (r0 != r2) goto L3d
            r0 = 1
            r5.k = r0     // Catch: java.io.IOException -> L3b
            goto L49
        L3b:
            r0 = move-exception
            goto L43
        L3d:
            int r1 = r5.g     // Catch: java.io.IOException -> L3b
            int r1 = r1 + r0
            r5.g = r1     // Catch: java.io.IOException -> L3b
            goto L25
        L43:
            com.github.catvod.spider.merge.A0.adk r1 = new com.github.catvod.spider.merge.A0.adk
            r1.<init>(r0)
            throw r1
        L49:
            int r0 = r5.g
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r0, r1)
            r5.h = r0
            java.util.ArrayList r0 = r5.l
            if (r0 == 0) goto La0
            int r0 = r0.size()
            if (r0 <= 0) goto L81
            int r0 = r5.i
            int r0 = r5.ac(r0)
            r1 = -1
            if (r0 != r1) goto L67
            r0 = 0
        L67:
            java.util.ArrayList r1 = r5.l
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r2 = r5.m
            int r2 = r2 + r0
            r5.m = r2
            java.util.ArrayList r0 = r5.l
            r0.clear()
            java.util.ArrayList r0 = r5.l
            r0.add(r1)
        L81:
            int r0 = r5.f
        L83:
            int r1 = r5.g
            if (r0 >= r1) goto La0
            char[] r1 = r5.e
            char r1 = r1[r0]
            r2 = 10
            if (r1 != r2) goto L9d
            java.util.ArrayList r1 = r5.l
            int r2 = r5.i
            int r2 = r2 + 1
            int r2 = r2 + r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
        L9d:
            int r0 = r0 + 1
            goto L83
        La0:
            r0 = 0
            r5.n = r0
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.sf.r():void");
    }

    public final void s() {
        abb abbVar = a;
        abb abbVar2 = b;
        StringReader stringReader = this.d;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
            this.d = null;
            Arrays.fill(this.e, (char) 0);
            abbVar2.i(this.e);
            this.e = null;
            abbVar.i(this.c);
        } catch (IOException unused) {
            this.d = null;
            Arrays.fill(this.e, (char) 0);
            abbVar2.i(this.e);
            this.e = null;
            abbVar.i(this.c);
        } catch (Throwable th) {
            this.d = null;
            Arrays.fill(this.e, (char) 0);
            abbVar2.i(this.e);
            this.e = null;
            abbVar.i(this.c);
            this.c = null;
            throw th;
        }
        this.c = null;
    }

    public final char t() {
        r();
        int i = this.f;
        char c = i >= this.g ? (char) 65535 : this.e[i];
        this.f = i + 1;
        return c;
    }

    public final String toString() {
        int i = this.g;
        int i2 = this.f;
        return i - i2 < 0 ? "" : new String(this.e, i2, i - i2);
    }

    public final String u(boolean z) {
        int i = this.f;
        int i2 = this.g;
        char[] cArr = this.e;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&' || (c == '\'' && z)) {
                    break;
                }
                i3++;
            } else {
                if (!z) {
                    break;
                }
                i3++;
            }
        }
        this.f = i3;
        return i3 > i ? p(this.e, this.c, i, i3 - i) : "";
    }

    public final String v() {
        int i = this.f;
        int i2 = this.g;
        char[] cArr = this.e;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f = i3;
        return i3 > i ? p(this.e, this.c, i, i3 - i) : "";
    }

    public final String w() {
        char c;
        r();
        int i = this.f;
        while (true) {
            int i2 = this.f;
            if (i2 >= this.g || (((c = this.e[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f++;
        }
        return p(this.e, this.c, i, this.f - i);
    }

    public final String x(char c) {
        int i;
        r();
        int i2 = this.f;
        while (true) {
            if (i2 >= this.g) {
                i = -1;
                break;
            }
            if (c == this.e[i2]) {
                i = i2 - this.f;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strP = p(this.e, this.c, this.f, i);
            this.f += i;
            return strP;
        }
        r();
        char[] cArr = this.e;
        String[] strArr = this.c;
        int i3 = this.f;
        String strP2 = p(cArr, strArr, i3, this.g - i3);
        this.f = this.g;
        return strP2;
    }

    public final String y(char... cArr) {
        r();
        int i = this.f;
        int i2 = this.g;
        char[] cArr2 = this.e;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f = i3;
        return i3 > i ? p(this.e, this.c, i, i3 - i) : "";
    }

    public final String z(char... cArr) {
        r();
        int i = this.f;
        int i2 = this.g;
        char[] cArr2 = this.e;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f = i3;
        return i3 > i ? p(this.e, this.c, i, i3 - i) : "";
    }
}
