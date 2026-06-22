package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.a1.C0899d;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class S {
    private static final char[] u;
    static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final C0973a a;
    private final C0971D b;
    private String o;
    private String p;
    private int q;
    private i1 c = i1.b;
    private P d = null;
    private boolean e = false;
    private String f = null;
    private final StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    N i = new N();
    M j = new M();
    O k = this.i;
    I l = new I();
    K m = new K();
    J n = new J();
    private int r = -1;
    private final int[] s = new int[1];
    private final int[] t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    S(C0973a c0973a, C0971D c0971d) {
        this.a = c0973a;
        this.b = c0971d;
    }

    private void d(String str, Object... objArr) {
        if (this.b.a()) {
            this.b.add(new C0970C(this.a, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    final void a(i1 i1Var) {
        v(i1Var);
        this.a.a();
    }

    final String b() {
        return this.o;
    }

    final String c() {
        if (this.p == null) {
            StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("</");
            sbB.append(this.o);
            this.p = sbB.toString();
        }
        return this.p;
    }

    final int[] e(Character ch, boolean z) {
        int iIntValue;
        if (this.a.w()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.a.u()) || this.a.G(u)) {
            return null;
        }
        int[] iArr = this.s;
        this.a.B();
        if (this.a.C("#")) {
            boolean zD = this.a.D("X");
            C0973a c0973a = this.a;
            String strJ = zD ? c0973a.j() : c0973a.i();
            if (strJ.length() != 0) {
                this.a.Q();
                if (!this.a.C(";")) {
                    d("missing semicolon on [&#%s]", strJ);
                }
                try {
                    iIntValue = Integer.valueOf(strJ, zD ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    d("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128) {
                        int[] iArr2 = v;
                        if (iIntValue < 160) {
                            d("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                            iIntValue = iArr2[iIntValue - 128];
                        }
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            d("numeric reference with no numerals", new Object[0]);
        } else {
            String strL = this.a.l();
            boolean zE = this.a.E(';');
            if (!(com.github.catvod.spider.merge.c1.o.f(strL) || (com.github.catvod.spider.merge.c1.o.g(strL) && zE))) {
                this.a.M();
                if (zE) {
                    d("invalid named reference [%s]", strL);
                }
                return null;
            }
            if (!z || (!this.a.J() && !this.a.I() && !this.a.F('=', '-', '_'))) {
                this.a.Q();
                if (!this.a.C(";")) {
                    d("missing semicolon on [&%s]", strL);
                }
                int iC = com.github.catvod.spider.merge.c1.o.c(strL, this.t);
                if (iC == 1) {
                    iArr[0] = this.t[0];
                    return iArr;
                }
                if (iC == 2) {
                    return this.t;
                }
                C0899d.a("Unexpected characters returned for " + strL);
                throw null;
            }
        }
        this.a.M();
        return null;
    }

    final void f() {
        this.n.h();
        this.n.getClass();
    }

    final void g() {
        this.m.h();
    }

    final O h(boolean z) {
        O o;
        if (z) {
            o = this.i;
            o.h();
        } else {
            o = this.j;
            o.h();
        }
        this.k = o;
        return o;
    }

    final void i() {
        P.i(this.h);
    }

    final void j(char c) {
        if (this.f == null) {
            this.f = String.valueOf(c);
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(c);
        }
        this.l.j(this.r);
        this.l.a(this.a.L());
    }

    final void k(P p) {
        C0899d.c(this.e);
        this.d = p;
        this.e = true;
        p.j(this.q);
        p.a(this.a.L());
        this.r = -1;
        int i = p.a;
        if (i == 2) {
            this.o = ((N) p).d;
            this.p = null;
        } else if (i == 3) {
            M m = (M) p;
            if (m.u()) {
                s("Attributes incorrectly present on end tag [/%s]", m.e);
            }
        }
    }

    final void l(String str) {
        if (this.f == null) {
            this.f = str;
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append(str);
        }
        this.l.j(this.r);
        this.l.a(this.a.L());
    }

    final void m(StringBuilder sb) {
        if (this.f == null) {
            this.f = sb.toString();
        } else {
            if (this.g.length() == 0) {
                this.g.append(this.f);
            }
            this.g.append((CharSequence) sb);
        }
        this.l.j(this.r);
        this.l.a(this.a.L());
    }

    final void n() {
        k(this.n);
    }

    final void o() {
        k(this.m);
    }

    final void p() {
        this.k.s();
        k(this.k);
    }

    final void q(i1 i1Var) {
        if (this.b.a()) {
            this.b.add(new C0970C(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", i1Var));
        }
    }

    final void r(i1 i1Var) {
        if (this.b.a()) {
            C0971D c0971d = this.b;
            C0973a c0973a = this.a;
            c0971d.add(new C0970C(c0973a, "Unexpected character '%s' in input state [%s]", Character.valueOf(c0973a.u()), i1Var));
        }
    }

    final void s(String str, Object... objArr) {
        if (this.b.a()) {
            this.b.add(new C0970C(this.a, str, objArr));
        }
    }

    final boolean t() {
        return this.o != null && this.k.w().equalsIgnoreCase(this.o);
    }

    final P u() {
        while (!this.e) {
            this.c.g(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            I i = this.l;
            i.k(string);
            this.f = null;
            return i;
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        I i2 = this.l;
        i2.k(str);
        this.f = null;
        return i2;
    }

    final void v(i1 i1Var) {
        int iOrdinal = i1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                this.q = this.a.L();
            }
        } else if (this.r == -1) {
            this.r = this.a.L();
        }
        this.c = i1Var;
    }
}
