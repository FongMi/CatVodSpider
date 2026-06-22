package com.github.catvod.spider.merge.M;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class P {
    public static final char[] t;
    public static final int[] u = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final C0030a a;
    public final C b;
    public g1 c = g1.a;
    public N d = null;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);
    public final L i;
    public final K j;
    public M k;
    public final G l;
    public final I m;
    public final H n;
    public String o;
    public String p;
    public int q;
    public final int[] r;
    public final int[] s;

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        t = cArr;
        Arrays.sort(cArr);
    }

    public P(C0030a c0030a, C c) {
        L l = new L();
        this.i = l;
        this.j = new K();
        this.k = l;
        this.l = new G();
        this.m = new I();
        this.n = new H();
        this.q = -1;
        this.r = new int[1];
        this.s = new int[2];
        this.a = c0030a;
        this.b = c;
    }

    public final void a(String str, Object... objArr) {
        C c = this.b;
        if (c.a()) {
            c.add(new com.github.catvod.spider.merge.B.c(this.a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    public final int[] b(Character ch, boolean z) {
        int i;
        char c;
        char c2;
        char c3;
        char c4;
        int i2;
        String strC;
        char c5;
        int iIntValue;
        int i3;
        char c6;
        C0030a c0030a = this.a;
        if (c0030a.n()) {
            return null;
        }
        if (ch != null && ch.charValue() == c0030a.l()) {
            return null;
        }
        char[] cArr = t;
        c0030a.b();
        if (!c0030a.n() && Arrays.binarySearch(cArr, c0030a.a[c0030a.e]) >= 0) {
            return null;
        }
        if (c0030a.c - c0030a.e < 1024) {
            c0030a.d = 0;
        }
        c0030a.b();
        c0030a.g = c0030a.e;
        boolean zP = c0030a.p("#");
        char c7 = 'A';
        int[] iArr = this.r;
        if (zP) {
            boolean zQ = c0030a.q("X");
            if (zQ) {
                c0030a.b();
                int i4 = c0030a.e;
                while (true) {
                    i3 = c0030a.e;
                    if (i3 >= c0030a.c || (((c6 = c0030a.a[i3]) < '0' || c6 > '9') && ((c6 < c7 || c6 > 'F') && (c6 < 'a' || c6 > 'f')))) {
                        break;
                    }
                    c0030a.e = i3 + 1;
                    c7 = 'A';
                }
                strC = C0030a.c(c0030a.a, c0030a.h, i4, i3 - i4);
            } else {
                c0030a.b();
                int i5 = c0030a.e;
                while (true) {
                    i2 = c0030a.e;
                    if (i2 >= c0030a.c || (c5 = c0030a.a[i2]) < '0' || c5 > '9') {
                        break;
                    }
                    c0030a.e = i2 + 1;
                }
                strC = C0030a.c(c0030a.a, c0030a.h, i5, i2 - i5);
            }
            if (strC.length() == 0) {
                a("numeric reference with no numerals", new Object[0]);
                c0030a.x();
                return null;
            }
            c0030a.g = -1;
            if (!c0030a.p(";")) {
                a("missing semicolon on [&#%s]", strC);
            }
            try {
                iIntValue = Integer.valueOf(strC, zQ ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                a("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128 && iIntValue < 160) {
                    a("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                    iIntValue = u[iIntValue - 128];
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        c0030a.b();
        int i6 = c0030a.e;
        while (true) {
            int i7 = c0030a.e;
            if (i7 >= c0030a.c || (((c4 = c0030a.a[i7]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                break;
            }
            c0030a.e++;
        }
        while (true) {
            i = c0030a.e;
            if (i >= c0030a.c || (c3 = c0030a.a[i]) < '0' || c3 > '9') {
                break;
            }
            c0030a.e = i + 1;
        }
        String strC2 = C0030a.c(c0030a.a, c0030a.h, i6, i - i6);
        boolean zR = c0030a.r(';');
        char[] cArr2 = com.github.catvod.spider.merge.L.n.a;
        com.github.catvod.spider.merge.L.m mVar = com.github.catvod.spider.merge.L.m.base;
        int iBinarySearch = Arrays.binarySearch(mVar.a, strC2);
        if ((iBinarySearch >= 0 ? mVar.b[iBinarySearch] : -1) == -1) {
            com.github.catvod.spider.merge.L.m mVar2 = com.github.catvod.spider.merge.L.m.extended;
            int iBinarySearch2 = Arrays.binarySearch(mVar2.a, strC2);
            if ((iBinarySearch2 >= 0 ? mVar2.b[iBinarySearch2] : -1) == -1 || !zR) {
                c0030a.x();
                if (zR) {
                    a("invalid named reference [%s]", strC2);
                }
                return null;
            }
        }
        if (z && (c0030a.u() || ((!c0030a.n() && (c2 = c0030a.a[c0030a.e]) >= '0' && c2 <= '9') || c0030a.s('=', '-', '_')))) {
            c0030a.x();
            return null;
        }
        c0030a.g = -1;
        if (!c0030a.p(";")) {
            a("missing semicolon on [&%s]", strC2);
        }
        String str = (String) com.github.catvod.spider.merge.L.n.b.get(strC2);
        int[] iArr2 = this.s;
        if (str != null) {
            iArr2[0] = str.codePointAt(0);
            iArr2[1] = str.codePointAt(1);
            c = 2;
        } else {
            com.github.catvod.spider.merge.L.m mVar3 = com.github.catvod.spider.merge.L.m.extended;
            int iBinarySearch3 = Arrays.binarySearch(mVar3.a, strC2);
            int i8 = iBinarySearch3 >= 0 ? mVar3.b[iBinarySearch3] : -1;
            if (i8 != -1) {
                iArr2[0] = i8;
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            iArr[0] = iArr2[0];
            return iArr;
        }
        if (c == 2) {
            return iArr2;
        }
        throw new com.github.catvod.spider.merge.J.c("Unexpected characters returned for ".concat(strC2));
    }

    public final M c(boolean z) {
        M m;
        if (z) {
            m = this.i;
            m.f();
        } else {
            m = this.j;
            m.f();
        }
        this.k = m;
        return m;
    }

    public final void d() {
        N.g(this.h);
    }

    public final void e(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
        } else {
            StringBuilder sb = this.g;
            if (sb.length() == 0) {
                sb.append(this.f);
            }
            sb.append(c);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void f(N n) {
        if (this.e) {
            throw new com.github.catvod.spider.merge.J.c("Must be false");
        }
        this.d = n;
        this.e = true;
        n.getClass();
        C0030a c0030a = this.a;
        c0030a.getClass();
        this.q = -1;
        int i = n.a;
        if (i == 2) {
            this.o = ((L) n).b;
            this.p = null;
        } else if (i == 3) {
            K k = (K) n;
            if (k.l()) {
                Object[] objArr = {k.c};
                C c = this.b;
                if (c.a()) {
                    c.add(new com.github.catvod.spider.merge.B.c(c0030a, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void g(String str) {
        if (this.f == null) {
            this.f = str;
        } else {
            StringBuilder sb = this.g;
            if (sb.length() == 0) {
                sb.append(this.f);
            }
            sb.append(str);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void h(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
        } else {
            StringBuilder sb2 = this.g;
            if (sb2.length() == 0) {
                sb2.append(this.f);
            }
            sb2.append((CharSequence) sb);
        }
        this.l.getClass();
        this.a.getClass();
    }

    public final void i() {
        f(this.n);
    }

    public final void j() {
        f(this.m);
    }

    public final void k() {
        M m = this.k;
        if (m.f) {
            m.o();
        }
        f(this.k);
    }

    public final void l(g1 g1Var) {
        C c = this.b;
        if (c.a()) {
            c.add(new com.github.catvod.spider.merge.B.c(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{g1Var}));
        }
    }

    public final void m(g1 g1Var) {
        C c = this.b;
        if (c.a()) {
            C0030a c0030a = this.a;
            c.add(new com.github.catvod.spider.merge.B.c(c0030a, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c0030a.l()), g1Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.k.m().equalsIgnoreCase(this.o);
    }

    public final void o(g1 g1Var) {
        int iOrdinal = g1Var.ordinal();
        C0030a c0030a = this.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                c0030a.w();
            }
        } else if (this.q == -1) {
            this.q = c0030a.w();
        }
        this.c = g1Var;
    }
}
