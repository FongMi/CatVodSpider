package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.P.C;
import com.github.catvod.spider.merge.C0.P.G;
import com.github.catvod.spider.merge.C0.P.u;
import com.github.catvod.spider.merge.C0.P.w;
import com.github.catvod.spider.merge.C0.P.x;
import com.github.catvod.spider.merge.C0.P.y;
import com.github.catvod.spider.merge.C0.R.b;
import com.github.catvod.spider.merge.C0.R.d;
import com.github.catvod.spider.merge.C0.R.e;
import com.github.catvod.spider.merge.C0.S.c;
import com.github.catvod.spider.merge.C0.S.j;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class S extends l {
    public static final boolean k;
    protected final w d;
    public final b[] e;
    protected c<X, X, X> f;
    protected G g;
    protected int h;
    protected x i;
    protected b j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException e) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public S(w wVar, a aVar, b[] bVarArr, Y y) {
        super(aVar, y);
        this.d = wVar;
        this.e = bVarArr;
    }

    protected static int o(f fVar) {
        int i = 0;
        for (b bVar : fVar) {
            if (i == 0) {
                i = bVar.b;
            } else if (bVar.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.C0.Q.l
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(G g, int i, x xVar) {
        x xVar2;
        this.g = g;
        this.h = g.i();
        this.i = xVar;
        b bVar = this.e[i];
        this.j = bVar;
        g.g();
        int i2 = this.h;
        try {
            e eVarA = bVar.b() ? bVar.a(this.d.r()) : bVar.b;
            if (eVarA == null) {
                xVar2 = xVar == null ? C.c : xVar;
                f fVarI = i(bVar.d, C.c, false);
                if (bVar.b()) {
                    bVar.b.b = fVarI;
                    eVarA = d(bVar, new e(e(fVarI)));
                    bVar.c(this.d.r(), eVarA);
                } else {
                    eVarA = d(bVar, new e(fVarI));
                    bVar.b = eVarA;
                }
            } else {
                xVar2 = xVar;
            }
            return l(bVar, eVarA, g, i2, xVar2);
        } finally {
            this.f = null;
            this.j = null;
            g.d(i2);
            g.a();
        }
    }

    protected final e c(b bVar, e eVar, int i, e eVar2) {
        if (eVar2 == null) {
            return null;
        }
        e eVarD = d(bVar, eVar2);
        if (i < -1 || i > this.a.f) {
            return eVarD;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new e[this.a.f + 1 + 1];
            }
            eVar.c[i + 1] = eVarD;
        }
        return eVarD;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.R.e>] */
    protected final e d(b bVar, e eVar) {
        if (eVar == l.c) {
            return eVar;
        }
        synchronized (bVar.a) {
            e eVar2 = (e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            f fVar = eVar.b;
            if (!fVar.c) {
                fVar.b(this);
                f fVar2 = eVar.b;
                fVar2.c = true;
                fVar2.d = null;
            }
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    protected final f e(f fVar) {
        X x;
        l0 l0VarD;
        HashMap map = new HashMap();
        f fVar2 = new f(fVar.j);
        for (b bVar : fVar) {
            if (bVar.b == 1 && (l0VarD = bVar.e.d(this.d, this.i)) != null) {
                map.put(Integer.valueOf(bVar.a.b), bVar.c);
                if (l0VarD != bVar.e) {
                    fVar2.a(new b(bVar, bVar.a, bVar.c, l0VarD), this.f);
                } else {
                    fVar2.a(bVar, this.f);
                }
            }
        }
        for (b bVar2 : fVar) {
            if (bVar2.b != 1 && (bVar2.c() || (x = (X) map.get(Integer.valueOf(bVar2.a.b))) == null || !x.equals(bVar2.c))) {
                fVar2.a(bVar2, this.f);
            }
        }
        return fVar2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    protected final void f(b bVar, f fVar, Set<b> set, boolean z, boolean z2, int i, boolean z3) {
        if (bVar.a instanceof e0) {
            if (!bVar.c.f()) {
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= bVar.c.h()) {
                        return;
                    }
                    if (bVar.c.d(i3) != Integer.MAX_VALUE) {
                        b bVar2 = new b((m) this.a.a.get(bVar.c.d(i3)), bVar.b, bVar.c.c(i3), bVar.e);
                        bVar2.d = bVar.d;
                        f(bVar2, fVar, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        fVar.a(new b(bVar, bVar.a, X.b, bVar.e), this.f);
                    } else {
                        g(bVar, fVar, set, z, z2, i, z3);
                    }
                    i2 = i3 + 1;
                }
            } else if (z2) {
                fVar.a(bVar, this.f);
                return;
            }
        }
        g(bVar, fVar, set, z, z2, i, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(com.github.catvod.spider.merge.C0.Q.b r11, com.github.catvod.spider.merge.C0.Q.f r12, java.util.Set<com.github.catvod.spider.merge.C0.Q.b> r13, boolean r14, boolean r15, int r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.Q.S.g(com.github.catvod.spider.merge.C0.Q.b, com.github.catvod.spider.merge.C0.Q.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.C0.Q.f h(com.github.catvod.spider.merge.C0.Q.f r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.Q.S.h(com.github.catvod.spider.merge.C0.Q.f, int, boolean):com.github.catvod.spider.merge.C0.Q.f");
    }

    protected final f i(m mVar, C c, boolean z) {
        X xA = X.a(this.a, c);
        f fVar = new f(z);
        int i = 0;
        while (i < mVar.b()) {
            int i2 = i + 1;
            f(new b(mVar.d(i).a, i2, xA, l0.c), fVar, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return fVar;
    }

    protected final BitSet j(d[] dVarArr, x xVar) {
        BitSet bitSet = new BitSet();
        for (d dVar : dVarArr) {
            k0 k0Var = dVar.a;
            if (k0Var == l0.c || k(k0Var, xVar)) {
                bitSet.set(dVar.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(l0 l0Var, x xVar) {
        return l0Var.c(this.d, xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int l(com.github.catvod.spider.merge.C0.R.b r18, com.github.catvod.spider.merge.C0.R.e r19, com.github.catvod.spider.merge.C0.P.G r20, int r21, com.github.catvod.spider.merge.C0.P.x r22) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.Q.S.l(com.github.catvod.spider.merge.C0.R.b, com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.P.G, int, com.github.catvod.spider.merge.C0.P.x):int");
    }

    protected final int m(f fVar) {
        j jVar = new j(new int[0]);
        for (b bVar : fVar) {
            if (bVar.b() > 0 || ((bVar.a instanceof e0) && bVar.c.e())) {
                jVar.a(bVar.b);
            }
        }
        if (jVar.j() == 0) {
            return 0;
        }
        return jVar.e();
    }

    protected final int n(f fVar, x xVar) {
        int iM;
        f fVar2 = new f(fVar.j);
        f fVar3 = new f(fVar.j);
        for (b bVar : fVar) {
            k0 k0Var = bVar.e;
            if (k0Var == l0.c || k(k0Var, xVar)) {
                fVar2.a(bVar, null);
            } else {
                fVar3.a(bVar, null);
            }
        }
        int iM2 = m(fVar2);
        if (iM2 != 0) {
            return iM2;
        }
        if (fVar3.size() <= 0 || (iM = m(fVar3)) == 0) {
            return 0;
        }
        return iM;
    }

    protected final u p(G g, x xVar, f fVar, int i) {
        return new u(this.d, g, g.get(i), g.e(1), xVar);
    }

    protected final void q(b bVar, int i, int i2, BitSet bitSet, f fVar) {
        w wVar = this.d;
        if (wVar != null) {
            ((y) wVar.g()).c(this.d, bVar, i, i2, bitSet, fVar);
        }
    }
}
