package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.m;
import com.github.catvod.spider.merge.Mm.c;
import com.github.catvod.spider.merge.Mm.j;
import com.github.catvod.spider.merge.gu.C;
import com.github.catvod.spider.merge.gu.G;
import com.github.catvod.spider.merge.gu.u;
import com.github.catvod.spider.merge.gu.w;
import com.github.catvod.spider.merge.gu.x;
import com.github.catvod.spider.merge.gu.y;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S extends l {
    public static final boolean k;
    protected final w d;
    public final com.github.catvod.spider.merge.Dw.k[] e;
    protected c<X, X, X> f;
    protected G g;
    protected int h;
    protected x i;
    protected com.github.catvod.spider.merge.Dw.k j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public S(w wVar, a aVar, com.github.catvod.spider.merge.Dw.k[] kVarArr, Y y) {
        super(aVar, y);
        this.d = wVar;
        this.e = kVarArr;
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

    @Override // com.github.catvod.spider.merge.Nx.l
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(G g, int i, x xVar) {
        this.g = g;
        this.h = g.i();
        this.i = xVar;
        com.github.catvod.spider.merge.Dw.k kVar = this.e[i];
        this.j = kVar;
        g.g();
        int i2 = this.h;
        try {
            m mVarA = kVar.b() ? kVar.a(this.d.r()) : kVar.b;
            if (mVarA == null) {
                if (xVar == null) {
                    xVar = C.c;
                }
                f fVarI = i(kVar.d, C.c, false);
                if (kVar.b()) {
                    kVar.b.b = fVarI;
                    mVarA = d(kVar, new m(e(fVarI)));
                    kVar.c(this.d.r(), mVarA);
                } else {
                    mVarA = d(kVar, new m(fVarI));
                    kVar.b = mVarA;
                }
            }
            return l(kVar, mVarA, g, i2, xVar);
        } finally {
            this.f = null;
            this.j = null;
            g.d(i2);
            g.a();
        }
    }

    protected final m c(com.github.catvod.spider.merge.Dw.k kVar, m mVar, int i, m mVar2) {
        if (mVar2 == null) {
            return null;
        }
        m mVarD = d(kVar, mVar2);
        if (i < -1 || i > this.a.f) {
            return mVarD;
        }
        synchronized (mVar) {
            if (mVar.c == null) {
                mVar.c = new m[this.a.f + 1 + 1];
            }
            mVar.c[i + 1] = mVarD;
        }
        return mVarD;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m>] */
    protected final m d(com.github.catvod.spider.merge.Dw.k kVar, m mVar) {
        if (mVar == l.c) {
            return mVar;
        }
        synchronized (kVar.a) {
            m mVar2 = (m) kVar.a.get(mVar);
            if (mVar2 != null) {
                return mVar2;
            }
            mVar.a = kVar.a.size();
            f fVar = mVar.b;
            if (!fVar.c) {
                fVar.b(this);
                f fVar2 = mVar.b;
                fVar2.c = true;
                fVar2.d = null;
            }
            kVar.a.put(mVar, mVar);
            return mVar;
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

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    protected final void f(b bVar, f fVar, Set<b> set, boolean z, boolean z2, int i, boolean z3) {
        if (bVar.a instanceof e0) {
            if (!bVar.c.f()) {
                for (int i2 = 0; i2 < bVar.c.h(); i2++) {
                    if (bVar.c.d(i2) != Integer.MAX_VALUE) {
                        b bVar2 = new b((m) this.a.a.get(bVar.c.d(i2)), bVar.b, bVar.c.c(i2), bVar.e);
                        bVar2.d = bVar.d;
                        f(bVar2, fVar, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        fVar.a(new b(bVar, bVar.a, X.b, bVar.e), this.f);
                    } else {
                        g(bVar, fVar, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                fVar.a(bVar, this.f);
                return;
            }
        }
        g(bVar, fVar, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[PHI: r5
      0x01da: PHI (r5v5 com.github.catvod.spider.merge.Nx.b) = 
      (r5v3 com.github.catvod.spider.merge.Nx.b)
      (r5v0 com.github.catvod.spider.merge.Nx.b)
      (r5v0 com.github.catvod.spider.merge.Nx.b)
      (r5v0 com.github.catvod.spider.merge.Nx.b)
      (r5v0 com.github.catvod.spider.merge.Nx.b)
      (r5v10 com.github.catvod.spider.merge.Nx.b)
      (r5v13 com.github.catvod.spider.merge.Nx.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(com.github.catvod.spider.merge.Nx.b r17, com.github.catvod.spider.merge.Nx.f r18, java.util.Set<com.github.catvod.spider.merge.Nx.b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Nx.S.g(com.github.catvod.spider.merge.Nx.b, com.github.catvod.spider.merge.Nx.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.Nx.f h(com.github.catvod.spider.merge.Nx.f r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Nx.S.h(com.github.catvod.spider.merge.Nx.f, int, boolean):com.github.catvod.spider.merge.Nx.f");
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

    protected final BitSet j(com.github.catvod.spider.merge.Dw.l[] lVarArr, x xVar) {
        BitSet bitSet = new BitSet();
        for (com.github.catvod.spider.merge.Dw.l lVar : lVarArr) {
            k0 k0Var = lVar.a;
            if (k0Var == l0.c || k(k0Var, xVar)) {
                bitSet.set(lVar.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(l0 l0Var, x xVar) {
        return l0Var.c(this.d, xVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x024c, code lost:
    
        r3 = r13.f;
        r11 = r19.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0252, code lost:
    
        if (r3 == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0254, code lost:
    
        r0 = r16.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0256, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0258, code lost:
    
        ((com.github.catvod.spider.merge.gu.y) r0.g()).d(r16.d, r17, r20, r11, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026a, code lost:
    
        r4 = new java.util.BitSet();
        r0 = r13.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0279, code lost:
    
        if (r0.hasNext() == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027b, code lost:
    
        r4.set(r0.next().b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0287, code lost:
    
        q(r17, r20, r11, r4, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0293, code lost:
    
        return r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int l(com.github.catvod.spider.merge.Dw.k r17, com.github.catvod.spider.merge.Dw.m r18, com.github.catvod.spider.merge.gu.G r19, int r20, com.github.catvod.spider.merge.gu.x r21) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Nx.S.l(com.github.catvod.spider.merge.Dw.k, com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.gu.G, int, com.github.catvod.spider.merge.gu.x):int");
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

    protected final void q(com.github.catvod.spider.merge.Dw.k kVar, int i, int i2, BitSet bitSet, f fVar) {
        w wVar = this.d;
        if (wVar != null) {
            ((y) wVar.g()).c(this.d, kVar, i, i2, bitSet, fVar);
        }
    }
}
