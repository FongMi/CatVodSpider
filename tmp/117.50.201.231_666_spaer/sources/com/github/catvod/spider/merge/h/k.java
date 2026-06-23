package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.a.C0529a;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class k {
    private static final char[] u;
    static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final a a;
    private final e b;

    @Nullable
    private String o;

    @Nullable
    private String p;
    private int q;
    private l c = l.a;

    @Nullable
    private i d = null;
    private boolean e = false;

    @Nullable
    private String f = null;
    private final StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    i.g i = new i.g();
    i.f j = new i.f();
    i.h k = this.i;
    i.b l = new i.b();
    i.d m = new i.d();
    i.c n = new i.c();
    private int r = -1;
    private final int[] s = new int[1];
    private final int[] t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    k(a aVar, e eVar) {
        this.a = aVar;
        this.b = eVar;
    }

    private void d(String str, Object... objArr) {
        if (this.b.a()) {
            this.b.add(new d(this.a, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    final void a(l lVar) {
        v(lVar);
        this.a.a();
    }

    @Nullable
    final String b() {
        return this.o;
    }

    final String c() {
        if (this.p == null) {
            StringBuilder sbA = C0529a.a("</");
            sbA.append(this.o);
            this.p = sbA.toString();
        }
        return this.p;
    }

    @Nullable
    final int[] e(@Nullable Character ch, boolean z) {
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
            a aVar = this.a;
            String strJ = zD ? aVar.j() : aVar.i();
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
            if (!(com.github.catvod.spider.merge.G.j.e(strL) || (com.github.catvod.spider.merge.G.j.f(strL) && zE))) {
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
                int iC = com.github.catvod.spider.merge.G.j.c(strL, this.t);
                if (iC == 1) {
                    iArr[0] = this.t[0];
                    return iArr;
                }
                if (iC == 2) {
                    return this.t;
                }
                com.github.catvod.spider.merge.E.c.a("Unexpected characters returned for " + strL);
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

    final i.h h(boolean z) {
        i.h hVar;
        if (z) {
            hVar = this.i;
            hVar.h();
        } else {
            hVar = this.j;
            hVar.h();
        }
        this.k = hVar;
        return hVar;
    }

    final void i() {
        i.i(this.h);
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

    final void k(i iVar) {
        com.github.catvod.spider.merge.E.c.b(this.e);
        this.d = iVar;
        this.e = true;
        iVar.j(this.q);
        iVar.a(this.a.L());
        this.r = -1;
        int i = iVar.a;
        if (i == 2) {
            this.o = ((i.g) iVar).d;
            this.p = null;
        } else if (i == 3) {
            i.f fVar = (i.f) iVar;
            if (fVar.u()) {
                s("Attributes incorrectly present on end tag [/%s]", fVar.e);
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

    final void q(l lVar) {
        if (this.b.a()) {
            this.b.add(new d(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", lVar));
        }
    }

    final void r(l lVar) {
        if (this.b.a()) {
            e eVar = this.b;
            a aVar = this.a;
            eVar.add(new d(aVar, "Unexpected character '%s' in input state [%s]", Character.valueOf(aVar.u()), lVar));
        }
    }

    final void s(String str, Object... objArr) {
        if (this.b.a()) {
            this.b.add(new d(this.a, str, objArr));
        }
    }

    final boolean t() {
        return this.o != null && this.k.w().equalsIgnoreCase(this.o);
    }

    final i u() {
        while (!this.e) {
            this.c.g(this, this.a);
        }
        StringBuilder sb = this.g;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            i.b bVar = this.l;
            bVar.k(string);
            this.f = null;
            return bVar;
        }
        String str = this.f;
        if (str == null) {
            this.e = false;
            return this.d;
        }
        i.b bVar2 = this.l;
        bVar2.k(str);
        this.f = null;
        return bVar2;
    }

    final void v(l lVar) {
        int iOrdinal = lVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                this.q = this.a.L();
            }
        } else if (this.r == -1) {
            this.r = this.a.L();
        }
        this.c = lVar;
    }
}
