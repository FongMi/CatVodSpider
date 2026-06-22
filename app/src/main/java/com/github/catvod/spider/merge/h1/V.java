package com.github.catvod.spider.merge.h1;

import com.github.catvod.spider.merge.f1.C1162n0;
import com.github.catvod.spider.merge.f1.Q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class V extends U {
    private List<C1257y> A;
    private List<S> B;
    private List<c0> C;
    private List<Z> D;
    private int E;
    private String[] F;
    private boolean[] G;
    private int H;
    private boolean I;
    private int v;
    private int w;
    private String x;
    private String y;
    private int z;

    public V() {
        this.v = -1;
        this.w = -1;
        this.z = -1;
        Collections.emptyList();
        this.D = new ArrayList(4);
        this.E = 0;
        this.H = 0;
        this.t = this;
        this.b = 140;
    }

    public V(int i) {
        super(i);
        this.v = -1;
        this.w = -1;
        this.z = -1;
        Collections.emptyList();
        this.D = new ArrayList(4);
        this.E = 0;
        this.H = 0;
        this.t = this;
        this.b = 140;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    final void A0(Z z) {
        if (this.F != null) {
            C1162n0.c();
            throw null;
        }
        if (z.b() == 90) {
            this.E++;
        }
        this.D.add(z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.c0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.c0>] */
    public final void B0(c0 c0Var) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(c0Var);
        c0Var.E(28, this.C.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    public final void C0(boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            if (this.r != null) {
                for (Z z2 : this.D) {
                    if (z2.a() == this) {
                        arrayList.add(z2);
                    }
                }
            }
            this.D = arrayList;
        }
        this.F = new String[this.D.size()];
        this.G = new boolean[this.D.size()];
        for (int i = 0; i < this.D.size(); i++) {
            Z z3 = (Z) this.D.get(i);
            this.F[i] = z3.d();
            this.G[i] = z3.b() == 158;
            z3.f(i);
        }
    }

    public final int D0() {
        return this.f;
    }

    public final String E0() {
        return this.y;
    }

    public final int F0() {
        return this.w;
    }

    public final int G0() {
        return this.v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.y>] */
    public final int H0() {
        ?? r0 = this.A;
        if (r0 == 0) {
            return 0;
        }
        return r0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.y>] */
    public final C1257y I0(int i) {
        return (C1257y) this.A.get(i);
    }

    public final int J0(Q1 q1) {
        Z zQ0 = null;
        if (this.F == null) {
            C1162n0.c();
            throw null;
        }
        U uT = q1.t();
        if (uT != null && (q1 instanceof K)) {
            zQ0 = uT.q0(((K) q1).d0());
        }
        if (zQ0 == null) {
            return -1;
        }
        return zQ0.c();
    }

    public final String K0() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("$");
        int i = this.H;
        this.H = i + 1;
        sbB.append(i);
        return sbB.toString();
    }

    public final boolean[] L0() {
        if (this.F != null) {
            return this.G;
        }
        C1162n0.c();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.Z>] */
    public final int M0() {
        if (this.F != null) {
            return this.D.size();
        }
        C1162n0.c();
        throw null;
    }

    public final String[] N0() {
        String[] strArr = this.F;
        if (strArr != null) {
            return strArr;
        }
        C1162n0.c();
        throw null;
    }

    public final int O0() {
        return this.E;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.S>] */
    public final int P0() {
        ?? r0 = this.B;
        if (r0 == 0) {
            return 0;
        }
        return r0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.S>] */
    public final String Q0(int i) {
        return ((S) this.B.get(i)).d0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.S>] */
    public final String R0(int i) {
        return ((S) this.B.get(i)).getValue();
    }

    public final String S0() {
        return this.x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.c0>] */
    public final int T0() {
        ?? r0 = this.C;
        if (r0 == 0) {
            return 0;
        }
        return r0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.c0>] */
    public final List<b0> U0(int i) {
        return ((c0) this.C.get(i)).e0();
    }

    public boolean V0() {
        return false;
    }

    public final boolean W0() {
        return this.I;
    }

    public final void X0(int i) {
        if (i < 0 || this.f >= 0) {
            C1162n0.c();
            throw null;
        }
        this.f = i;
    }

    public final void Y0(String str) {
        this.y = str;
    }

    public final void Z0(int i, int i2) {
        this.v = i;
        this.w = i2;
    }

    public final void a1(int i) {
        if (i < 0 || this.z >= 0) {
            C1162n0.c();
            throw null;
        }
        this.z = i;
    }

    public final void b1() {
        this.I = true;
    }

    public final void c1(String str) {
        this.x = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.y>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.y>] */
    public int y0(C1257y c1257y) {
        if (c1257y == null) {
            C1162n0.c();
            throw null;
        }
        if (this.A == null) {
            this.A = new ArrayList();
        }
        this.A.add(c1257y);
        return this.A.size() - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.S>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.h1.S>] */
    public final void z0(S s) {
        if (s == null) {
            C1162n0.c();
            throw null;
        }
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(s);
        s.E(4, this.B.size() - 1);
    }
}
