package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class T {
    private static final char[] u;
    static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private final C0017a a;
    private final D b;

    @Nullable
    private String o;

    @Nullable
    private String p;
    private int q;
    private j1 c = j1.a;

    @Nullable
    private Q d = null;
    private boolean e = false;

    @Nullable
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

    T(C0017a c0017a, D d) {
        this.a = c0017a;
        this.b = d;
    }

    private void d(String str, Object... objArr) {
        if (this.b.a()) {
            this.b.add(new C(this.a, String.format(oZP.d("3C010120003C114F14290D27140C03241E75070A11241E301B0C127B4C") + str, objArr)));
        }
    }

    final void a(j1 j1Var) {
        v(j1Var);
        this.a.a();
    }

    @Nullable
    final String b() {
        return this.o;
    }

    final String c() {
        if (this.p == null) {
            StringBuilder sbC = C0133t.c(oZP.d("4940"));
            sbC.append(this.o);
            this.p = sbC.toString();
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
        boolean zC = this.a.C(oZP.d("56"));
        String strD = oZP.d("4E");
        if (zC) {
            boolean zD = this.a.D(oZP.d("2D"));
            C0017a c0017a = this.a;
            String strJ = zD ? c0017a.j() : c0017a.i();
            if (strJ.length() != 0) {
                this.a.Q();
                if (!this.a.C(strD)) {
                    d(oZP.d("18060432053B124F0424013C16001B2E02751A01571A4A76501C2A"), strJ);
                }
                try {
                    iIntValue = Integer.valueOf(strJ, zD ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    d(oZP.d("160716330D36010A056137700632572E1921060613244C3A134F0120003C114F0520023210"), Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128) {
                        int[] iArr2 = v;
                        if (iIntValue < 160) {
                            d(oZP.d("160716330D36010A05613770063257281F751B0003610D75030E1B28087500011E220331104F142E0830551F18280221"), Integer.valueOf(iIntValue));
                            iIntValue = iArr2[iIntValue - 128];
                        }
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            d(oZP.d("1B1A1A241E3C164F05240A30070A19220975020603294C3B1A4F19340130070E1B32"), new Object[0]);
        } else {
            String strL = this.a.l();
            boolean zE = this.a.E(';');
            if (!(com.github.catvod.spider.merge.L.o.e(strL) || (com.github.catvod.spider.merge.L.o.f(strL) && zE))) {
                this.a.M();
                if (zE) {
                    d(oZP.d("1C010120003C114F19200130114F05240A30070A192209752E4A041C"), strL);
                }
                return null;
            }
            if (!z || (!this.a.J() && !this.a.I() && !this.a.F('=', '-', '_'))) {
                this.a.Q();
                if (!this.a.C(strD)) {
                    d(oZP.d("18060432053B124F0424013C16001B2E02751A01571A4A700632"), strL);
                }
                int iC = com.github.catvod.spider.merge.L.o.c(strL, this.t);
                if (iC == 1) {
                    iArr[0] = this.t[0];
                    return iArr;
                }
                if (iC == 2) {
                    return this.t;
                }
                com.github.catvod.spider.merge.J.c.a(oZP.d("200112391C30161B12254C361D0E05200F21101D04611E30011A052F0931550918334C") + strL);
                throw null;
            }
        }
        this.a.M();
        return null;
    }

    final void f() {
        this.n.h();
        this.n.f = true;
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
        Q.i(this.h);
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

    final void k(Q q) {
        com.github.catvod.spider.merge.J.c.b(this.e);
        this.d = q;
        this.e = true;
        q.j(this.q);
        q.a(this.a.L());
        this.r = -1;
        int i = q.a;
        if (i == 2) {
            this.o = ((N) q).d;
            this.p = null;
        } else if (i == 3) {
            M m = (M) q;
            if (m.u()) {
                s(oZP.d("341B03330537001B12324C3C1B0C18331E30161B1B384C25070A0424022155001961093B114F03200B752E40523231"), m.e);
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

    final void q(j1 j1Var) {
        if (this.b.a()) {
            this.b.add(new C(this.a, oZP.d("200112391C30161B1225002C551D12200F3D100B57240231550011610A3C190A5769291A3346572802751C0107341875061B163509752E4A041C"), j1Var));
        }
    }

    final void r(j1 j1Var) {
        if (this.b.a()) {
            D d = this.b;
            C0017a c0017a = this.a;
            d.add(new C(c0017a, oZP.d("200112391C30161B12254C361D0E05200F21101D57664926524F1E2F4C3C1B1F02354C26010E03244C0E501C2A"), Character.valueOf(c0017a.u()), j1Var));
        }
    }

    final void s(String str, Object... objArr) {
        if (this.b.a()) {
            this.b.add(new C(this.a, str, objArr));
        }
    }

    final boolean t() {
        return this.o != null && this.k.w().equalsIgnoreCase(this.o);
    }

    final Q u() {
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

    final void v(j1 j1Var) {
        int iOrdinal = j1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                this.q = this.a.L();
            }
        } else if (this.r == -1) {
            this.r = this.a.L();
        }
        this.c = j1Var;
    }
}
