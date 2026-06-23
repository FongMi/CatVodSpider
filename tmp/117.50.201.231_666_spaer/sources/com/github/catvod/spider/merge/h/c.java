package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.i;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class c {
    public static final k a;
    public static final q b;
    public static final r c;
    public static final s d;
    public static final t e;
    public static final u f;
    public static final v g;
    public static final w h;
    public static final x i;
    public static final a j;
    public static final b k;
    public static final C0009c l;
    public static final d m;
    public static final e n;
    public static final f o;
    public static final g p;
    public static final h q;
    public static final i r;
    public static final j s;
    public static final l t;
    public static final m u;
    public static final n v;
    public static final o w;
    public static final p x;
    private static final String y;
    private static final /* synthetic */ c[] z;

    enum a extends c {
        a() {
            super("InTableText", 9, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            c cVar = c.g;
            if (iVar.a == 5) {
                i.b bVar2 = (i.b) iVar;
                if (bVar2.l().equals(c.y)) {
                    bVar.r(this);
                    return false;
                }
                ((ArrayList) bVar.A()).add(bVar2.l());
                return true;
            }
            if (((ArrayList) bVar.A()).size() > 0) {
                for (String str : (ArrayList) bVar.A()) {
                    if (com.github.catvod.spider.merge.F.b.d(str)) {
                        i.b bVar3 = new i.b();
                        bVar3.k(str);
                        bVar.I(bVar3);
                    } else {
                        bVar.r(this);
                        if (com.github.catvod.spider.merge.F.b.c(bVar.a().h0(), y.A)) {
                            bVar.o0(true);
                            i.b bVar4 = new i.b();
                            bVar4.k(str);
                            bVar.d0(bVar4, cVar);
                            bVar.o0(false);
                        } else {
                            i.b bVar5 = new i.b();
                            bVar5.k(str);
                            bVar.d0(bVar5, cVar);
                        }
                    }
                }
                bVar.U();
            }
            bVar.s0(bVar.Y());
            return bVar.e(iVar);
        }
    }

    enum b extends c {
        b() {
            super("InCaption", 10, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (iVar.f()) {
                i.f fVar = (i.f) iVar;
                if (fVar.e.equals("caption")) {
                    if (!bVar.G(fVar.e)) {
                        bVar.r(this);
                        return false;
                    }
                    bVar.v(false);
                    if (!bVar.b("caption")) {
                        bVar.r(this);
                    }
                    bVar.a0("caption");
                    bVar.l();
                    bVar.s0(c.i);
                    return true;
                }
            }
            if ((iVar.g() && com.github.catvod.spider.merge.F.b.c(((i.g) iVar).e, y.y)) || (iVar.f() && ((i.f) iVar).e.equals("table"))) {
                bVar.r(this);
                if (bVar.f("caption")) {
                    return bVar.e(iVar);
                }
                return true;
            }
            if (!iVar.f() || !com.github.catvod.spider.merge.F.b.c(((i.f) iVar).e, y.J)) {
                return bVar.d0(iVar, c.g);
            }
            bVar.r(this);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.H.c$c, reason: collision with other inner class name */
    enum C0009c extends c {
        C0009c() {
            super("InColumnGroup", 11, null);
        }

        private boolean e(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (!bVar.b("colgroup")) {
                bVar.r(this);
                return false;
            }
            bVar.Z();
            bVar.s0(c.i);
            bVar.e(iVar);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
        @Override // com.github.catvod.spider.merge.H.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean d(com.github.catvod.spider.merge.H.i r12, com.github.catvod.spider.merge.H.b r13) {
            /*
                r11 = this;
                com.github.catvod.spider.merge.H.c$s r0 = com.github.catvod.spider.merge.H.c.d
                boolean r1 = com.github.catvod.spider.merge.H.c.a(r12)
                r2 = 1
                if (r1 == 0) goto Lf
                com.github.catvod.spider.merge.H.i$b r12 = (com.github.catvod.spider.merge.H.i.b) r12
                r13.I(r12)
                return r2
            Lf:
                int r1 = r12.a
                int r1 = com.github.catvod.spider.merge.t.g.a(r1)
                if (r1 == 0) goto Lbf
                java.lang.String r3 = "html"
                r4 = 0
                java.lang.String r5 = "template"
                r6 = 2
                if (r1 == r2) goto L71
                if (r1 == r6) goto L3f
                r0 = 3
                if (r1 == r0) goto L38
                r0 = 5
                if (r1 == r0) goto L2c
                boolean r12 = r11.e(r12, r13)
                return r12
            L2c:
                boolean r0 = r13.b(r3)
                if (r0 == 0) goto L33
                return r2
            L33:
                boolean r12 = r11.e(r12, r13)
                return r12
            L38:
                com.github.catvod.spider.merge.H.i$c r12 = (com.github.catvod.spider.merge.H.i.c) r12
                r13.J(r12)
                goto Lc2
            L3f:
                r1 = r12
                com.github.catvod.spider.merge.H.i$f r1 = (com.github.catvod.spider.merge.H.i.f) r1
                java.lang.String r1 = r1.e
                r1.getClass()
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L6d
                java.lang.String r0 = "colgroup"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L5a
                boolean r12 = r11.e(r12, r13)
                return r12
            L5a:
                boolean r12 = r13.b(r1)
                if (r12 != 0) goto L64
                r13.r(r11)
                return r4
            L64:
                r13.Z()
                com.github.catvod.spider.merge.H.c$x r12 = com.github.catvod.spider.merge.H.c.i
                r13.s0(r12)
                goto Lc2
            L6d:
                r13.d0(r12, r0)
                goto Lc2
            L71:
                r1 = r12
                com.github.catvod.spider.merge.H.i$g r1 = (com.github.catvod.spider.merge.H.i.g) r1
                java.lang.String r7 = r1.e
                r7.getClass()
                int r8 = r7.hashCode()
                r9 = -1321546630(0xffffffffb13acc7a, float:-2.7182794E-9)
                if (r8 == r9) goto La2
                r4 = 98688(0x18180, float:1.38291E-40)
                if (r8 == r4) goto L97
                r4 = 3213227(0x3107ab, float:4.50269E-39)
                if (r8 == r4) goto L8e
            L8c:
                r4 = -1
                goto La9
            L8e:
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L95
                goto L8c
            L95:
                r4 = 2
                goto La9
            L97:
                java.lang.String r3 = "col"
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto La0
                goto L8c
            La0:
                r4 = 1
                goto La9
            La2:
                boolean r3 = r7.equals(r5)
                if (r3 != 0) goto La9
                goto L8c
            La9:
                if (r4 == 0) goto L6d
                if (r4 == r2) goto Lbb
                if (r4 == r6) goto Lb4
                boolean r12 = r11.e(r12, r13)
                return r12
            Lb4:
                com.github.catvod.spider.merge.H.c$v r0 = com.github.catvod.spider.merge.H.c.g
                boolean r12 = r13.d0(r12, r0)
                return r12
            Lbb:
                r13.K(r1)
                goto Lc2
            Lbf:
                r13.r(r11)
            Lc2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.c.C0009c.d(com.github.catvod.spider.merge.H.i, com.github.catvod.spider.merge.H.b):boolean");
        }
    }

    enum d extends c {
        d() {
            super("InTableBody", 12, null);
        }

        private boolean e(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (!bVar.G("tbody") && !bVar.G("thead") && !bVar.C("tfoot", null)) {
                bVar.r(this);
                return false;
            }
            bVar.n();
            bVar.f(bVar.a().h0());
            return bVar.e(iVar);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            c cVar = c.i;
            int iA = com.github.catvod.spider.merge.t.g.a(iVar.a);
            if (iA == 1) {
                i.g gVar = (i.g) iVar;
                String str = gVar.e;
                if (!str.equals("tr")) {
                    if (!com.github.catvod.spider.merge.F.b.c(str, y.v)) {
                        return com.github.catvod.spider.merge.F.b.c(str, y.B) ? e(iVar, bVar) : bVar.d0(iVar, cVar);
                    }
                    bVar.r(this);
                    bVar.h("tr");
                    return bVar.e(gVar);
                }
                bVar.n();
                bVar.H(gVar);
                bVar.s0(c.n);
            } else {
                if (iA != 2) {
                    return bVar.d0(iVar, cVar);
                }
                String str2 = ((i.f) iVar).e;
                if (!com.github.catvod.spider.merge.F.b.c(str2, y.H)) {
                    if (str2.equals("table")) {
                        return e(iVar, bVar);
                    }
                    if (!com.github.catvod.spider.merge.F.b.c(str2, y.C)) {
                        return bVar.d0(iVar, cVar);
                    }
                    bVar.r(this);
                    return false;
                }
                if (!bVar.G(str2)) {
                    bVar.r(this);
                    return false;
                }
                bVar.n();
                bVar.Z();
                bVar.s0(cVar);
            }
            return true;
        }
    }

    enum e extends c {
        e() {
            super("InRow", 13, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            d dVar = c.m;
            x xVar = c.i;
            if (iVar.g()) {
                i.g gVar = (i.g) iVar;
                String str = gVar.e;
                if (com.github.catvod.spider.merge.F.b.c(str, y.v)) {
                    bVar.p();
                    bVar.H(gVar);
                    bVar.s0(c.o);
                    bVar.N();
                    return true;
                }
                if (!com.github.catvod.spider.merge.F.b.c(str, y.D)) {
                    return bVar.d0(iVar, xVar);
                }
                if (bVar.f("tr")) {
                    return bVar.e(iVar);
                }
                return false;
            }
            if (!iVar.f()) {
                return bVar.d0(iVar, xVar);
            }
            String str2 = ((i.f) iVar).e;
            if (str2.equals("tr")) {
                if (!bVar.G(str2)) {
                    bVar.r(this);
                    return false;
                }
            } else {
                if (str2.equals("table")) {
                    if (bVar.f("tr")) {
                        return bVar.e(iVar);
                    }
                    return false;
                }
                if (!com.github.catvod.spider.merge.F.b.c(str2, y.s)) {
                    if (!com.github.catvod.spider.merge.F.b.c(str2, y.E)) {
                        return bVar.d0(iVar, xVar);
                    }
                    bVar.r(this);
                    return false;
                }
                if (!bVar.G(str2) || !bVar.G("tr")) {
                    bVar.r(this);
                    return false;
                }
            }
            bVar.p();
            bVar.Z();
            bVar.s0(dVar);
            return true;
        }
    }

    enum f extends c {
        f() {
            super("InCell", 14, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            e eVar = c.n;
            v vVar = c.g;
            if (!iVar.f()) {
                if (!iVar.g() || !com.github.catvod.spider.merge.F.b.c(((i.g) iVar).e, y.y)) {
                    return bVar.d0(iVar, vVar);
                }
                if (bVar.G("td") || bVar.G("th")) {
                    bVar.f(bVar.G("td") ? "td" : "th");
                    return bVar.e(iVar);
                }
                bVar.r(this);
                return false;
            }
            String str = ((i.f) iVar).e;
            if (!com.github.catvod.spider.merge.F.b.c(str, y.v)) {
                if (com.github.catvod.spider.merge.F.b.c(str, y.w)) {
                    bVar.r(this);
                    return false;
                }
                if (!com.github.catvod.spider.merge.F.b.c(str, y.x)) {
                    return bVar.d0(iVar, vVar);
                }
                if (bVar.G(str)) {
                    bVar.f(bVar.G("td") ? "td" : "th");
                    return bVar.e(iVar);
                }
                bVar.r(this);
                return false;
            }
            if (!bVar.G(str)) {
                bVar.r(this);
                bVar.s0(eVar);
                return false;
            }
            bVar.v(false);
            if (!bVar.b(str)) {
                bVar.r(this);
            }
            bVar.a0(str);
            bVar.l();
            bVar.s0(eVar);
            return true;
        }
    }

    enum g extends c {
        g() {
            super("InSelect", 15, null);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
        @Override // com.github.catvod.spider.merge.H.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean d(com.github.catvod.spider.merge.H.i r13, com.github.catvod.spider.merge.H.b r14) {
            /*
                Method dump skipped, instruction units count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.c.g.d(com.github.catvod.spider.merge.H.i, com.github.catvod.spider.merge.H.b):boolean");
        }
    }

    enum h extends c {
        h() {
            super("InSelectInTable", 16, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (iVar.g() && com.github.catvod.spider.merge.F.b.c(((i.g) iVar).e, y.G)) {
                bVar.r(this);
                bVar.a0("select");
                bVar.m0();
                return bVar.e(iVar);
            }
            if (iVar.f()) {
                i.f fVar = (i.f) iVar;
                if (com.github.catvod.spider.merge.F.b.c(fVar.e, y.G)) {
                    bVar.r(this);
                    if (!bVar.G(fVar.e)) {
                        return false;
                    }
                    bVar.a0("select");
                    bVar.m0();
                    return bVar.e(iVar);
                }
            }
            return bVar.d0(iVar, c.p);
        }
    }

    enum i extends c {
        i() {
            super("InTemplate", 17, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
        @Override // com.github.catvod.spider.merge.H.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean d(com.github.catvod.spider.merge.H.i r7, com.github.catvod.spider.merge.H.b r8) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.c.i.d(com.github.catvod.spider.merge.H.i, com.github.catvod.spider.merge.H.b):boolean");
        }
    }

    enum j extends c {
        j() {
            super("AfterBody", 18, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (iVar.d()) {
                bVar.r(this);
                return false;
            }
            if (iVar.g() && ((i.g) iVar).e.equals("html")) {
                return bVar.d0(iVar, c.g);
            }
            if (iVar.f() && ((i.f) iVar).e.equals("html")) {
                bVar.getClass();
                if (bVar.W("html")) {
                    bVar.a0("html");
                }
                bVar.s0(c.v);
                return true;
            }
            if (iVar.e()) {
                return true;
            }
            bVar.r(this);
            bVar.l0();
            return bVar.e(iVar);
        }
    }

    enum k extends c {
        k() {
            super("Initial", 0, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            q qVar = c.b;
            if (c.a(iVar)) {
                return true;
            }
            if (iVar.c()) {
                bVar.J((i.c) iVar);
            } else {
                if (!iVar.d()) {
                    bVar.s0(qVar);
                    return bVar.e(iVar);
                }
                i.d dVar = (i.d) iVar;
                com.github.catvod.spider.merge.G.g gVar = new com.github.catvod.spider.merge.G.g(bVar.h.d(dVar.d.toString()), dVar.f.toString(), dVar.g.toString());
                gVar.L(dVar.e);
                bVar.d.M(gVar);
                if (dVar.h) {
                    bVar.d.B0();
                }
                bVar.s0(qVar);
            }
            return true;
        }
    }

    enum l extends c {
        l() {
            super("InFrameset", 19, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            i.g gVar;
            c cVar;
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
            } else if (iVar.c()) {
                bVar.J((i.c) iVar);
            } else {
                if (iVar.d()) {
                    bVar.r(this);
                    return false;
                }
                if (iVar.g()) {
                    gVar = (i.g) iVar;
                    String str = gVar.e;
                    str.getClass();
                    switch (str) {
                        case "frameset":
                            bVar.H(gVar);
                            break;
                        case "html":
                            cVar = c.g;
                            break;
                        case "frame":
                            bVar.K(gVar);
                            break;
                        case "noframes":
                            cVar = c.d;
                            break;
                        default:
                            bVar.r(this);
                            break;
                    }
                    return false;
                }
                if (iVar.f() && ((i.f) iVar).e.equals("frameset")) {
                    if (bVar.b("html")) {
                        bVar.r(this);
                        return false;
                    }
                    bVar.Z();
                    if (!bVar.b("frameset")) {
                        bVar.s0(c.u);
                    }
                } else {
                    if (!iVar.e()) {
                        bVar.r(this);
                        return false;
                    }
                    if (!bVar.b("html")) {
                        bVar.r(this);
                    }
                }
            }
            return true;
        }
    }

    enum m extends c {
        m() {
            super("AfterFrameset", 20, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            c cVar;
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (iVar.d()) {
                bVar.r(this);
                return false;
            }
            if (iVar.g() && ((i.g) iVar).e.equals("html")) {
                cVar = c.g;
            } else {
                if (iVar.f() && ((i.f) iVar).e.equals("html")) {
                    bVar.s0(c.w);
                    return true;
                }
                if (!iVar.g() || !((i.g) iVar).e.equals("noframes")) {
                    if (iVar.e()) {
                        return true;
                    }
                    bVar.r(this);
                    return false;
                }
                cVar = c.d;
            }
            return bVar.d0(iVar, cVar);
        }
    }

    enum n extends c {
        n() {
            super("AfterAfterBody", 21, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (iVar.d() || (iVar.g() && ((i.g) iVar).e.equals("html"))) {
                return bVar.d0(iVar, c.g);
            }
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.e()) {
                return true;
            }
            bVar.r(this);
            bVar.l0();
            return bVar.e(iVar);
        }
    }

    enum o extends c {
        o() {
            super("AfterAfterFrameset", 22, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (iVar.d() || c.a(iVar) || (iVar.g() && ((i.g) iVar).e.equals("html"))) {
                return bVar.d0(iVar, c.g);
            }
            if (iVar.e()) {
                return true;
            }
            if (iVar.g() && ((i.g) iVar).e.equals("noframes")) {
                return bVar.d0(iVar, c.d);
            }
            bVar.r(this);
            return false;
        }
    }

    enum q extends c {
        q() {
            super("BeforeHtml", 1, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            r rVar = c.c;
            if (iVar.d()) {
                bVar.r(this);
                return false;
            }
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.g()) {
                i.g gVar = (i.g) iVar;
                if (gVar.e.equals("html")) {
                    bVar.H(gVar);
                    bVar.s0(rVar);
                    return true;
                }
            }
            if (!(iVar.f() && com.github.catvod.spider.merge.F.b.c(((i.f) iVar).e, y.e)) && iVar.f()) {
                bVar.r(this);
                return false;
            }
            bVar.P();
            bVar.s0(rVar);
            return bVar.e(iVar);
        }
    }

    enum r extends c {
        r() {
            super("BeforeHead", 2, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (iVar.d()) {
                bVar.r(this);
                return false;
            }
            if (iVar.g() && ((i.g) iVar).e.equals("html")) {
                return c.g.d(iVar, bVar);
            }
            if (iVar.g()) {
                i.g gVar = (i.g) iVar;
                if (gVar.e.equals("head")) {
                    bVar.p0(bVar.H(gVar));
                    bVar.s0(c.d);
                    return true;
                }
            }
            if (iVar.f() && com.github.catvod.spider.merge.F.b.c(((i.f) iVar).e, y.e)) {
                bVar.h("head");
                return bVar.e(iVar);
            }
            if (iVar.f()) {
                bVar.r(this);
                return false;
            }
            bVar.h("head");
            return bVar.e(iVar);
        }
    }

    enum s extends c {
        s() {
            super("InHead", 3, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            c cVar;
            w wVar = c.h;
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            int iA = com.github.catvod.spider.merge.t.g.a(iVar.a);
            if (iA == 0) {
                bVar.r(this);
                return false;
            }
            if (iA == 1) {
                i.g gVar = (i.g) iVar;
                String str = gVar.e;
                if (str.equals("html")) {
                    return c.g.d(iVar, bVar);
                }
                if (com.github.catvod.spider.merge.F.b.c(str, y.a)) {
                    com.github.catvod.spider.merge.G.i iVarK = bVar.K(gVar);
                    if (str.equals("base") && iVarK.o("href")) {
                        bVar.T(iVarK);
                    }
                } else if (str.equals("meta")) {
                    bVar.K(gVar);
                } else if (str.equals("title")) {
                    bVar.c.v(com.github.catvod.spider.merge.H.l.c);
                    bVar.S();
                    bVar.s0(wVar);
                    bVar.H(gVar);
                } else if (com.github.catvod.spider.merge.F.b.c(str, y.b)) {
                    c.b(gVar, bVar);
                } else if (str.equals("noscript")) {
                    bVar.H(gVar);
                    cVar = c.e;
                    bVar.s0(cVar);
                } else if (str.equals("script")) {
                    bVar.c.v(com.github.catvod.spider.merge.H.l.f);
                    bVar.S();
                    bVar.s0(wVar);
                    bVar.H(gVar);
                } else {
                    if (str.equals("head")) {
                        bVar.r(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        bVar.f("head");
                        return bVar.e(iVar);
                    }
                    bVar.H(gVar);
                    bVar.N();
                    bVar.s(false);
                    i iVar2 = c.r;
                    bVar.s0(iVar2);
                    bVar.f0(iVar2);
                }
            } else if (iA == 2) {
                String str2 = ((i.f) iVar).e;
                if (str2.equals("head")) {
                    bVar.Z();
                    cVar = c.f;
                    bVar.s0(cVar);
                } else {
                    if (com.github.catvod.spider.merge.F.b.c(str2, y.c)) {
                        bVar.f("head");
                        return bVar.e(iVar);
                    }
                    if (!str2.equals("template")) {
                        bVar.r(this);
                        return false;
                    }
                    if (bVar.W(str2)) {
                        bVar.v(true);
                        if (!str2.equals(bVar.a().h0())) {
                            bVar.r(this);
                        }
                        bVar.a0(str2);
                        bVar.l();
                        bVar.b0();
                        bVar.m0();
                    } else {
                        bVar.r(this);
                    }
                }
            } else {
                if (iA != 3) {
                    bVar.f("head");
                    return bVar.e(iVar);
                }
                bVar.J((i.c) iVar);
            }
            return true;
        }
    }

    enum t extends c {
        t() {
            super("InHeadNoscript", 4, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            i.b bVar2;
            s sVar = c.d;
            if (iVar.d()) {
                bVar.r(this);
            } else {
                if (iVar.g() && ((i.g) iVar).e.equals("html")) {
                    return bVar.d0(iVar, c.g);
                }
                if (!iVar.f() || !((i.f) iVar).e.equals("noscript")) {
                    if (c.a(iVar) || iVar.c() || (iVar.g() && com.github.catvod.spider.merge.F.b.c(((i.g) iVar).e, y.f))) {
                        return bVar.d0(iVar, sVar);
                    }
                    if (iVar.f() && ((i.f) iVar).e.equals("br")) {
                        bVar.r(this);
                        bVar2 = new i.b();
                    } else {
                        if ((iVar.g() && com.github.catvod.spider.merge.F.b.c(((i.g) iVar).e, y.I)) || iVar.f()) {
                            bVar.r(this);
                            return false;
                        }
                        bVar.r(this);
                        bVar2 = new i.b();
                    }
                    bVar2.k(iVar.toString());
                    bVar.I(bVar2);
                    return true;
                }
                bVar.Z();
                bVar.s0(sVar);
            }
            return true;
        }
    }

    enum u extends c {
        u() {
            super("AfterHead", 5, null);
        }

        private boolean e(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            bVar.h("body");
            bVar.s(true);
            return bVar.e(iVar);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            s sVar = c.d;
            v vVar = c.g;
            if (c.a(iVar)) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.c()) {
                bVar.J((i.c) iVar);
                return true;
            }
            if (iVar.d()) {
                bVar.r(this);
                return true;
            }
            if (iVar.g()) {
                i.g gVar = (i.g) iVar;
                String str = gVar.e;
                if (str.equals("html")) {
                    return bVar.d0(iVar, vVar);
                }
                if (str.equals("body")) {
                    bVar.H(gVar);
                    bVar.s(false);
                    bVar.s0(vVar);
                    return true;
                }
                if (str.equals("frameset")) {
                    bVar.H(gVar);
                    bVar.s0(c.t);
                    return true;
                }
                if (com.github.catvod.spider.merge.F.b.c(str, y.g)) {
                    bVar.r(this);
                    com.github.catvod.spider.merge.G.i iVarZ = bVar.z();
                    bVar.e.add(iVarZ);
                    bVar.d0(iVar, sVar);
                    bVar.j0(iVarZ);
                    return true;
                }
                if (str.equals("head")) {
                    bVar.r(this);
                    return false;
                }
            } else if (iVar.f()) {
                String str2 = ((i.f) iVar).e;
                if (!com.github.catvod.spider.merge.F.b.c(str2, y.d)) {
                    if (str2.equals("template")) {
                        bVar.d0(iVar, sVar);
                        return true;
                    }
                    bVar.r(this);
                    return false;
                }
            }
            e(iVar, bVar);
            return true;
        }
    }

    enum v extends c {
        v() {
            super("InBody", 6, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x018c, code lost:
        
            if (r44.f("body") != false) goto L164;
         */
        /* JADX WARN: Code restructure failed: missing block: B:524:0x0950, code lost:
        
            if (r44.K(r2).d("type").equalsIgnoreCase("hidden") == false) goto L675;
         */
        /* JADX WARN: Code restructure failed: missing block: B:711:0x0cef, code lost:
        
            if (com.github.catvod.spider.merge.F.b.c(r1, com.github.catvod.spider.merge.H.c.y.o) != false) goto L550;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x034a  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x03a2  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x03d0  */
        /* JADX WARN: Removed duplicated region for block: B:633:0x0b81 A[PHI: r0 r13
          0x0b81: PHI (r0v26 java.lang.String) = (r0v20 java.lang.String), (r0v27 java.lang.String) binds: [B:632:0x0b7f, B:606:0x0afb] A[DONT_GENERATE, DONT_INLINE]
          0x0b81: PHI (r13v14 com.github.catvod.spider.merge.H.i$g) = (r13v10 com.github.catvod.spider.merge.H.i$g), (r13v15 com.github.catvod.spider.merge.H.i$g) binds: [B:632:0x0b7f, B:606:0x0afb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:722:0x02d7 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3, types: [com.github.catvod.spider.merge.G.i] */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v6, types: [com.github.catvod.spider.merge.G.i, com.github.catvod.spider.merge.G.m] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r15v3, types: [com.github.catvod.spider.merge.G.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r44v0, types: [com.github.catvod.spider.merge.H.b, com.github.catvod.spider.merge.H.m] */
        /* JADX WARN: Type inference failed for: r9v10, types: [com.github.catvod.spider.merge.G.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v24 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v26 */
        /* JADX WARN: Type inference failed for: r9v8, types: [com.github.catvod.spider.merge.G.i] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.github.catvod.spider.merge.H.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean d(com.github.catvod.spider.merge.H.i r43, com.github.catvod.spider.merge.H.b r44) {
            /*
                Method dump skipped, instruction units count: 3746
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.c.v.d(com.github.catvod.spider.merge.H.i, com.github.catvod.spider.merge.H.b):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean e(com.github.catvod.spider.merge.H.i r7, com.github.catvod.spider.merge.H.b r8) {
            /*
                r6 = this;
                r7.getClass()
                com.github.catvod.spider.merge.H.i$f r7 = (com.github.catvod.spider.merge.H.i.f) r7
                java.lang.String r7 = r7.e
                java.util.ArrayList<com.github.catvod.spider.merge.G.i> r0 = r8.e
                com.github.catvod.spider.merge.G.i r1 = r8.y(r7)
                r2 = 0
                if (r1 != 0) goto L14
                r8.r(r6)
                return r2
            L14:
                int r1 = r0.size()
                r3 = 1
                int r1 = r1 - r3
            L1a:
                if (r1 < 0) goto L49
                java.lang.Object r4 = r0.get(r1)
                com.github.catvod.spider.merge.G.i r4 = (com.github.catvod.spider.merge.G.i) r4
                java.lang.String r5 = r4.h0()
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L3c
                r8.u(r7)
                boolean r0 = r8.b(r7)
                if (r0 != 0) goto L38
                r8.r(r6)
            L38:
                r8.a0(r7)
                goto L49
            L3c:
                boolean r4 = r8.R(r4)
                if (r4 == 0) goto L46
                r8.r(r6)
                return r2
            L46:
                int r1 = r1 + (-1)
                goto L1a
            L49:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H.c.v.e(com.github.catvod.spider.merge.H.i, com.github.catvod.spider.merge.H.b):boolean");
        }
    }

    enum w extends c {
        w() {
            super("Text", 7, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            if (iVar.b()) {
                bVar.I((i.b) iVar);
                return true;
            }
            if (iVar.e()) {
                bVar.r(this);
                bVar.Z();
                bVar.s0(bVar.Y());
                return bVar.e(iVar);
            }
            if (!iVar.f()) {
                return true;
            }
            bVar.Z();
            bVar.s0(bVar.Y());
            return true;
        }
    }

    enum x extends c {
        x() {
            super("InTable", 8, null);
        }

        @Override // com.github.catvod.spider.merge.H.c
        final boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            c cVar;
            s sVar = c.d;
            if (!iVar.b() || !com.github.catvod.spider.merge.F.b.c(bVar.a().h0(), y.A)) {
                if (iVar.c()) {
                    bVar.J((i.c) iVar);
                    return true;
                }
                if (iVar.d()) {
                    bVar.r(this);
                    return false;
                }
                if (!iVar.g()) {
                    if (!iVar.f()) {
                        if (!iVar.e()) {
                            e(iVar, bVar);
                            return true;
                        }
                        if (bVar.b("html")) {
                            bVar.r(this);
                        }
                        return true;
                    }
                    String str = ((i.f) iVar).e;
                    if (str.equals("table")) {
                        if (!bVar.G(str)) {
                            bVar.r(this);
                            return false;
                        }
                        bVar.a0("table");
                        bVar.m0();
                    } else {
                        if (com.github.catvod.spider.merge.F.b.c(str, y.z)) {
                            bVar.r(this);
                            return false;
                        }
                        if (!str.equals("template")) {
                            e(iVar, bVar);
                            return true;
                        }
                        bVar.d0(iVar, sVar);
                    }
                    return true;
                }
                i.g gVar = (i.g) iVar;
                String str2 = gVar.e;
                if (str2.equals("caption")) {
                    bVar.o();
                    bVar.N();
                    bVar.H(gVar);
                    cVar = c.k;
                } else if (str2.equals("colgroup")) {
                    bVar.o();
                    bVar.H(gVar);
                    cVar = c.l;
                } else if (str2.equals("col")) {
                    bVar.o();
                    bVar.h("colgroup");
                } else if (com.github.catvod.spider.merge.F.b.c(str2, y.s)) {
                    bVar.o();
                    bVar.H(gVar);
                    cVar = c.m;
                } else {
                    if (!com.github.catvod.spider.merge.F.b.c(str2, y.t)) {
                        if (str2.equals("table")) {
                            bVar.r(this);
                            if (!bVar.G(str2)) {
                                return false;
                            }
                            bVar.a0(str2);
                            if (bVar.m0()) {
                                return bVar.e(iVar);
                            }
                            bVar.H(gVar);
                            return true;
                        }
                        if (com.github.catvod.spider.merge.F.b.c(str2, y.u)) {
                            return bVar.d0(iVar, sVar);
                        }
                        if (str2.equals("input")) {
                            if (!gVar.u() || !gVar.n.l("type").equalsIgnoreCase("hidden")) {
                                e(iVar, bVar);
                                return true;
                            }
                            bVar.K(gVar);
                        } else {
                            if (!str2.equals("form")) {
                                e(iVar, bVar);
                                return true;
                            }
                            bVar.r(this);
                            if (bVar.x() != null || bVar.W("template")) {
                                return false;
                            }
                            bVar.L(gVar, false, false);
                        }
                        return true;
                    }
                    bVar.o();
                    bVar.h("tbody");
                }
                bVar.s0(cVar);
                return true;
            }
            bVar.U();
            bVar.S();
            bVar.s0(c.j);
            return bVar.e(iVar);
        }

        final void e(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar) {
            bVar.r(this);
            bVar.o0(true);
            bVar.d0(iVar, c.g);
            bVar.o0(false);
        }
    }

    static final class y {
        static final String[] a = {"base", "basefont", "bgsound", "command", "link"};
        static final String[] b = {"noframes", "style"};
        static final String[] c = {"body", "br", "html"};
        static final String[] d = {"body", "br", "html"};
        static final String[] e = {"body", "br", "head", "html"};
        static final String[] f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
        static final String[] g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
        static final String[] h = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        static final String[] i = {"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] j = {"address", "div", "p"};
        static final String[] k = {"dd", "dt"};
        static final String[] l = {"applet", "marquee", "object"};
        static final String[] m = {"param", "source", "track"};
        static final String[] n = {"action", "name", "prompt"};
        static final String[] o = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] p = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] q = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] r = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] s = {"tbody", "tfoot", "thead"};
        static final String[] t = {"td", "th", "tr"};
        static final String[] u = {"script", "style", "template"};
        static final String[] v = {"td", "th"};
        static final String[] w = {"body", "caption", "col", "colgroup", "html"};
        static final String[] x = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] y = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] z = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] A = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] B = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] C = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        static final String[] E = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        static final String[] F = {"input", "keygen", "textarea"};
        static final String[] G = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] H = {"tbody", "tfoot", "thead"};
        static final String[] I = {"head", "noscript"};
        static final String[] J = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] K = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
        static final String[] L = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.github.catvod.spider.merge.H.c$p] */
    static {
        k kVar = new k();
        a = kVar;
        q qVar = new q();
        b = qVar;
        r rVar = new r();
        c = rVar;
        s sVar = new s();
        d = sVar;
        t tVar = new t();
        e = tVar;
        u uVar = new u();
        f = uVar;
        v vVar = new v();
        g = vVar;
        w wVar = new w();
        h = wVar;
        x xVar = new x();
        i = xVar;
        a aVar = new a();
        j = aVar;
        b bVar = new b();
        k = bVar;
        C0009c c0009c = new C0009c();
        l = c0009c;
        d dVar = new d();
        m = dVar;
        e eVar = new e();
        n = eVar;
        f fVar = new f();
        o = fVar;
        g gVar = new g();
        p = gVar;
        h hVar = new h();
        q = hVar;
        i iVar = new i();
        r = iVar;
        j jVar = new j();
        s = jVar;
        l lVar = new l();
        t = lVar;
        m mVar = new m();
        u = mVar;
        n nVar = new n();
        v = nVar;
        o oVar = new o();
        w = oVar;
        ?? r23 = new c() { // from class: com.github.catvod.spider.merge.H.c.p
            @Override // com.github.catvod.spider.merge.H.c
            final boolean d(com.github.catvod.spider.merge.H.i iVar2, com.github.catvod.spider.merge.H.b bVar2) {
                return true;
            }
        };
        x = r23;
        z = new c[]{kVar, qVar, rVar, sVar, tVar, uVar, vVar, wVar, xVar, aVar, bVar, c0009c, dVar, eVar, fVar, gVar, hVar, iVar, jVar, lVar, mVar, nVar, oVar, r23};
        y = String.valueOf((char) 0);
    }

    c(String str, int i2, k kVar) {
    }

    static boolean a(com.github.catvod.spider.merge.H.i iVar) {
        if (iVar.b()) {
            return com.github.catvod.spider.merge.F.b.d(((i.b) iVar).l());
        }
        return false;
    }

    static void b(i.g gVar, com.github.catvod.spider.merge.H.b bVar) {
        bVar.c.v(com.github.catvod.spider.merge.H.l.e);
        bVar.S();
        bVar.s0(h);
        bVar.H(gVar);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) z.clone();
    }

    abstract boolean d(com.github.catvod.spider.merge.H.i iVar, com.github.catvod.spider.merge.H.b bVar);
}
