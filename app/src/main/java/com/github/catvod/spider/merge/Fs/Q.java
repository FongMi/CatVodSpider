package com.github.catvod.spider.merge.Fs;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class Q {
    private static final char[] r;
    static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final C0631a a;
    private final C b;
    private O d;
    N i;
    private String o;
    private h1 c = h1.c;
    private boolean e = false;
    private String f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    M j = new M();
    L k = new L();
    H l = new H();
    J m = new J();
    I n = new I();
    private final int[] p = new int[1];
    private final int[] q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    Q(C0631a c0631a, C c) {
        this.a = c0631a;
        this.b = c;
    }

    private void c(String str) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), "Invalid character reference: %s", str));
        }
    }

    final void a(h1 h1Var) {
        this.a.a();
        this.c = h1Var;
    }

    final String b() {
        return this.o;
    }

    final int[] d(Character ch, boolean z) {
        int iIntValue;
        if (this.a.t()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.a.s()) || this.a.A(r)) {
            return null;
        }
        int[] iArr = this.p;
        this.a.v();
        if (this.a.w("#")) {
            boolean zX = this.a.x("X");
            C0631a c0631a = this.a;
            String strI = zX ? c0631a.i() : c0631a.h();
            if (strI.length() != 0) {
                this.a.H();
                if (!this.a.w(";")) {
                    c("missing semicolon");
                }
                try {
                    iIntValue = Integer.valueOf(strI, zX ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    c("character outside of valid range");
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128) {
                        int[] iArr2 = s;
                        if (iIntValue < 160) {
                            c("character is not a valid unicode code point");
                            iIntValue = iArr2[iIntValue - 128];
                        }
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            c("numeric reference with no numerals");
        } else {
            String strK = this.a.k();
            boolean zY = this.a.y(';');
            if (!(com.github.catvod.spider.merge.Em.n.e(strK) || (com.github.catvod.spider.merge.Em.n.f(strK) && zY))) {
                this.a.F();
                if (zY) {
                    c("invalid named reference");
                }
                return null;
            }
            if (!z || (!this.a.C() && !this.a.B() && !this.a.z('=', '-', '_'))) {
                this.a.H();
                if (!this.a.w(";")) {
                    c("missing semicolon");
                }
                int iC = com.github.catvod.spider.merge.Em.n.c(strK, this.q);
                if (iC == 1) {
                    iArr[0] = this.q[0];
                    return iArr;
                }
                if (iC == 2) {
                    return this.q;
                }
                com.github.catvod.spider.merge.Dw.i.a("Unexpected characters returned for " + strK);
                throw null;
            }
        }
        this.a.F();
        return null;
    }

    final void e() {
        this.n.g();
        this.n.getClass();
    }

    final void f() {
        this.m.g();
    }

    final N g(boolean z) {
        N n;
        if (z) {
            n = this.j;
            n.g();
        } else {
            n = this.k;
            n.g();
        }
        this.i = n;
        return n;
    }

    final void h() {
        O.h(this.h);
    }

    final void i(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(c);
    }

    final void j(O o) {
        com.github.catvod.spider.merge.Dw.i.e(this.e);
        this.d = o;
        this.e = true;
        int i = o.a;
        if (i == 2) {
            this.o = ((M) o).b;
        } else if (i == 3 && ((L) o).r()) {
            r("Attributes incorrectly present on end tag");
        }
    }

    final void k(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(str);
    }

    final void l(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append((CharSequence) sb);
    }

    final void m() {
        j(this.n);
    }

    final void n() {
        j(this.m);
    }

    final void o() {
        this.i.q();
        j(this.i);
    }

    final void p(h1 h1Var) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), "Unexpectedly reached end of file (EOF) in input state [%s]", h1Var));
        }
    }

    final void q(h1 h1Var) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.a.s()), h1Var));
        }
    }

    final void r(String str) {
        if (this.b.a()) {
            this.b.add(new B(this.a.E(), str));
        }
    }

    final boolean s() {
        return this.o != null && this.i.t().equalsIgnoreCase(this.o);
    }

    final O t() {
        while (!this.e) {
            this.c.g(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f = null;
            H h = this.l;
            h.i(string);
            return h;
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        H h2 = this.l;
        h2.i(str);
        this.f = null;
        return h2;
    }

    final void u(h1 h1Var) {
        this.c = h1Var;
    }
}
