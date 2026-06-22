package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.m1.AbstractC1312d;
import com.github.catvod.spider.merge.m1.AbstractC1313e;
import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.InterfaceC1314f;
import com.github.catvod.spider.merge.p1.C1366c;
import com.github.catvod.spider.merge.p1.C1367d;
import com.github.catvod.spider.merge.p1.C1368e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h extends AbstractC1312d {
    private int f;
    private List<C1311c> g;
    private long h;
    private c i;
    private String j;
    private List<q> k;
    private List<b> l;
    private List<q> m;
    private String n;
    private String o;

    public h(int i, String str, String str2, int i2, String str3, String str4) {
        super(str, str2, str4);
        this.g = Collections.emptyList();
        this.h = -1L;
        this.j = "";
        Collections.emptyList();
        Collections.emptyList();
        this.k = Collections.emptyList();
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.n = "";
        this.o = "";
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        Collections.emptyList();
        this.f = i2;
    }

    private static h e(f fVar) throws C1368e {
        String strN = fVar.n();
        int iH = fVar.H();
        String strG = fVar.g();
        String strI = fVar.i();
        int iP = fVar.p();
        if (iH == 1 || com.github.catvod.spider.merge.L1.m.j(strN) || com.github.catvod.spider.merge.L1.m.j(strG) || strI == null || iP == -1) {
            throw new C1368e("Some important stream information was not given.");
        }
        return new h(fVar.l(), strN, fVar.j(), iH, strG, strI);
    }

    private static void f(h hVar, f fVar) {
        try {
            hVar.g = fVar.P();
        } catch (Exception e) {
            hVar.b(e);
        }
        try {
            hVar.h = fVar.A();
        } catch (Exception e2) {
            hVar.b(e2);
        }
        try {
            hVar.j = fVar.U();
        } catch (Exception e3) {
            hVar.b(e3);
        }
        try {
            fVar.W();
        } catch (Exception e4) {
            hVar.b(e4);
        }
        try {
            fVar.T();
        } catch (Exception e5) {
            hVar.b(e5);
        }
        try {
            fVar.a0();
        } catch (Exception e6) {
            hVar.b(e6);
        }
        try {
            fVar.V();
        } catch (Exception e7) {
            hVar.b(e7);
        }
        try {
            fVar.J();
        } catch (Exception e8) {
            hVar.b(e8);
        }
        try {
            fVar.K();
        } catch (Exception e9) {
            hVar.b(e9);
        }
        try {
            fVar.I();
        } catch (Exception e10) {
            hVar.b(e10);
        }
        try {
            hVar.i = fVar.t();
        } catch (Exception e11) {
            hVar.b(e11);
        }
        try {
            fVar.Z();
        } catch (Exception e12) {
            hVar.b(e12);
        }
        try {
            fVar.O();
        } catch (Exception e13) {
            hVar.b(e13);
        }
        try {
            fVar.S();
        } catch (Exception e14) {
            hVar.b(e14);
        }
        try {
            fVar.Q();
        } catch (Exception e15) {
            hVar.b(e15);
        }
        try {
            fVar.C();
        } catch (Exception e16) {
            hVar.b(e16);
        }
        try {
            fVar.u();
        } catch (Exception e17) {
            hVar.b(e17);
        }
        try {
            fVar.L();
        } catch (Exception e18) {
            hVar.b(e18);
        }
        try {
            fVar.y();
        } catch (Exception e19) {
            hVar.b(e19);
        }
        try {
            fVar.E();
        } catch (Exception e20) {
            hVar.b(e20);
        }
        try {
            fVar.r();
        } catch (Exception e21) {
            hVar.b(e21);
        }
        try {
            fVar.B();
        } catch (Exception e22) {
            hVar.b(e22);
        }
        try {
            fVar.z();
        } catch (Exception e23) {
            hVar.b(e23);
        }
        try {
            fVar.N();
        } catch (Exception e24) {
            hVar.b(e24);
        }
        try {
            fVar.M();
        } catch (Exception e25) {
            hVar.b(e25);
        }
        try {
            fVar.G();
        } catch (Exception e26) {
            hVar.b(e26);
        }
        try {
            fVar.D();
        } catch (Exception e27) {
            hVar.b(e27);
        }
        try {
            fVar.w();
        } catch (Exception e28) {
            hVar.b(e28);
        }
        try {
            AbstractC1315g<? extends AbstractC1313e, ? extends InterfaceC1314f> abstractC1315gF = fVar.F();
            if (abstractC1315gF == null) {
                Collections.emptyList();
            } else {
                hVar.a(abstractC1315gF.e());
                abstractC1315gF.f();
            }
        } catch (Exception e29) {
            hVar.b(e29);
            Collections.emptyList();
        }
    }

    private static void g(h hVar, f fVar) throws C1367d, g {
        try {
            hVar.n = fVar.s();
        } catch (Exception e) {
            hVar.b(new C1368e("Couldn't get DASH manifest", e));
        }
        try {
            hVar.o = fVar.x();
        } catch (Exception e2) {
            hVar.b(new C1368e("Couldn't get HLS manifest", e2));
        }
        try {
            hVar.l = fVar.q();
        } catch (C1367d e3) {
            throw e3;
        } catch (Exception e4) {
            hVar.b(new C1368e("Couldn't get audio streams", e4));
        }
        try {
            hVar.k = fVar.Y();
        } catch (Exception e5) {
            hVar.b(new C1368e("Couldn't get video streams", e5));
        }
        try {
            hVar.m = fVar.X();
        } catch (Exception e6) {
            hVar.b(new C1368e("Couldn't get video only streams", e6));
        }
        if (hVar.k.isEmpty() && hVar.l.isEmpty()) {
            throw new g();
        }
    }

    public static h m(String str) throws C1368e {
        for (com.github.catvod.spider.merge.m1.o oVar : com.github.catvod.spider.merge.m1.l.a()) {
            oVar.getClass();
            String strD = com.github.catvod.spider.merge.L1.m.d(str);
            AbstractC0901a abstractC0901aF = oVar.f();
            com.github.catvod.spider.merge.q1.c cVarA = oVar.a();
            com.github.catvod.spider.merge.q1.c cVarC = oVar.c();
            if (((abstractC0901aF == null || !abstractC0901aF.l(strD)) ? (cVarA == null || !cVarA.l(strD)) ? (cVarC == null || !cVarC.l(strD)) ? (char) 1 : (char) 4 : (char) 3 : (char) 2) != 1) {
                f fVarE = oVar.e(oVar.f().b(str));
                fVarE.b();
                try {
                    h hVarE = e(fVarE);
                    g(hVarE, fVarE);
                    f(hVarE, fVarE);
                    return hVarE;
                } catch (C1368e e) {
                    String strV = fVarE.v();
                    if (com.github.catvod.spider.merge.L1.m.j(strV)) {
                        throw e;
                    }
                    throw new C1366c(strV, e);
                }
            }
        }
        throw new C1368e(t0.a("No service can handle the url = \"", str, "\""));
    }

    public final List<b> h() {
        return this.l;
    }

    public final String i() {
        return this.n;
    }

    public final c j() {
        return this.i;
    }

    public final long k() {
        return this.h;
    }

    public final String l() {
        return this.o;
    }

    public final int n() {
        return this.f;
    }

    public final List<C1311c> o() {
        return this.g;
    }

    public final String p() {
        return this.j;
    }

    public final List<q> q() {
        return this.m;
    }
}
