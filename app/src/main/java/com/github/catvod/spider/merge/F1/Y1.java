package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.h1.AbstractC1239f;
import com.github.catvod.spider.merge.h1.C1231A;
import com.github.catvod.spider.merge.h1.C1236c;
import com.github.catvod.spider.merge.h1.C1237d;
import com.github.catvod.spider.merge.h1.C1240g;
import com.github.catvod.spider.merge.h1.C1241h;
import com.github.catvod.spider.merge.h1.C1242i;
import com.github.catvod.spider.merge.h1.C1245l;
import com.github.catvod.spider.merge.h1.C1250q;
import com.github.catvod.spider.merge.h1.C1251s;
import com.github.catvod.spider.merge.h1.C1252t;
import com.github.catvod.spider.merge.h1.C1253u;
import com.github.catvod.spider.merge.h1.C1257y;
import com.github.catvod.spider.merge.h1.C1258z;
import com.github.catvod.spider.merge.h1.InterfaceC1232B;
import com.github.catvod.spider.merge.h1.InterfaceC1248o;
import com.github.catvod.spider.merge.l.C1290c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Y1 {
    C1173r a;
    private InterfaceC1094J b;
    private InterfaceC1232B c;
    private String d;
    boolean e;
    private boolean f;
    private A2 g;
    private int i;
    private int j;
    private List<C1245l> k;
    protected int l;
    private com.github.catvod.spider.merge.h1.H m;
    private boolean n;
    protected boolean o;
    com.github.catvod.spider.merge.h1.V p;
    com.github.catvod.spider.merge.h1.U q;
    private int r;
    private boolean s;
    private Map<String, com.github.catvod.spider.merge.h1.H> t;
    private List<com.github.catvod.spider.merge.h1.J> u;
    private List<com.github.catvod.spider.merge.h1.E> v;
    private int w;
    private int y;
    private boolean z;
    private int h = 0;
    private String x = "";

    public Y1(C1173r c1173r, InterfaceC1094J interfaceC1094J) {
        this.a = c1173r;
        this.b = interfaceC1094J;
        if (interfaceC1094J instanceof InterfaceC1232B) {
            this.c = (InterfaceC1232B) interfaceC1094J;
        }
    }

    private AbstractC1239f A0(int i, int i2) {
        com.github.catvod.spider.merge.h1.K kI;
        int i3 = i != -1 ? i : this.g.z;
        int i4 = this.g.s;
        com.github.catvod.spider.merge.h1.K kI2 = I(true, this.i);
        if (h0(148)) {
            int i5 = this.g.z;
            int iN0 = n0();
            if (iN0 == 23) {
                A2 a2 = this.g;
                I0(a2.z, "*", a2.s);
                kI = I(false, -1);
            } else {
                if (iN0 != 39) {
                    if (iN0 == 86) {
                        return U0(i, kI2);
                    }
                    E0("msg.no.name.after.coloncolon", null);
                    throw null;
                }
                kI = H();
            }
        } else {
            kI = kI2;
            kI2 = null;
        }
        if (kI2 == null && i2 == 0 && i == -1) {
            return kI;
        }
        com.github.catvod.spider.merge.h1.r0 r0Var = new com.github.catvod.spider.merge.h1.r0(i3, (kI.S() + kI.U()) - i3);
        r0Var.f0(i);
        r0Var.g0(kI2);
        r0Var.i0(kI);
        r0Var.f = i4;
        return r0Var;
    }

    private void B(com.github.catvod.spider.merge.h1.g0 g0Var) {
        AbstractC1239f abstractC1239fD0 = g0Var.d0();
        while (abstractC1239fD0 instanceof com.github.catvod.spider.merge.h1.P) {
            abstractC1239fD0 = ((com.github.catvod.spider.merge.h1.P) abstractC1239fD0).d0();
        }
        int i = abstractC1239fD0.b;
        if (i == 39 || i == 33 || i == 36 || i == 68 || i == 38) {
            return;
        }
        E0(g0Var.b == 110 ? "msg.bad.incr" : "msg.bad.decr", null);
        throw null;
    }

    private RuntimeException C() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("ts.cursor=");
        sbB.append(this.g.y);
        sbB.append(", ts.tokenBeg=");
        sbB.append(this.g.z);
        sbB.append(", currentToken=");
        sbB.append(this.i);
        C1162n0.d(sbB.toString());
        throw null;
    }

    private void C0(com.github.catvod.spider.merge.h1.G g, com.github.catvod.spider.merge.h1.H h) {
        if (v0() != 107) {
            C();
            throw null;
        }
        this.h = 0;
        String name = g.getName();
        Map<String, com.github.catvod.spider.merge.h1.H> map = this.t;
        if (map == null) {
            this.t = new HashMap();
        } else if (map.get(name) != null) {
            this.a.getClass();
            F0("msg.dup.label", null, g.U(), g.S());
            throw null;
        }
        h.d0(g);
        this.t.put(name, h);
    }

    private V1 D() {
        V1 v1 = new V1();
        m0(90, "msg.no.paren.cond");
        int i = this.g.z;
        v1.a = U(false);
        m0(91, "msg.no.paren.after.cond");
        int i2 = this.g.z;
        AbstractC1239f abstractC1239f = v1.a;
        if (abstractC1239f instanceof C1237d) {
            p("msg.equal.as.assign", "", abstractC1239f.U(), v1.a.S());
        }
        return v1;
    }

    private AbstractC1239f D0() {
        AbstractC1239f abstractC1239fL0 = L0();
        while (true) {
            int iV0 = v0();
            int i = this.g.z;
            if (iV0 != 52) {
                if (iV0 != 53) {
                    switch (iV0) {
                    }
                } else {
                    continue;
                }
                this.h = 0;
                abstractC1239fL0 = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fL0, L0());
            } else if (!this.s) {
                this.h = 0;
                abstractC1239fL0 = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fL0, L0());
            }
        }
        return abstractC1239fL0;
    }

    private void G0(com.github.catvod.spider.merge.h1.J j) {
        if (j.T() != null) {
            j.c0(j.T().U());
        }
    }

    private com.github.catvod.spider.merge.h1.K H() {
        return I(false, 39);
    }

    private AbstractC1239f H0(int i, boolean z) {
        boolean z2;
        int iU;
        AbstractC1239f abstractC1239fU;
        AbstractC1239f u0Var;
        if (!b0()) {
            E0(i == 4 ? "msg.bad.return" : "msg.bad.yield", null);
            throw null;
        }
        boolean z3 = false;
        this.h = 0;
        A2 a2 = this.g;
        int i2 = a2.s;
        int i3 = a2.z;
        int i4 = a2.A;
        if (i == 73 && this.a.b() >= 200 && v0() == 23) {
            this.h = 0;
            z2 = true;
        } else {
            z2 = false;
        }
        int iW0 = w0();
        if (iW0 == -1 || iW0 == 0 || iW0 == 1 || (iW0 == 73 ? this.a.b() < 200 : iW0 == 85 || iW0 == 87 || iW0 == 89 || iW0 == 91)) {
            iU = i4;
            abstractC1239fU = null;
        } else {
            abstractC1239fU = U(false);
            iU = abstractC1239fU.U() + abstractC1239fU.S();
        }
        int i5 = this.r;
        if (i == 4) {
            this.r = i5 | (abstractC1239fU == null ? 2 : 4);
            int i6 = iU - i3;
            u0Var = new com.github.catvod.spider.merge.h1.T(i3, i6, abstractC1239fU);
            if ((i5 & 6) != 6 && (this.r & 6) == 6) {
                p("msg.return.inconsistent", "", i3, i6);
            }
        } else {
            if (!b0()) {
                E0("msg.bad.yield", null);
                throw null;
            }
            this.r |= 8;
            u0Var = new com.github.catvod.spider.merge.h1.u0(i3, iU - i3, abstractC1239fU, z2);
            K0();
            if (b0()) {
                ((C1257y) this.p).t1();
            }
            if (!z) {
                u0Var = new C1253u(u0Var);
            }
        }
        if (b0()) {
            int i7 = this.r;
            if ((i5 & 12) != 12 && (i7 & 12) == 12) {
                z3 = true;
            }
            if (z3 && !((C1257y) this.p).l1()) {
                com.github.catvod.spider.merge.h1.K kG1 = ((C1257y) this.p).g1();
                if (kG1 == null || kG1.e0() == 0) {
                    l("msg.anon.generator.returns", "");
                } else {
                    l("msg.generator.returns", kG1.d0());
                }
            }
        }
        u0Var.f = i2;
        return u0Var;
    }

    private com.github.catvod.spider.merge.h1.K I(boolean z, int i) {
        A2 a2 = this.g;
        int i2 = a2.z;
        String strP = a2.p();
        int i3 = this.g.s;
        if (!"".equals(this.x)) {
            i2 = this.w;
            strP = this.x;
            i3 = this.y;
            this.w = 0;
            this.x = "";
            this.y = 0;
        }
        if (strP == null) {
            this.a.getClass();
            C();
            throw null;
        }
        com.github.catvod.spider.merge.h1.K k = new com.github.catvod.spider.merge.h1.K(i2, strP);
        k.f = i3;
        if (z) {
            A(strP, i);
        }
        return k;
    }

    private void I0(int i, String str, int i2) {
        this.w = i;
        this.x = str;
        this.y = i2;
    }

    private AbstractC1239f J(int i, boolean z) {
        StringBuilder sb;
        String str;
        String strP = this.g.p();
        if (this.o && this.g.A()) {
            this.a.getClass();
            if (!z) {
                if (i == 83) {
                    E0("msg.no.old.octal.bigint", null);
                    throw null;
                }
                E0("msg.no.old.octal.strict", null);
                throw null;
            }
        }
        this.a.getClass();
        if (!z) {
            if (this.g.x()) {
                sb = new StringBuilder();
                str = "0b";
            } else if (this.g.A()) {
                sb = new StringBuilder();
                str = "0";
            } else if (this.g.z()) {
                sb = new StringBuilder();
                str = "0o";
            } else if (this.g.y()) {
                sb = new StringBuilder();
                str = "0x";
            }
            strP = C1290c.b(sb, str, strP);
        }
        if (i == 83) {
            return new C1241h(this.g.z, C1290c.a(strP, "n"), this.g.d());
        }
        A2 a2 = this.g;
        return new com.github.catvod.spider.merge.h1.M(a2.z, strP, a2.l());
    }

    private com.github.catvod.spider.merge.h1.W L() {
        A2 a2 = this.g;
        int i = a2.z;
        com.github.catvod.spider.merge.h1.W w = new com.github.catvod.spider.merge.h1.W(i, a2.A - i);
        A2 a22 = this.g;
        w.f = a22.s;
        w.d0(a22.p());
        this.g.n();
        return w;
    }

    private AbstractC1239f L0() {
        AbstractC1239f abstractC1239fN = n();
        while (true) {
            int iV0 = v0();
            int i = this.g.z;
            switch (iV0) {
                case 18:
                case 19:
                case 20:
                    this.h = 0;
                    abstractC1239fN = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fN, n());
                    break;
                default:
                    return abstractC1239fN;
            }
        }
    }

    private com.github.catvod.spider.merge.h1.b0 M(int i) {
        A2 a2 = this.g;
        com.github.catvod.spider.merge.h1.b0 b0Var = new com.github.catvod.spider.merge.h1.b0(i, (a2.A - i) - 1);
        b0Var.f0(a2.p());
        b0Var.e0(this.g.o());
        return b0Var;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    private AbstractC1239f N0() {
        int iW0;
        int i = this.g.z;
        try {
            AbstractC1239f abstractC1239fO0 = O0();
            if (abstractC1239fO0 != null) {
                if (this.a.h() && !abstractC1239fO0.V()) {
                    int iMax = Math.max(abstractC1239fO0.U(), -1);
                    p(abstractC1239fO0 instanceof C1251s ? "msg.extra.trailing.semi" : "msg.no.side.effects", "", iMax, (abstractC1239fO0.S() + abstractC1239fO0.U()) - iMax);
                }
                if (v0() == 165) {
                    int iQ = abstractC1239fO0.q();
                    ?? r6 = this.k;
                    if (iQ == ((C1245l) r6.get(r6.size() - 1)).q()) {
                        ?? r5 = this.k;
                        abstractC1239fO0.Y((AbstractC1239f) r5.get(r5.size() - 1));
                        this.h = 0;
                    }
                }
                return abstractC1239fO0;
            }
        } catch (W1 unused) {
        }
        do {
            iW0 = w0();
            this.h = 0;
            if (iW0 == -1 || iW0 == 0 || iW0 == 1) {
                break;
            }
        } while (iW0 != 85);
        return new C1251s(i, this.g.z - i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x041d, code lost:
    
        if (v0() == 85) goto L411;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x087b  */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.h1.AbstractC1239f O0() {
        /*
            Method dump skipped, instruction units count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.O0():com.github.catvod.spider.merge.h1.f");
    }

    private AbstractC1239f P() {
        try {
            this.n = true;
            return z0();
        } finally {
            this.n = false;
        }
    }

    private AbstractC1239f P0(AbstractC1239f abstractC1239f) {
        if (this.i != 88) {
            this.a.getClass();
            C();
            throw null;
        }
        int i = this.g.z;
        if (abstractC1239f == null) {
            abstractC1239f = new C1242i(i);
        }
        abstractC1239f.f = this.g.s;
        while (true) {
            int iV0 = v0();
            if (iV0 <= 0 || iV0 == 89) {
                break;
            }
            abstractC1239f.O(N0());
        }
        abstractC1239f.Z(this.g.z - i);
        return abstractC1239f;
    }

    private void Q(com.github.catvod.spider.merge.h1.J j) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(j);
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(j);
        B0(j);
        com.github.catvod.spider.merge.h1.H h = this.m;
        if (h != null) {
            h.h0(j);
            this.m.e0().l0(j);
            j.c0(-this.m.U());
        }
    }

    private AbstractC1239f Q0(boolean z) {
        int i;
        int I;
        if (this.i != 170) {
            C();
            throw null;
        }
        int i2 = this.g.z;
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.h1.c0 c0Var = new com.github.catvod.spider.merge.h1.c0(i2);
        A2 a2 = this.g;
        int i3 = a2.z;
        while (true) {
            i = i3 + 1;
            I = a2.I(z);
            if (I != 172) {
                break;
            }
            arrayList.add(M(i));
            arrayList.add(U(false));
            m0(89, "msg.syntax");
            a2 = this.g;
            i3 = a2.z;
        }
        if (I == -1) {
            return e0();
        }
        arrayList.add(M(i));
        int i4 = this.g.A;
        c0Var.f0(arrayList);
        c0Var.Z(i4 - i2);
        return c0Var;
    }

    private AbstractC1239f R() {
        AbstractC1239f abstractC1239fD0 = D0();
        while (true) {
            int iV0 = v0();
            int i = this.g.z;
            if (iV0 != 12 && iV0 != 13 && iV0 != 46 && iV0 != 47) {
                return abstractC1239fD0;
            }
            this.h = 0;
            this.a.getClass();
            abstractC1239fD0 = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fD0, D0());
        }
    }

    private AbstractC1239f R0() {
        int iV0 = v0();
        if (iV0 == 165) {
            this.h = 0;
            iV0 = x0(iV0);
        }
        int i = this.g.s;
        if (iV0 == -1) {
            this.h = 0;
            return e0();
        }
        if (iV0 != 14) {
            if (iV0 != 130) {
                if (iV0 == 21) {
                    this.h = 0;
                    int i2 = this.g.z;
                    com.github.catvod.spider.merge.h1.f0 f0Var = new com.github.catvod.spider.merge.h1.f0(28, R0());
                    f0Var.f = i;
                    return f0Var;
                }
                if (iV0 == 22) {
                    this.h = 0;
                    int i3 = this.g.z;
                    com.github.catvod.spider.merge.h1.f0 f0Var2 = new com.github.catvod.spider.merge.h1.f0(29, R0());
                    f0Var2.f = i;
                    return f0Var2;
                }
                if (iV0 != 26 && iV0 != 27) {
                    if (iV0 == 31) {
                        this.h = 0;
                        int i4 = this.g.z;
                        com.github.catvod.spider.merge.h1.f0 f0Var3 = new com.github.catvod.spider.merge.h1.f0(iV0, R0());
                        f0Var3.f = i;
                        return f0Var3;
                    }
                    if (iV0 != 32) {
                        if (iV0 == 110 || iV0 == 111) {
                            this.h = 0;
                            com.github.catvod.spider.merge.h1.g0 g0Var = new com.github.catvod.spider.merge.h1.g0(iV0, this.g.z, i0(true), false);
                            g0Var.f = i;
                            B(g0Var);
                            return g0Var;
                        }
                    }
                }
            }
            this.h = 0;
            int i5 = this.g.z;
            com.github.catvod.spider.merge.h1.f0 f0Var4 = new com.github.catvod.spider.merge.h1.f0(iV0, R0());
            f0Var4.f = i;
            return f0Var4;
        }
        if (this.a.i()) {
            this.h = 0;
            if (this.i != 14) {
                C();
                throw null;
            }
            A2 a2 = this.g;
            int i6 = a2.z;
            int iH = a2.h();
            if (iH != 149 && iH != 152) {
                E0("msg.syntax", null);
                throw null;
            }
            com.github.catvod.spider.merge.h1.p0 p0Var = new com.github.catvod.spider.merge.h1.p0(i6);
            p0Var.f = this.g.s;
            while (iH == 149) {
                A2 a22 = this.g;
                p0Var.d0(new com.github.catvod.spider.merge.h1.t0(a22.z, a22.p()));
                m0(88, "msg.syntax");
                int i7 = this.g.z;
                AbstractC1239f rVar = v0() == 89 ? new com.github.catvod.spider.merge.h1.r(i7, this.g.A - i7) : U(false);
                m0(89, "msg.syntax");
                com.github.catvod.spider.merge.h1.n0 n0Var = new com.github.catvod.spider.merge.h1.n0(i7, rVar);
                n0Var.f0(this.g.B());
                n0Var.Z(this.g.A - i7);
                p0Var.d0(n0Var);
                iH = this.g.k();
            }
            if (iH != 152) {
                E0("msg.syntax", null);
                throw null;
            }
            A2 a23 = this.g;
            p0Var.d0(new com.github.catvod.spider.merge.h1.t0(a23.z, a23.p()));
            return j0(true, p0Var);
        }
        AbstractC1239f abstractC1239fI0 = i0(true);
        int iW0 = w0();
        if (iW0 != 110 && iW0 != 111) {
            return abstractC1239fI0;
        }
        this.h = 0;
        com.github.catvod.spider.merge.h1.g0 g0Var2 = new com.github.catvod.spider.merge.h1.g0(iW0, this.g.z, abstractC1239fI0, true);
        g0Var2.f = i;
        B(g0Var2);
        return g0Var2;
    }

    private void S() {
        this.u.remove(r0.size() - 1);
        this.v.remove(r0.size() - 1);
        y0();
    }

    private com.github.catvod.spider.merge.h1.h0 S0(int i, int i2) {
        AbstractC1239f abstractC1239fP;
        int iA0;
        com.github.catvod.spider.merge.h1.K k;
        AbstractC1239f abstractC1239f;
        com.github.catvod.spider.merge.h1.h0 h0Var = new com.github.catvod.spider.merge.h1.h0(i2);
        h0Var.N(i);
        h0Var.f = this.g.s;
        do {
            int iV0 = v0();
            A2 a2 = this.g;
            int i3 = a2.z;
            int i4 = a2.A;
            if (iV0 == 86 || iV0 == 88) {
                abstractC1239fP = P();
                int iA02 = a0(abstractC1239fP);
                if (!(abstractC1239fP instanceof InterfaceC1248o)) {
                    F0("msg.bad.assign.left", null, i3, iA02 - i3);
                    throw null;
                }
                f0(abstractC1239fP);
                iA0 = iA02;
                k = null;
            } else {
                m0(39, "msg.bad.var");
                com.github.catvod.spider.merge.h1.K kH = H();
                A2 a22 = this.g;
                kH.f = a22.s;
                if (this.o) {
                    String strP = a22.p();
                    if ("eval".equals(strP) || "arguments".equals(this.g.p())) {
                        E0("msg.bad.id.strict", strP);
                        throw null;
                    }
                }
                N(i, this.g.p(), this.s);
                iA0 = i4;
                k = kH;
                abstractC1239fP = null;
            }
            int i5 = this.g.s;
            if (h0(93)) {
                AbstractC1239f abstractC1239fV = v();
                abstractC1239f = abstractC1239fV;
                iA0 = a0(abstractC1239fV);
            } else {
                abstractC1239f = null;
            }
            com.github.catvod.spider.merge.h1.i0 i0Var = new com.github.catvod.spider.merge.h1.i0(i3, iA0 - i3);
            if (abstractC1239fP == null) {
                i0Var.g0(k);
            } else {
                if (abstractC1239f == null && !this.s) {
                    E0("msg.destruct.assign.no.init", null);
                    throw null;
                }
                i0Var.g0(abstractC1239fP);
            }
            i0Var.f0(abstractC1239f);
            i0Var.b = i;
            i0Var.K();
            i0Var.f = i5;
            h0Var.d0(i0Var);
        } while (h0(92));
        h0Var.Z(iA0 - i2);
        return h0Var;
    }

    private AbstractC1239f T() {
        AbstractC1239f abstractC1239fR0 = R0();
        while (true) {
            int iV0 = v0();
            int i = this.g.z;
            if (iV0 != 75) {
                return abstractC1239fR0;
            }
            if (abstractC1239fR0 instanceof com.github.catvod.spider.merge.h1.f0) {
                E0("msg.no.unary.expr.on.left.exp", AbstractC1239f.W(abstractC1239fR0.b));
                throw null;
            }
            this.h = 0;
            abstractC1239fR0 = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fR0, T());
        }
    }

    private void T0(int i, int i2) {
        if (this.a.h()) {
            int[] iArr = new int[2];
            String strJ = this.g.j(i2, iArr);
            this.a.getClass();
            int i3 = i2 - i;
            if (strJ == null) {
                p("msg.missing.semi", "", i, i3);
                return;
            }
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (this.a.h()) {
                String strD0 = d0("msg.missing.semi", "");
                if (!this.a.j()) {
                    InterfaceC1232B interfaceC1232B = this.c;
                    if (interfaceC1232B != null) {
                        interfaceC1232B.b();
                        return;
                    } else {
                        this.b.a(strD0, this.d, i4, strJ, i5);
                        return;
                    }
                }
                this.j++;
                String strD02 = d0("msg.missing.semi", "");
                InterfaceC1232B interfaceC1232B2 = this.c;
                if (interfaceC1232B2 != null) {
                    interfaceC1232B2.d();
                } else {
                    this.b.e(strD02, this.d, i4, strJ, i5);
                }
            }
        }
    }

    private AbstractC1239f U(boolean z) {
        AbstractC1239f abstractC1239fV = v();
        int iU = abstractC1239fV.U();
        while (h0(92)) {
            int i = this.g.z;
            if (this.a.h() && !abstractC1239fV.V()) {
                p("msg.no.side.effects", "", iU, (abstractC1239fV.S() + abstractC1239fV.U()) - iU);
            }
            if (v0() == 73) {
                E0("msg.yield.parenthesized", null);
                throw null;
            }
            if (z && v0() == 91) {
                abstractC1239fV.E(29, 1);
                return abstractC1239fV;
            }
            abstractC1239fV = new com.github.catvod.spider.merge.h1.D(92, abstractC1239fV, v());
        }
        return abstractC1239fV;
    }

    private com.github.catvod.spider.merge.h1.m0 U0(int i, com.github.catvod.spider.merge.h1.K k) {
        int i2 = this.g.z;
        if (i != -1) {
            i2 = i;
        }
        AbstractC1239f abstractC1239fU = U(false);
        m0(87, "msg.no.bracket.index");
        A2 a2 = this.g;
        int i3 = a2.z;
        com.github.catvod.spider.merge.h1.m0 m0Var = new com.github.catvod.spider.merge.h1.m0(i2, a2.A - i2);
        m0Var.g0(k);
        m0Var.f0(i);
        m0Var.i0(abstractC1239fU);
        return m0Var;
    }

    private AbstractC1239f V(int i) {
        AbstractC1239f abstractC1239fS0;
        try {
            this.s = true;
            if (i == 85) {
                A2 a2 = this.g;
                abstractC1239fS0 = new com.github.catvod.spider.merge.h1.r(a2.z, 1);
                abstractC1239fS0.f = a2.s;
            } else if (i == 126 || i == 157) {
                this.h = 0;
                abstractC1239fS0 = S0(i, this.g.z);
            } else {
                abstractC1239fS0 = U(false);
            }
            return abstractC1239fS0;
        } finally {
            this.s = false;
        }
    }

    private C1257y W(int i, boolean z) {
        AbstractC1239f abstractC1239fI0;
        com.github.catvod.spider.merge.h1.K k;
        A2 a2 = this.g;
        int i2 = a2.s;
        int i3 = a2.z;
        if (h0(39)) {
            com.github.catvod.spider.merge.h1.K kI = I(true, 39);
            if (this.o) {
                String strD0 = kI.d0();
                if ("eval".equals(strD0) || "arguments".equals(strD0)) {
                    E0("msg.bad.id.strict", strD0);
                    throw null;
                }
            }
            if (h0(90)) {
                k = kI;
                abstractC1239fI0 = null;
            } else {
                if (this.a.d()) {
                    abstractC1239fI0 = j0(false, kI);
                    k = null;
                } else {
                    k = kI;
                    abstractC1239fI0 = null;
                }
                m0(90, "msg.no.paren.parms");
            }
        } else if (h0(90)) {
            abstractC1239fI0 = null;
            k = null;
        } else {
            if (h0(23)) {
                this.a.getClass();
            }
            abstractC1239fI0 = this.a.d() ? i0(false) : null;
            m0(90, "msg.no.paren.parms");
            k = null;
        }
        int i4 = this.i == 90 ? this.g.z : -1;
        if ((abstractC1239fI0 != null ? 2 : i) != 2 && k != null && k.e0() > 0) {
            N(113, k.d0(), false);
        }
        C1257y c1257y = new C1257y(i3, k);
        c1257y.q1(i);
        if (z) {
            c1257y.s1();
        }
        if (i4 != -1) {
            c1257y.u1(i4 - i3);
        }
        c1257y.K();
        X1 x1 = new X1(this, c1257y);
        try {
            u0(c1257y);
            c1257y.p1(t0(i, c1257y));
            c1257y.Z0(i3, this.g.A);
            c1257y.Z(this.g.A - i3);
            if (this.a.h() && !c1257y.f1().x()) {
                o((k == null || k.e0() <= 0) ? "msg.anon.no.return.value" : "msg.no.return.value", k == null ? "" : k.d0());
            }
            if (abstractC1239fI0 != null) {
                C1162n0.c();
                throw null;
            }
            c1257y.c1(this.d);
            c1257y.X0(i2);
            c1257y.a1(this.g.s);
            this.a.getClass();
            return c1257y;
        } finally {
            x1.a();
        }
    }

    private AbstractC1239f X(AbstractC1239f abstractC1239f, int i, boolean z) {
        AbstractC1239f abstractC1239fH;
        ArrayList arrayList = new ArrayList();
        while (true) {
            V1 v1D = null;
            if (v0() != 123) {
                if (v0() == 116) {
                    this.h = 0;
                    int i2 = this.g.z;
                    v1D = D();
                }
                if (!z) {
                    m0(91, "msg.no.paren.let");
                }
                C1258z c1258z = new C1258z(i, this.g.A - i);
                c1258z.D0(abstractC1239f);
                c1258z.C0(arrayList);
                if (v1D != null) {
                    c1258z.B0(v1D.a);
                }
                return c1258z;
            }
            if (n0() != 123) {
                C();
                throw null;
            }
            int i3 = this.g.z;
            C1231A c1231a = new C1231A(i3);
            B0(c1231a);
            try {
                m0(90, "msg.no.paren.for");
                int i4 = this.g.z;
                int iV0 = v0();
                if (iV0 != 39) {
                    if (iV0 != 86 && iV0 != 88) {
                        E0("msg.bad.var", null);
                        throw null;
                    }
                    abstractC1239fH = P();
                    f0(abstractC1239fH);
                } else {
                    this.h = 0;
                    abstractC1239fH = H();
                }
                if (abstractC1239fH.b == 39) {
                    N(157, this.g.p(), true);
                }
                m0(52, "msg.in.after.for.name");
                int i5 = this.g.z;
                AbstractC1239f abstractC1239fU = U(false);
                m0(91, "msg.no.paren.for.ctrl");
                A2 a2 = this.g;
                int i6 = a2.z;
                c1231a.Z(a2.A - i3);
                c1231a.H0(abstractC1239fH);
                c1231a.G0(abstractC1239fU);
                y0();
                arrayList.add(c1231a);
            } catch (Throwable th) {
                y0();
                throw th;
            }
        }
    }

    private static String Y(AbstractC1239f abstractC1239f) {
        if (!(abstractC1239f instanceof C1253u)) {
            return null;
        }
        AbstractC1239f abstractC1239fD0 = ((C1253u) abstractC1239f).d0();
        if (abstractC1239fD0 instanceof com.github.catvod.spider.merge.h1.W) {
            return ((com.github.catvod.spider.merge.h1.W) abstractC1239fD0).getValue();
        }
        return null;
    }

    private AbstractC1239f Z(AbstractC1239f abstractC1239f) {
        AbstractC1239f abstractC1239fN0 = N0();
        if (165 != abstractC1239fN0.b) {
            return abstractC1239fN0;
        }
        AbstractC1239f abstractC1239fN02 = N0();
        abstractC1239f.Y(abstractC1239fN0);
        return abstractC1239fN02;
    }

    private static int a0(AbstractC1239f abstractC1239f) {
        return abstractC1239f.S() + abstractC1239f.U();
    }

    private AbstractC1239f c0(boolean z, int i) {
        com.github.catvod.spider.merge.h1.I i2 = new com.github.catvod.spider.merge.h1.I(i);
        i2.f = this.g.s;
        m0(90, "msg.no.paren.after.let");
        int i3 = this.g.z;
        B0(i2);
        try {
            i2.B0(S0(157, this.g.z));
            m0(91, "msg.no.paren.let");
            int i4 = this.g.z;
            if (z && v0() == 88) {
                this.h = 0;
                int i5 = this.g.z;
                AbstractC1239f abstractC1239fP0 = P0(null);
                m0(89, "msg.no.curly.let");
                abstractC1239fP0.Z(this.g.A - i5);
                i2.Z(this.g.A - i);
                i2.A0(abstractC1239fP0);
                i2.b = 157;
            } else {
                AbstractC1239f abstractC1239fU = U(false);
                i2.Z((abstractC1239fU.S() + abstractC1239fU.U()) - i);
                i2.A0(abstractC1239fU);
                if (z) {
                    C1253u c1253u = new C1253u(i2, b0() ? false : true);
                    c1253u.f = i2.q();
                    return c1253u;
                }
            }
            return i2;
        } finally {
            y0();
        }
    }

    private C1252t e0() {
        A2 a2 = this.g;
        int i = a2.z;
        C1252t c1252t = new C1252t(i, a2.A - i);
        c1252t.f = a2.s;
        return c1252t;
    }

    private com.github.catvod.spider.merge.h1.H g0() {
        if (w0() != 39) {
            return null;
        }
        this.h = 0;
        Map<String, com.github.catvod.spider.merge.h1.H> map = this.t;
        com.github.catvod.spider.merge.h1.H h = map != null ? map.get(this.g.p()) : null;
        if (h != null) {
            return h;
        }
        E0("msg.undef.label", null);
        throw null;
    }

    private boolean h0(int i) {
        int iV0;
        while (true) {
            iV0 = v0();
            if (iV0 != 165) {
                break;
            }
            this.h = 0;
        }
        if (iV0 != i) {
            return false;
        }
        this.h = 0;
        return true;
    }

    private AbstractC1239f i0(boolean z) {
        AbstractC1239f abstractC1239fZ0;
        int iV0 = v0();
        A2 a2 = this.g;
        int i = a2.s;
        if (iV0 != 30) {
            abstractC1239fZ0 = z0();
        } else {
            this.h = 0;
            int i2 = a2.z;
            com.github.catvod.spider.merge.h1.L l = new com.github.catvod.spider.merge.h1.L(i2);
            AbstractC1239f abstractC1239fI0 = i0(false);
            int iS = abstractC1239fI0.S() + abstractC1239fI0.U();
            l.g0(abstractC1239fI0);
            if (h0(90)) {
                int i3 = this.g.z;
                List<AbstractC1239f> listT = t();
                if (listT != null && ((ArrayList) listT).size() > 65536) {
                    E0("msg.too.many.constructor.args", null);
                    throw null;
                }
                A2 a22 = this.g;
                int i4 = a22.z;
                iS = a22.A;
                if (listT != null) {
                    l.f0(listT);
                }
            }
            if (h0(88)) {
                com.github.catvod.spider.merge.h1.N nO0 = o0();
                iS = nO0.S() + nO0.U();
                l.i0(nO0);
            }
            l.Z(iS - i2);
            abstractC1239fZ0 = l;
        }
        abstractC1239fZ0.f = i;
        return j0(z, abstractC1239fZ0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0188, code lost:
    
        E0("msg.no.name.after.dot", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x018b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        E0("msg.no.name.after.dot", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.catvod.spider.merge.f1.Q1, com.github.catvod.spider.merge.h1.f] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.catvod.spider.merge.f1.Q1] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.github.catvod.spider.merge.f1.Q1, com.github.catvod.spider.merge.h1.f, com.github.catvod.spider.merge.h1.x] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.github.catvod.spider.merge.f1.Q1] */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.github.catvod.spider.merge.h1.a0] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v28, types: [com.github.catvod.spider.merge.h1.D, com.github.catvod.spider.merge.h1.l0] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.github.catvod.spider.merge.h1.q] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.github.catvod.spider.merge.f1.Q1, com.github.catvod.spider.merge.h1.D, com.github.catvod.spider.merge.h1.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.h1.AbstractC1239f j0(boolean r17, com.github.catvod.spider.merge.h1.AbstractC1239f r18) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.j0(boolean, com.github.catvod.spider.merge.h1.f):com.github.catvod.spider.merge.h1.f");
    }

    private AbstractC1239f k0() {
        AbstractC1239f abstractC1239fT = T();
        while (true) {
            int iV0 = v0();
            int i = this.g.z;
            switch (iV0) {
                case 23:
                case 24:
                case 25:
                    this.h = 0;
                    abstractC1239fT = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fT, T());
                    break;
                default:
                    return abstractC1239fT;
            }
        }
    }

    private void l0() {
        if (this.a.i()) {
            return;
        }
        E0("msg.XML.not.available", null);
        throw null;
    }

    private void m0(int i, String str) {
        A2 a2 = this.g;
        int i2 = a2.z;
        int i3 = a2.A - i2;
        if (h0(i)) {
            return;
        }
        F0(str, null, i2, i3);
        throw null;
    }

    private AbstractC1239f n() {
        AbstractC1239f abstractC1239fK0 = k0();
        while (true) {
            int iV0 = v0();
            int i = this.g.z;
            if (iV0 != 21 && iV0 != 22) {
                return abstractC1239fK0;
            }
            this.h = 0;
            abstractC1239fK0 = new com.github.catvod.spider.merge.h1.D(iV0, abstractC1239fK0, k0());
        }
    }

    private int n0() {
        int iV0 = v0();
        this.h = 0;
        return iV0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        if (r7 != '\b') goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.h1.N o0() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.o0():com.github.catvod.spider.merge.h1.N");
    }

    private AbstractC1239f p0() {
        int iV0 = v0();
        if (iV0 != 83) {
            switch (iV0) {
                case 39:
                    break;
                case 40:
                    break;
                case 41:
                    return L();
                default:
                    if (!this.a.g() || !A2.v(this.g.p(), this.a.b(), this.o)) {
                        return null;
                    }
                    break;
            }
            return H();
        }
        return J(iV0, true);
    }

    private AbstractC1239f q0() {
        AbstractC1239f abstractC1239fS = s();
        if (!h0(108)) {
            return abstractC1239fS;
        }
        int i = this.g.z;
        return new com.github.catvod.spider.merge.h1.D(108, abstractC1239fS, q0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.f1.Q1, com.github.catvod.spider.merge.h1.U, com.github.catvod.spider.merge.h1.V, com.github.catvod.spider.merge.h1.f, com.github.catvod.spider.merge.h1.g] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.github.catvod.spider.merge.f1.Q1, com.github.catvod.spider.merge.h1.f] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.h1.C1240g r0() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.r0():com.github.catvod.spider.merge.h1.g");
    }

    private AbstractC1239f s() {
        AbstractC1239f abstractC1239fZ = z();
        while (h0(9)) {
            int i = this.g.z;
            abstractC1239fZ = new com.github.catvod.spider.merge.h1.D(9, abstractC1239fZ, z());
        }
        if (!h0(109)) {
            return abstractC1239fZ;
        }
        int i2 = this.g.z;
        return new com.github.catvod.spider.merge.h1.D(109, abstractC1239fZ, s());
    }

    private List<AbstractC1239f> t() {
        if (h0(91)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = this.s;
        this.s = false;
        do {
            try {
                if (v0() == 91) {
                    break;
                }
                if (v0() == 73) {
                    E0("msg.yield.parenthesized", null);
                    throw null;
                }
                AbstractC1239f abstractC1239fV = v();
                if (v0() == 123) {
                    try {
                        arrayList.add(X(abstractC1239fV, 0, true));
                    } catch (IOException unused) {
                    }
                } else {
                    arrayList.add(abstractC1239fV);
                }
            } catch (Throwable th) {
                this.s = z;
                throw th;
            }
        } while (h0(92));
        this.s = z;
        m0(91, "msg.no.paren.arg");
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.l>] */
    private AbstractC1239f t0(int i, C1257y c1257y) {
        boolean z;
        AbstractC1239f abstractC1239fW;
        if (h0(88)) {
            z = false;
        } else {
            this.a.getClass();
            if (i != 4) {
                E0("msg.no.brace.body", null);
                throw null;
            }
            z = true;
        }
        boolean z2 = i == 4;
        this.l++;
        int i2 = this.g.z;
        C1242i c1242i = new C1242i(i2);
        boolean z3 = this.o;
        this.o = false;
        c1242i.f = this.g.s;
        try {
            if (z) {
                AbstractC1239f abstractC1239fV = v();
                com.github.catvod.spider.merge.h1.T t = new com.github.catvod.spider.merge.h1.T(abstractC1239fV.U(), abstractC1239fV.S(), abstractC1239fV);
                Boolean bool = Boolean.TRUE;
                t.F(25, bool);
                c1242i.F(25, bool);
                if (z2) {
                    t.F(27, bool);
                }
                c1242i.O(t);
            } else {
                boolean z4 = true;
                while (true) {
                    int iV0 = v0();
                    if (iV0 == -1 || iV0 == 0 || iV0 == 89) {
                        break;
                    }
                    if (iV0 == 113) {
                        this.h = 0;
                        abstractC1239fW = W(1, false);
                    } else if (iV0 != 165) {
                        abstractC1239fW = N0();
                        if (z4) {
                            String strY = Y(abstractC1239fW);
                            if (strY == null) {
                                z4 = false;
                            } else if (strY.equals("use strict")) {
                                this.o = true;
                                c1257y.b1();
                                if (!z3) {
                                    K0();
                                }
                            }
                        }
                    } else {
                        this.h = 0;
                        ?? r7 = this.k;
                        abstractC1239fW = (AbstractC1239f) r7.get(r7.size() - 1);
                    }
                    c1242i.O(abstractC1239fW);
                }
            }
        } catch (W1 unused) {
        } catch (Throwable th) {
            this.l--;
            this.o = z3;
            throw th;
        }
        this.l--;
        this.o = z3;
        int i3 = this.g.A;
        if (!z) {
            m0(89, "msg.no.brace.after.body");
            i3 = this.g.A;
        }
        c1242i.Z(i3 - i2);
        return c1242i;
    }

    private void u(C1257y c1257y, AbstractC1239f abstractC1239f, Map<String, Q1> map, Set<String> set) {
        if ((abstractC1239f instanceof C1236c) || (abstractC1239f instanceof com.github.catvod.spider.merge.h1.N)) {
            f0(abstractC1239f);
            c1257y.d1(abstractC1239f);
            String strK0 = this.p.K0();
            N(90, strK0, false);
            map.put(strK0, abstractC1239f);
            return;
        }
        if ((abstractC1239f instanceof com.github.catvod.spider.merge.h1.D) && abstractC1239f.b == 92) {
            com.github.catvod.spider.merge.h1.D d = (com.github.catvod.spider.merge.h1.D) abstractC1239f;
            u(c1257y, d.d0(), map, set);
            u(c1257y, d.e0(), map, set);
            return;
        }
        if (!(abstractC1239f instanceof com.github.catvod.spider.merge.h1.K)) {
            F0("msg.no.parm", null, abstractC1239f.U(), abstractC1239f.S());
            throw null;
        }
        c1257y.d1(abstractC1239f);
        String strD0 = ((com.github.catvod.spider.merge.h1.K) abstractC1239f).d0();
        N(90, strD0, false);
        if (this.o) {
            if ("eval".equals(strD0) || "arguments".equals(strD0)) {
                E0("msg.bad.id.strict", strD0);
                throw null;
            }
            if (set.contains(strD0)) {
                l("msg.dup.param.strict", strD0);
            }
            set.add(strD0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        E0("msg.bad.id.strict", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u0(com.github.catvod.spider.merge.h1.C1257y r12) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.u0(com.github.catvod.spider.merge.h1.y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[Catch: all -> 0x0156, PHI: r0
      0x00dd: PHI (r0v4 com.github.catvod.spider.merge.h1.f) = (r0v27 com.github.catvod.spider.merge.h1.f), (r0v28 com.github.catvod.spider.merge.h1.f) binds: [B:35:0x00bf, B:40:0x00db] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0156, blocks: (B:34:0x00bd, B:36:0x00c1, B:38:0x00d0, B:39:0x00d3, B:42:0x00e0, B:44:0x00e6, B:45:0x00f5, B:47:0x00fb, B:48:0x011b, B:49:0x0120, B:41:0x00dd), top: B:61:0x00bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.h1.AbstractC1239f v() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.v():com.github.catvod.spider.merge.h1.f");
    }

    private int v0() {
        if (this.h != 0) {
            return this.i;
        }
        A2 a2 = this.g;
        int i = a2.s;
        int iS = a2.s();
        boolean z = false;
        while (true) {
            if (iS != 1 && iS != 165) {
                break;
            }
            if (iS == 1) {
                iS = this.g.s();
                z = true;
            } else {
                this.a.getClass();
                iS = this.g.s();
            }
        }
        this.i = iS;
        this.h = (z ? 65536 : 0) | iS;
        return iS;
    }

    private AbstractC1239f w() {
        int iN0 = n0();
        A2 a2 = this.g;
        int i = a2.z;
        if (iN0 == 23) {
            I0(i, "*", a2.s);
            return A0(i, 0);
        }
        if (iN0 == 39) {
            return A0(i, 0);
        }
        if (iN0 == 86) {
            return U0(i, null);
        }
        E0("msg.no.name.after.xmlAttr", null);
        throw null;
    }

    private int w0() {
        int iV0 = v0();
        if ((this.h & 65536) != 0) {
            return 1;
        }
        return iV0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void x(com.github.catvod.spider.merge.h1.AbstractC1239f r5) {
        /*
            r4 = this;
            r4.v0()
            int r0 = r4.h
            int r1 = r5.U()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            r3 = -1
            if (r2 == r3) goto L3c
            if (r2 == 0) goto L3c
            r3 = 85
            if (r2 == r3) goto L30
            r3 = 89
            if (r2 == r3) goto L3c
            r2 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r2
            if (r0 == 0) goto L29
            int r0 = r5.U()
            int r5 = r5.S()
            int r5 = r5 + r0
            goto L4b
        L29:
            java.lang.String r5 = "msg.no.semi.stmt"
            r0 = 0
            r4.E0(r5, r0)
            throw r0
        L30:
            r0 = 0
            r4.h = r0
            com.github.catvod.spider.merge.f1.A2 r0 = r4.g
            int r0 = r0.A
            int r0 = r0 - r1
            r5.Z(r0)
            goto L4e
        L3c:
            int r0 = r1 + 1
            int r2 = r5.U()
            int r5 = r5.S()
            int r5 = r5 + r2
            int r5 = java.lang.Math.max(r0, r5)
        L4b:
            r4.T0(r1, r5)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.x(com.github.catvod.spider.merge.h1.f):void");
    }

    private int x0(int i) {
        while (i == 165) {
            this.h = 0;
            i = v0();
        }
        return i;
    }

    private AbstractC1239f y() {
        AbstractC1239f abstractC1239fR = R();
        while (h0(11)) {
            int i = this.g.z;
            abstractC1239fR = new com.github.catvod.spider.merge.h1.D(11, abstractC1239fR, R());
        }
        return abstractC1239fR;
    }

    private AbstractC1239f z() {
        AbstractC1239f abstractC1239fY = y();
        while (h0(10)) {
            int i = this.g.z;
            abstractC1239fY = new com.github.catvod.spider.merge.h1.D(10, abstractC1239fY, y());
        }
        return abstractC1239fY;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.h1.AbstractC1239f z0() {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.z0():com.github.catvod.spider.merge.h1.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void A(java.lang.String r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.b0()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            java.lang.String r1 = "arguments"
            boolean r1 = r1.equals(r5)
            r2 = 1
            if (r1 == 0) goto L1e
            com.github.catvod.spider.merge.h1.V r1 = r4.p
            com.github.catvod.spider.merge.h1.y r1 = (com.github.catvod.spider.merge.h1.C1257y) r1
            int r1 = r1.h1()
            r3 = 4
            if (r1 == r3) goto L1e
        L1c:
            r0 = 1
            goto L3a
        L1e:
            com.github.catvod.spider.merge.f1.r r1 = r4.a
            r1.getClass()
            java.lang.String r1 = "length"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3a
            r5 = 33
            if (r6 != r5) goto L3a
            com.github.catvod.spider.merge.f1.r r5 = r4.a
            int r5 = r5.b()
            r6 = 120(0x78, float:1.68E-43)
            if (r5 != r6) goto L3a
            goto L1c
        L3a:
            if (r0 == 0) goto L3f
            r4.K0()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.Y1.A(java.lang.String, int):void");
    }

    final void B0(com.github.catvod.spider.merge.h1.U u) {
        com.github.catvod.spider.merge.h1.U uP0 = u.p0();
        if (uP0 == null) {
            this.q.m0(u);
        } else if (uP0 != this.q) {
            C();
            throw null;
        }
        this.q = u;
    }

    final Q1 E(int i, Q1 q1, Q1 q12) {
        String strK0 = this.p.K0();
        Q1 q1O = O(i, q1, q12, strK0);
        q1O.e.e(G(strK0));
        return q1O;
    }

    final void E0(String str, String str2) {
        A2 a2 = this.g;
        if (a2 == null) {
            F0(str, str2, 1, 1);
            throw null;
        }
        int i = a2.z;
        F0(str, str2, i, a2.A - i);
        throw null;
    }

    protected final Q1 F(int i, String str, Q1 q1) {
        Q1 q1G = G(str);
        q1G.b = i;
        if (q1 != null) {
            q1G.e(q1);
        }
        return q1G;
    }

    final void F0(String str, String str2, int i, int i2) {
        m(str, str2, i, i2);
        this.a.getClass();
        throw new W1();
    }

    protected final Q1 G(String str) {
        A(str, 39);
        return Q1.B(39, str);
    }

    public final void J0() {
        this.z = true;
    }

    protected final com.github.catvod.spider.merge.h1.U K(int i, int i2) {
        com.github.catvod.spider.merge.h1.U u = new com.github.catvod.spider.merge.h1.U();
        u.b = i;
        u.f = i2;
        return u;
    }

    protected final void K0() {
        if (b0()) {
            ((C1257y) this.p).w1();
        }
    }

    protected final Q1 M0(Q1 q1, Q1 q12) {
        Q1 q1E0;
        Q1 q1D0;
        int i;
        int i2 = q1.b;
        if (i2 == 33 || i2 == 36) {
            if (q1 instanceof com.github.catvod.spider.merge.h1.Q) {
                com.github.catvod.spider.merge.h1.Q q = (com.github.catvod.spider.merge.h1.Q) q1;
                q1E0 = q.j0();
                q1D0 = q.i0();
            } else if (q1 instanceof C1250q) {
                C1250q c1250q = (C1250q) q1;
                q1E0 = c1250q.e0();
                q1D0 = c1250q.d0();
            } else {
                q1E0 = q1.d;
                q1D0 = q1.e;
            }
            if (i2 == 33) {
                i = 35;
                q1D0.N(41);
            } else {
                i = 37;
            }
            return new Q1(i, q1E0, q1D0, q12);
        }
        if (i2 != 39) {
            if (i2 != 68) {
                C();
                throw null;
            }
            Q1 q13 = q1.d;
            if ((q13.p(16, 0) & 4) == 0) {
                return new Q1(69, q13, q12);
            }
            E0("msg.bad.assign.left", null);
            throw null;
        }
        String strD0 = ((com.github.catvod.spider.merge.h1.K) q1).d0();
        if (this.o && ("eval".equals(strD0) || "arguments".equals(strD0))) {
            E0("msg.bad.id.strict", strD0);
            throw null;
        }
        q1.N(49);
        return new Q1(8, q1, q12);
    }

    final void N(int i, String str, boolean z) {
        int i2;
        if (str == null) {
            this.a.getClass();
            C();
            throw null;
        }
        com.github.catvod.spider.merge.h1.U uO0 = this.q.o0(str);
        com.github.catvod.spider.merge.h1.Z zQ0 = uO0 != null ? uO0.q0(str) : null;
        int i3 = -1;
        int iB = zQ0 != null ? zQ0.b() : -1;
        String str2 = "msg.var.redecl";
        if (zQ0 != null && (iB == 158 || i == 158 || (uO0 == this.q && iB == 157))) {
            if (iB == 158) {
                str2 = "msg.const.redecl";
            } else if (iB == 157) {
                str2 = "msg.let.redecl";
            } else if (iB != 126) {
                str2 = iB == 113 ? "msg.fn.redecl" : "msg.parm.redecl";
            }
            l(str2, str);
            return;
        }
        if (i == 90) {
            if (zQ0 != null) {
                A2 a2 = this.g;
                if (a2 != null) {
                    i3 = a2.z;
                    i2 = a2.A - i3;
                } else {
                    i2 = -1;
                }
                r("msg.dup.parms", str, i3, i2);
            }
            this.p.t0(new com.github.catvod.spider.merge.h1.Z(i, str));
            return;
        }
        if (i != 113 && i != 126) {
            if (i == 157) {
                if (!z) {
                    com.github.catvod.spider.merge.h1.U u = this.q;
                    if (u.b == 116 || (u instanceof com.github.catvod.spider.merge.h1.J)) {
                        k("msg.let.decl.not.in.block");
                        return;
                    }
                }
                this.q.t0(new com.github.catvod.spider.merge.h1.Z(i, str));
                return;
            }
            if (i != 158) {
                C();
                throw null;
            }
        }
        if (zQ0 == null) {
            this.p.t0(new com.github.catvod.spider.merge.h1.Z(i, str));
        } else if (iB == 126) {
            o("msg.var.redecl", str);
        } else if (iB == 90) {
            o("msg.var.hides.arg", str);
        }
    }

    final Q1 O(int i, Q1 q1, Q1 q12, String str) {
        boolean z;
        boolean z2;
        Q1 q13;
        com.github.catvod.spider.merge.h1.U uK = K(162, q1.q());
        int i2 = 39;
        uK.g(new Q1(157, F(39, str, q12)));
        try {
            B0(uK);
            N(157, str, true);
            y0();
            Q1 q14 = new Q1(92);
            uK.e(q14);
            ArrayList arrayList = new ArrayList();
            int i3 = q1.b;
            int i4 = 33;
            if (i3 == 33 || i3 == 36) {
                if (i == 126 || i == 157 || i == 158) {
                    E0("msg.bad.assign.left", null);
                    throw null;
                }
                q14.e(M0(q1, G(str)));
                z = true;
            } else {
                if (i3 == 66) {
                    C1236c c1236c = (C1236c) q1;
                    int i5 = i == 158 ? 159 : 8;
                    int i6 = 0;
                    z2 = true;
                    for (Q1 q15 : c1236c.f0()) {
                        if (q15.b == 132) {
                            i6++;
                        } else {
                            Q1 q16 = new Q1(36, G(str), Q1.A(i6));
                            if (q15.b == i2) {
                                String strU = q15.u();
                                q14.e(new Q1(i5, F(49, strU, null), q16));
                                if (i != -1) {
                                    N(i, strU, true);
                                    arrayList.add(strU);
                                }
                            } else {
                                q14.e(O(i, q15, q16, this.p.K0()));
                            }
                            i6++;
                            i2 = 39;
                            z2 = false;
                        }
                    }
                } else {
                    if (i3 != 67) {
                        E0("msg.bad.assign.left", null);
                        throw null;
                    }
                    com.github.catvod.spider.merge.h1.N n = (com.github.catvod.spider.merge.h1.N) q1;
                    int i7 = i == 158 ? 159 : 8;
                    z2 = true;
                    for (com.github.catvod.spider.merge.h1.O o : n.d0()) {
                        A2 a2 = this.g;
                        int i8 = a2 != null ? a2.s : 0;
                        AbstractC1239f abstractC1239fD0 = o.d0();
                        if (abstractC1239fD0 instanceof com.github.catvod.spider.merge.h1.K) {
                            q13 = new Q1(i4, G(str), Q1.C(((com.github.catvod.spider.merge.h1.K) abstractC1239fD0).d0()));
                        } else if (abstractC1239fD0 instanceof com.github.catvod.spider.merge.h1.W) {
                            q13 = new Q1(i4, G(str), Q1.C(((com.github.catvod.spider.merge.h1.W) abstractC1239fD0).getValue()));
                        } else {
                            if (!(abstractC1239fD0 instanceof com.github.catvod.spider.merge.h1.M)) {
                                C();
                                throw null;
                            }
                            q13 = new Q1(36, G(str), Q1.A((int) ((com.github.catvod.spider.merge.h1.M) abstractC1239fD0).d0()));
                        }
                        q13.f = i8;
                        Q1 q1E0 = o.e0();
                        if (q1E0.b == 39) {
                            String strD0 = ((com.github.catvod.spider.merge.h1.K) q1E0).d0();
                            q14.e(new Q1(i7, F(49, strD0, null), q13));
                            if (i != -1) {
                                N(i, strD0, true);
                                arrayList.add(strD0);
                            }
                        } else {
                            q14.e(O(i, q1E0, q13, this.p.K0()));
                        }
                        z2 = false;
                        i4 = 33;
                    }
                }
                z = z2;
            }
            if (z) {
                q14.e(Q1.A(0.0d));
            }
            uK.F(22, arrayList);
            return uK;
        } catch (Throwable th) {
            y0();
            throw th;
        }
    }

    final boolean b0() {
        return this.l != 0;
    }

    final String d0(String str, String str2) {
        return str2 == null ? C1157l2.P(str, new Object[0]) : C1157l2.P(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void f0(AbstractC1239f abstractC1239f) {
        if (abstractC1239f instanceof InterfaceC1248o) {
            ((InterfaceC1248o) abstractC1239f).b();
        } else if (abstractC1239f instanceof com.github.catvod.spider.merge.h1.P) {
            f0(((com.github.catvod.spider.merge.h1.P) abstractC1239f).d0());
        }
    }

    final void k(String str) {
        A2 a2 = this.g;
        if (a2 == null) {
            m(str, null, 0, 0);
        } else {
            int i = a2.z;
            m(str, null, i, a2.A - i);
        }
    }

    final void l(String str, String str2) {
        A2 a2 = this.g;
        if (a2 == null) {
            m(str, str2, 0, 0);
        } else {
            int i = a2.z;
            m(str, str2, i, a2.A - i);
        }
    }

    final void m(String str, String str2, int i, int i2) {
        String strI;
        int i3;
        int iM;
        this.j++;
        String strD0 = d0(str, str2);
        InterfaceC1232B interfaceC1232B = this.c;
        if (interfaceC1232B != null) {
            interfaceC1232B.d();
            return;
        }
        A2 a2 = this.g;
        if (a2 != null) {
            int i4 = a2.s;
            strI = a2.i();
            iM = this.g.m();
            i3 = i4;
        } else {
            strI = "";
            i3 = 1;
            iM = 1;
        }
        this.b.e(strD0, this.d, i3, strI, iM);
    }

    final void o(String str, String str2) {
        int i;
        A2 a2 = this.g;
        int i2 = -1;
        if (a2 != null) {
            i2 = a2.z;
            i = a2.A - i2;
        } else {
            i = -1;
        }
        p(str, str2, i2, i);
    }

    final void p(String str, String str2, int i, int i2) {
        if (this.a.h()) {
            r(str, str2, i, i2);
        }
    }

    final void q(String str) {
        int i;
        A2 a2 = this.g;
        int i2 = -1;
        if (a2 != null) {
            i2 = a2.z;
            i = a2.A - i2;
        } else {
            i = -1;
        }
        r("msg.bad.octal.literal", str, i2, i);
    }

    final void r(String str, String str2, int i, int i2) {
        String strI;
        int i3;
        int iM;
        String strD0 = d0(str, str2);
        if (this.a.j()) {
            m(str, str2, i, i2);
            return;
        }
        InterfaceC1232B interfaceC1232B = this.c;
        if (interfaceC1232B != null) {
            interfaceC1232B.b();
            return;
        }
        A2 a2 = this.g;
        InterfaceC1094J interfaceC1094J = this.b;
        String str3 = this.d;
        if (a2 != null) {
            int i4 = a2.s;
            strI = a2.i();
            i3 = i4;
            iM = this.g.m();
        } else {
            strI = "";
            i3 = 1;
            iM = 1;
        }
        interfaceC1094J.a(strD0, str3, i3, strI, iM);
    }

    public final C1240g s0(String str, String str2, int i) {
        if (this.f) {
            throw new IllegalStateException("parser reused");
        }
        this.d = str2;
        this.a.getClass();
        this.g = new A2(this, str, i);
        try {
            try {
                return r0();
            } catch (IOException unused) {
                throw new IllegalStateException();
            }
        } finally {
            this.f = true;
        }
    }

    final void y0() {
        this.q = this.q.p0();
    }
}
