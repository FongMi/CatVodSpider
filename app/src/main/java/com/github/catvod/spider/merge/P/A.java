package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.A.C0000a;
import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.A.L;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class A extends com.github.catvod.spider.merge.z.q {
    public static final com.github.catvod.spider.merge.B.b[] k;
    public static final C0019u l = new C0019u(1);
    public static final com.github.catvod.spider.merge.z.x m = new com.github.catvod.spider.merge.z.x(new String[]{null, "'processing-instruction'", "'or'", "'and'", "'$'", null, null, null, "'/'", "'//'", "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", "'*'", "'`div`'", "'`mod`'", "'..'", "'@'", "','", "'|'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'^='", "'$='", "'*='", "'~='", "'!~'", "':'", "'::'", "'''", "'\"'"}, new String[]{null, null, null, null, null, "NodeType", "Number", "AxisName", "PATHSEP", "ABRPATH", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", "MUL", "DIVISION", "MODULO", "DOTDOT", "AT", "COMMA", "PIPE", "LESS", "MORE_", "LE", "GE", "EQUALITY", "INEQUALITY", "START_WITH", "END_WITH", "CONTAIN_WITH", "REGEXP_WITH", "REGEXP_NOT_WITH", "COLON", "CC", "APOS", "QUOT", "Literal", "Whitespace", "NCName"}, null);
    public static final String[] n = new String[42];
    public static final C0000a o;

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f4 A[SYNTHETIC] */
    static {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.P.A.<clinit>():void");
    }

    public A(com.github.catvod.spider.merge.z.h hVar) {
        super(hVar);
        this.b = new L(this, o, k, l);
    }

    public final void A() {
        q qVar = new q(this.c, this.g);
        e(30, qVar);
        try {
            try {
                d(qVar);
                this.c = 156;
                n();
                this.c = 161;
                this.d.k(this);
                int iA = this.e.a(1);
                while (iA == 2) {
                    this.c = 157;
                    i(2);
                    this.c = 158;
                    n();
                    this.c = 163;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void B() {
        r rVar = new r(this.c, this.g);
        e(26, rVar);
        try {
            try {
                this.c = 147;
                this.d.k(this);
                int iB = ((L) this.b).b(13, this.e, this.g);
                if (iB == 1) {
                    d(rVar);
                    this.c = 141;
                    u();
                } else if (iB == 2) {
                    d(rVar);
                    this.c = 142;
                    r();
                    this.c = 145;
                    this.d.k(this);
                    int iA = this.e.a(1);
                    if (iA == 8 || iA == 9) {
                        this.c = 143;
                        rVar.e = this.e.b(1);
                        int iA2 = this.e.a(1);
                        if (iA2 == 8 || iA2 == 9) {
                            if (this.e.a(1) == -1) {
                                this.j = true;
                            }
                            this.d.b();
                            c();
                        } else {
                            rVar.e = this.d.g(this);
                        }
                        this.c = 144;
                        G();
                    }
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void C() {
        s sVar = new s(this.c, this.g);
        e(14, sVar);
        try {
            try {
                d(sVar);
                this.c = 99;
                i(12);
                this.c = 100;
                q();
                this.c = 101;
                i(13);
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void D() {
        t tVar = new t(this.c, this.g);
        e(20, tVar);
        try {
            try {
                this.c = 115;
                this.d.k(this);
                int iA = this.e.a(1);
                if (iA == 4) {
                    d(tVar);
                    this.c = 107;
                    K();
                } else if (iA != 10) {
                    int i = 39;
                    if (iA != 39) {
                        if (iA != 41) {
                            i = 6;
                            if (iA == 6) {
                                d(tVar);
                                this.c = 113;
                            } else if (iA != 7) {
                                throw new com.github.catvod.spider.merge.z.o(this);
                            }
                        }
                        d(tVar);
                        this.c = 114;
                        s();
                    } else {
                        d(tVar);
                        this.c = 112;
                    }
                    i(i);
                } else {
                    d(tVar);
                    this.c = 108;
                    i(10);
                    this.c = 109;
                    q();
                    this.c = 110;
                    i(11);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void E() {
        u uVar = new u(this.c, this.g);
        e(44, uVar);
        try {
            try {
                d(uVar);
                this.c = 206;
                x();
                this.c = 209;
                this.d.k(this);
                if (this.e.a(1) == 35) {
                    this.c = 207;
                    i(35);
                    this.c = 208;
                    x();
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void F() {
        v vVar = new v(this.c, this.g);
        e(36, vVar);
        try {
            try {
                d(vVar);
                this.c = 180;
                m();
                this.c = 185;
                this.d.k(this);
                int iA = this.e.a(1);
                while ((iA & (-64)) == 0 && ((1 << iA) & 33470545920L) != 0) {
                    this.c = 181;
                    vVar.e = this.e.b(1);
                    int iA2 = this.e.a(1);
                    if ((iA2 & (-64)) != 0 || ((1 << iA2) & 33470545920L) == 0) {
                        vVar.e = this.d.g(this);
                    } else {
                        if (this.e.a(1) == -1) {
                            this.j = true;
                        }
                        this.d.b();
                        c();
                    }
                    this.c = 182;
                    m();
                    this.c = 187;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void G() {
        w wVar = new w(this.c, this.g);
        e(6, wVar);
        try {
            try {
                d(wVar);
                this.c = 63;
                H();
                this.c = 68;
                this.d.k(this);
                int iA = this.e.a(1);
                while (true) {
                    if (iA != 8 && iA != 9) {
                        break;
                    }
                    this.c = 64;
                    this.e.b(1);
                    int iA2 = this.e.a(1);
                    if (iA2 == 8 || iA2 == 9) {
                        if (this.e.a(1) == -1) {
                            this.j = true;
                        }
                        this.d.b();
                        c();
                    } else {
                        this.d.g(this);
                    }
                    this.c = 65;
                    H();
                    this.c = 70;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0041, s -> 0x0043, LOOP:0: B:31:0x0083->B:30:0x0071, LOOP_END, TryCatch #1 {s -> 0x0043, blocks: (B:3:0x0010, B:20:0x003b, B:21:0x0040, B:26:0x0045, B:27:0x0050, B:31:0x0083, B:30:0x0071), top: B:40:0x0010, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.P.x r0 = new com.github.catvod.spider.merge.P.x
            com.github.catvod.spider.merge.z.r r1 = r4.g
            int r2 = r4.c
            r0.<init>(r2, r1)
            r1 = 8
            r4.e(r1, r0)
            r1 = 80
            r4.c = r1     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            com.github.catvod.spider.merge.z.j r1 = r4.d     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r1.k(r4)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            com.github.catvod.spider.merge.z.h r1 = r4.e     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r2 = 1
            int r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            if (r1 == r2) goto L50
            r3 = 5
            if (r1 == r3) goto L50
            r3 = 7
            if (r1 == r3) goto L50
            r3 = 41
            if (r1 == r3) goto L50
            r3 = 16
            if (r1 == r3) goto L45
            r3 = 17
            if (r1 == r3) goto L50
            r3 = 20
            if (r1 == r3) goto L45
            r3 = 21
            if (r1 != r3) goto L3b
            goto L50
        L3b:
            com.github.catvod.spider.merge.z.o r0 = new com.github.catvod.spider.merge.z.o     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            throw r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
        L41:
            r0 = move-exception
            goto L98
        L43:
            r0 = move-exception
            goto L8c
        L45:
            r4.d(r0)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0 = 79
            r4.c = r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r4.k()     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            goto L88
        L50:
            r4.d(r0)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0 = 71
            r4.c = r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r4.o()     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0 = 72
            r4.c = r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r4.z()     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0 = 76
            r4.c = r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            com.github.catvod.spider.merge.z.j r0 = r4.d     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0.k(r4)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            com.github.catvod.spider.merge.z.h r0 = r4.e     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            goto L83
        L6d:
            r1 = 12
            if (r0 != r1) goto L88
            r0 = 73
            r4.c = r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r4.C()     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0 = 78
            r4.c = r0     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            com.github.catvod.spider.merge.z.j r0 = r4.d     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            r0.k(r4)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            com.github.catvod.spider.merge.z.h r0 = r4.e     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
        L83:
            int r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L41 com.github.catvod.spider.merge.z.s -> L43
            goto L6d
        L88:
            r4.f()
            goto L97
        L8c:
            com.github.catvod.spider.merge.z.j r1 = r4.d     // Catch: java.lang.Throwable -> L41
            r1.h(r4, r0)     // Catch: java.lang.Throwable -> L41
            com.github.catvod.spider.merge.z.j r1 = r4.d     // Catch: java.lang.Throwable -> L41
            r1.f(r4, r0)     // Catch: java.lang.Throwable -> L41
            goto L88
        L97:
            return
        L98:
            r4.f()
            goto L9d
        L9c:
            throw r0
        L9d:
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.P.A.H():void");
    }

    public final void I() {
        y yVar = new y(this.c, this.g);
        e(42, yVar);
        try {
            try {
                d(yVar);
                this.c = 202;
                this.d.k(this);
                if (this.e.a(1) == 14) {
                    this.c = 201;
                    yVar.e = i(14);
                }
                this.c = 204;
                J();
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void J() {
        z zVar = new z(this.c, this.g);
        e(24, zVar);
        try {
            try {
                this.c = 139;
                this.d.k(this);
                int iB = ((L) this.b).b(11, this.e, this.g);
                if (iB == 1) {
                    d(zVar);
                    this.c = 131;
                    B();
                    this.c = 134;
                    this.d.k(this);
                    if (this.e.a(1) == 23) {
                        this.c = 132;
                        zVar.e = i(23);
                        this.c = 133;
                        J();
                    }
                } else if (iB == 2) {
                    d(zVar);
                    this.c = 136;
                    i(8);
                    this.c = 137;
                    i(23);
                    this.c = 138;
                    J();
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void K() {
        e eVar = new e(this.g, this.c, 1);
        e(48, eVar);
        try {
            try {
                d(eVar);
                this.c = 213;
                i(4);
                this.c = 214;
                E();
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    @Override // com.github.catvod.spider.merge.z.u
    public final C0000a a() {
        return o;
    }

    public final void k() {
        b bVar = new b(this.c, this.g);
        e(16, bVar);
        try {
            try {
                d(bVar);
                this.c = 103;
                int iA = this.e.a(1);
                if (iA == 16 || iA == 20) {
                    if (this.e.a(1) == -1) {
                        this.j = true;
                    }
                    this.d.b();
                    c();
                } else {
                    this.d.g(this);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void l() {
        c cVar = new c(this.c, this.g);
        e(4, cVar);
        try {
            try {
                d(cVar);
                this.c = 60;
                cVar.e = this.e.b(1);
                int iA = this.e.a(1);
                if (iA == 8 || iA == 9) {
                    if (this.e.a(1) == -1) {
                        this.j = true;
                    }
                    this.d.b();
                    c();
                } else {
                    cVar.e = this.d.g(this);
                }
                this.c = 61;
                G();
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void m() {
        d dVar = new d(this.g, this.c, 0);
        e(38, dVar);
        try {
            try {
                d(dVar);
                this.c = 188;
                w();
                this.c = 193;
                this.d.k(this);
                int iA = this.e.a(1);
                while (true) {
                    if (iA != 14 && iA != 15) {
                        break;
                    }
                    this.c = 189;
                    this.e.b(1);
                    int iA2 = this.e.a(1);
                    if (iA2 == 14 || iA2 == 15) {
                        if (this.e.a(1) == -1) {
                            this.j = true;
                        }
                        this.d.b();
                        c();
                    } else {
                        this.d.g(this);
                    }
                    this.c = 190;
                    w();
                    this.c = 195;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void n() {
        e eVar = new e(this.g, this.c, 0);
        e(32, eVar);
        try {
            try {
                d(eVar);
                this.c = 164;
                p();
                this.c = 169;
                this.d.k(this);
                int iA = this.e.a(1);
                while (iA == 3) {
                    this.c = 165;
                    i(3);
                    this.c = 166;
                    p();
                    this.c = 171;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void o() {
        f fVar = new f(this.c, this.g);
        e(10, fVar);
        try {
            try {
                this.c = 87;
                this.d.k(this);
                int iB = ((L) this.b).b(5, this.e, this.g);
                if (iB == 1) {
                    d(fVar);
                    this.c = 82;
                    i(7);
                    this.c = 83;
                    i(36);
                } else if (iB == 2) {
                    d(fVar);
                    this.c = 85;
                    this.d.k(this);
                    if (this.e.a(1) == 21) {
                        this.c = 84;
                        i(21);
                    }
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void p() {
        g gVar = new g(this.c, this.g);
        e(34, gVar);
        try {
            try {
                d(gVar);
                this.c = 172;
                F();
                this.c = 177;
                this.d.k(this);
                int iA = this.e.a(1);
                while (true) {
                    if (iA != 28 && iA != 29) {
                        break;
                    }
                    this.c = 173;
                    gVar.e = this.e.b(1);
                    int iA2 = this.e.a(1);
                    if (iA2 == 28 || iA2 == 29) {
                        if (this.e.a(1) == -1) {
                            this.j = true;
                        }
                        this.d.b();
                        c();
                    } else {
                        gVar.e = this.d.g(this);
                    }
                    this.c = 174;
                    F();
                    this.c = 179;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void q() {
        h hVar = new h(this.c, this.g);
        e(18, hVar);
        try {
            try {
                d(hVar);
                this.c = 105;
                A();
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void r() {
        i iVar = new i(this.c, this.g);
        e(28, iVar);
        try {
            try {
                d(iVar);
                this.c = 149;
                D();
                this.c = 153;
                this.d.k(this);
                int iA = this.e.a(1);
                while (iA == 12) {
                    this.c = 150;
                    C();
                    this.c = 155;
                    this.d.k(this);
                    iA = this.e.a(1);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void s() {
        j jVar = new j(this.c, this.g);
        e(22, jVar);
        try {
            try {
                d(jVar);
                this.c = 117;
                t();
                this.c = 118;
                i(10);
                this.c = 127;
                this.d.k(this);
                int iA = this.e.a(1);
                if ((iA & (-64)) == 0 && ((1 << iA) & 2748782430194L) != 0) {
                    this.c = 119;
                    q();
                    this.c = 124;
                    this.d.k(this);
                    com.github.catvod.spider.merge.z.h hVar = this.e;
                    while (hVar.a(1) == 22) {
                        this.c = 120;
                        i(22);
                        this.c = 121;
                        q();
                        this.c = 126;
                        this.d.k(this);
                        hVar = this.e;
                    }
                }
                this.c = 129;
                i(11);
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void t() {
        k kVar = new k(this.c, this.g);
        e(46, kVar);
        try {
            try {
                d(kVar);
                this.c = 211;
                E();
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
        } finally {
            f();
        }
    }

    public final void u() {
        l lVar = new l(this.c, this.g);
        e(2, lVar);
        try {
            try {
                this.c = 58;
                this.d.k(this);
                int iA = this.e.a(1);
                if (iA == 1 || iA == 5 || iA == 41 || iA == 7) {
                    d(lVar);
                    this.c = 56;
                    G();
                } else if (iA == 8 || iA == 9) {
                    d(lVar);
                    this.c = 57;
                    l();
                } else {
                    if (iA != 16 && iA != 17 && iA != 20 && iA != 21) {
                        throw new com.github.catvod.spider.merge.z.o(this);
                    }
                    d(lVar);
                    this.c = 56;
                    G();
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final d v() {
        d dVar = new d(this.g, this.c, 1);
        e(0, dVar);
        try {
            try {
                d(dVar);
                this.c = 54;
                q();
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return dVar;
        } finally {
            f();
        }
    }

    public final void w() {
        m mVar = new m(this.c, this.g);
        e(40, mVar);
        try {
            try {
                d(mVar);
                this.c = 196;
                I();
                this.c = 199;
                this.d.k(this);
                int iA = this.e.a(1);
                if ((iA & (-64)) == 0 && ((1 << iA) & 917504) != 0) {
                    this.c = 197;
                    mVar.e = this.e.b(1);
                    int iA2 = this.e.a(1);
                    if ((iA2 & (-64)) != 0 || ((1 << iA2) & 917504) == 0) {
                        mVar.e = this.d.g(this);
                    } else {
                        if (this.e.a(1) == -1) {
                            this.j = true;
                        }
                        this.d.b();
                        c();
                    }
                    this.c = 198;
                    w();
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void x() {
        n nVar = new n(this.c, this.g);
        e(52, nVar);
        try {
            try {
                d(nVar);
                this.c = 224;
                int iA = this.e.a(1);
                if (iA == 7 || iA == 41) {
                    if (this.e.a(1) == -1) {
                        this.j = true;
                    }
                    this.d.b();
                    c();
                } else {
                    this.d.g(this);
                }
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final void y() {
        int iB;
        o oVar = new o(this.c, this.g);
        e(50, oVar);
        try {
            try {
                this.c = 222;
                this.d.k(this);
                iB = ((L) this.b).b(23, this.e, this.g);
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            if (iB == 1) {
                d(oVar);
                this.c = 216;
            } else {
                if (iB != 2) {
                    if (iB == 3) {
                        d(oVar);
                        this.c = 221;
                        E();
                    }
                }
                d(oVar);
                this.c = 217;
                x();
                this.c = 218;
                i(35);
                this.c = 219;
            }
            i(17);
        } finally {
            f();
        }
    }

    public final void z() {
        int iA;
        p pVar = new p(this.c, this.g);
        e(12, pVar);
        try {
            try {
                this.c = 97;
                this.d.k(this);
                iA = this.e.a(1);
            } catch (com.github.catvod.spider.merge.z.s e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            if (iA == 1) {
                d(pVar);
                this.c = 93;
                i(1);
                this.c = 94;
                i(10);
                this.c = 95;
                i(39);
                this.c = 96;
            } else {
                if (iA != 5) {
                    if (iA != 7 && iA != 17 && iA != 41) {
                        throw new com.github.catvod.spider.merge.z.o(this);
                    }
                    d(pVar);
                    this.c = 89;
                    y();
                    f();
                }
                d(pVar);
                this.c = 90;
                i(5);
                this.c = 91;
                i(10);
                this.c = 92;
            }
            i(11);
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }
}
