package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.a1.C0899d;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0973a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = -1;
    private String[] h = new String[512];
    private ArrayList<Integer> i = null;
    private int j = 1;
    private boolean k;
    private String l;
    private int m;

    public C0973a(Reader reader, int i) {
        C0899d.d(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(i, 32768)];
        b();
    }

    private void N() {
        if (y()) {
            if (this.i.size() > 0) {
                int iZ = z(this.f);
                if (iZ == -1) {
                    iZ = 0;
                }
                int iIntValue = this.i.get(iZ).intValue();
                this.j += iZ;
                this.i.clear();
                this.i.add(Integer.valueOf(iIntValue));
            }
            for (int i = this.e; i < this.c; i++) {
                if (this.a[i] == '\n') {
                    this.i.add(Integer.valueOf(this.f + 1 + i));
                }
            }
        }
    }

    private void b() {
        int i;
        int i2;
        boolean z;
        if (this.k || (i = this.e) < this.d) {
            return;
        }
        int i3 = this.g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.b.skip(j);
            this.b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.b;
                char[] cArr = this.a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.k = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.b.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C0899d.d(z);
                this.c = i4;
                this.f += i;
                this.e = i2;
                if (this.g != -1) {
                    this.g = 0;
                }
                this.d = Math.min(i4, 24576);
            }
            N();
            this.l = null;
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z0.b(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c(char[] r9, java.lang.String[] r10, int r11, int r12) {
        /*
            r0 = 12
            if (r12 <= r0) goto La
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9, r11, r12)
            return r10
        La:
            r0 = 1
            if (r12 >= r0) goto L10
            java.lang.String r9 = ""
            return r9
        L10:
            r1 = 0
            r2 = 0
            r3 = 0
        L13:
            if (r2 >= r12) goto L1f
            int r3 = r3 * 31
            int r4 = r11 + r2
            char r4 = r9[r4]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L13
        L1f:
            r2 = r3 & 511(0x1ff, float:7.16E-43)
            r3 = r10[r2]
            if (r3 == 0) goto L47
            int r4 = r3.length()
            if (r12 != r4) goto L43
            r5 = r11
            r4 = r12
            r6 = 0
        L2e:
            int r7 = r4 + (-1)
            if (r4 == 0) goto L44
            int r4 = r5 + 1
            char r5 = r9[r5]
            int r8 = r6 + 1
            char r6 = r3.charAt(r6)
            if (r5 == r6) goto L3f
            goto L43
        L3f:
            r5 = r4
            r4 = r7
            r6 = r8
            goto L2e
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L47
            return r3
        L47:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r2] = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d1.C0973a.c(char[], java.lang.String[], int, int):java.lang.String");
    }

    private boolean x() {
        return this.e >= this.c;
    }

    private int z(int i) {
        if (!y()) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(this.i, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    final int A(int i) {
        if (!y()) {
            return 1;
        }
        int iZ = z(i);
        return iZ == -1 ? this.j : iZ + this.j + 1;
    }

    final void B() {
        if (this.c - this.e < 1024) {
            this.d = 0;
        }
        b();
        this.g = this.e;
    }

    final boolean C(String str) {
        boolean z;
        b();
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            z = false;
            break;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.a[this.e + i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        this.e = str.length() + this.e;
        return true;
    }

    final boolean D(String str) {
        boolean z;
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            z = false;
            break;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.a[this.e + i])) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        this.e = str.length() + this.e;
        return true;
    }

    final boolean E(char c) {
        return !w() && this.a[this.e] == c;
    }

    final boolean F(char... cArr) {
        if (w()) {
            return false;
        }
        b();
        char c = this.a[this.e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    final boolean G(char[] cArr) {
        b();
        return !w() && Arrays.binarySearch(cArr, this.a[this.e]) >= 0;
    }

    final boolean H() {
        if (w()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    final boolean I() {
        char c;
        return !w() && (c = this.a[this.e]) >= '0' && c <= '9';
    }

    final boolean J() {
        if (w()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    final int K(CharSequence charSequence) {
        b();
        char cCharAt = charSequence.charAt(0);
        int i = this.e;
        while (i < this.c) {
            if (cCharAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (cCharAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int L() {
        return this.f + this.e;
    }

    final void M() {
        int i = this.g;
        if (i == -1) {
            throw new com.github.catvod.spider.merge.Z0.b(new IOException("Mark invalid"));
        }
        this.e = i;
        this.g = -1;
    }

    public final void O(boolean z) {
        if (z && this.i == null) {
            this.i = new ArrayList<>(409);
            N();
        } else {
            if (z) {
                return;
            }
            this.i = null;
        }
    }

    final void P() {
        int i = this.e;
        if (i < 1) {
            throw new com.github.catvod.spider.merge.Z0.b(new IOException("WTF: No buffer left to unconsume."));
        }
        this.e = i - 1;
    }

    final void Q() {
        this.g = -1;
    }

    public final void a() {
        this.e++;
    }

    public final void d() {
        Reader reader = this.b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw th;
        }
        this.b = null;
        this.a = null;
        this.h = null;
    }

    final int e(int i) {
        int iZ;
        if (y() && (iZ = z(i)) != -1) {
            return (i - this.i.get(iZ).intValue()) + 1;
        }
        return i + 1;
    }

    final char f() {
        b();
        char c = x() ? (char) 65535 : this.a[this.e];
        this.e++;
        return c;
    }

    final String g(boolean z) {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'') {
                    if (!z) {
                        break;
                        break;
                    }
                    break;
                }
                continue;
                i3++;
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String h() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String i() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (c = this.a[i]) < '0' || c > '9') {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    final String j() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (((c = this.a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    final String k() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    final String l() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        while (!x()) {
            char[] cArr = this.a;
            int i3 = this.e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.e = i3 + 1;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    final String m() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String n() {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String o() {
        int iK = K("]]>");
        if (iK != -1) {
            String strC = c(this.a, this.h, this.e, iK);
            this.e += iK;
            return strC;
        }
        int i = this.c;
        int i2 = this.e;
        if (i - i2 < 3) {
            return s();
        }
        int i3 = (i - 3) + 1;
        String strC2 = c(this.a, this.h, i2, i3 - i2);
        this.e = i3;
        return strC2;
    }

    public final String p(char c) {
        int i;
        b();
        int i2 = this.e;
        while (true) {
            if (i2 >= this.c) {
                i = -1;
                break;
            }
            if (c == this.a[i2]) {
                i = i2 - this.e;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return s();
        }
        String strC = c(this.a, this.h, this.e, i);
        this.e += i;
        return strC;
    }

    public final String q(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String r(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String s() {
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i = this.e;
        String strC = c(cArr, strArr, i, this.c - i);
        this.e = this.c;
        return strC;
    }

    final boolean t(String str) {
        if (str.equals(this.l)) {
            int i = this.m;
            if (i == -1) {
                return false;
            }
            if (i >= this.e) {
                return true;
            }
        }
        this.l = str;
        Locale locale = Locale.ENGLISH;
        int iK = K(str.toLowerCase(locale));
        if (iK > -1) {
            this.m = this.e + iK;
            return true;
        }
        int iK2 = K(str.toUpperCase(locale));
        boolean z = iK2 > -1;
        this.m = z ? this.e + iK2 : -1;
        return z;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.e;
        return i - i2 < 0 ? "" : new String(this.a, i2, i - i2);
    }

    public final char u() {
        b();
        if (x()) {
            return (char) 65535;
        }
        return this.a[this.e];
    }

    final String v() {
        return A(this.f + this.e) + ":" + e(this.f + this.e);
    }

    public final boolean w() {
        b();
        return this.e >= this.c;
    }

    public final boolean y() {
        return this.i != null;
    }
}
