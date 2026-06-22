package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0249D;
import com.github.catvod.spider.merge.y.InterfaceC0253H;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class S extends AbstractC0293l {
    public static final boolean k;
    protected final com.github.catvod.spider.merge.y.x d;
    public final com.github.catvod.spider.merge.A.b[] e;
    protected com.github.catvod.spider.merge.B.d<X, X, X> f;
    protected InterfaceC0253H g;
    protected int h;
    protected com.github.catvod.spider.merge.y.y i;
    protected com.github.catvod.spider.merge.A.b j;

    static {
        String str;
        try {
            str = System.getenv(oZP.d("213A250F331A3329280D3E0A3920381133103B3B25183317272E3902240A3A3F23"));
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public S(com.github.catvod.spider.merge.y.x xVar, C0282a c0282a, com.github.catvod.spider.merge.A.b[] bVarArr, Y y) {
        super(c0282a, y);
        this.d = xVar;
        this.e = bVarArr;
    }

    protected static int o(C0287f c0287f) {
        int i = 0;
        for (C0283b c0283b : c0287f) {
            if (i == 0) {
                i = c0283b.b;
            } else if (c0283b.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.z.AbstractC0293l
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(InterfaceC0253H interfaceC0253H, int i, com.github.catvod.spider.merge.y.y yVar) {
        this.g = interfaceC0253H;
        this.h = interfaceC0253H.i();
        this.i = yVar;
        com.github.catvod.spider.merge.A.b bVar = this.e[i];
        this.j = bVar;
        interfaceC0253H.d();
        int i2 = this.h;
        try {
            com.github.catvod.spider.merge.A.e eVarA = bVar.b() ? bVar.a(this.d.p()) : bVar.b;
            if (eVarA == null) {
                if (yVar == null) {
                    yVar = C0249D.c;
                }
                C0287f c0287fI = i(bVar.d, C0249D.c, false);
                if (bVar.b()) {
                    bVar.b.b = c0287fI;
                    eVarA = d(bVar, new com.github.catvod.spider.merge.A.e(e(c0287fI)));
                    bVar.c(this.d.p(), eVarA);
                } else {
                    eVarA = d(bVar, new com.github.catvod.spider.merge.A.e(c0287fI));
                    bVar.b = eVarA;
                }
            }
            return l(bVar, eVarA, interfaceC0253H, i2, yVar);
        } finally {
            this.f = null;
            this.j = null;
            interfaceC0253H.e(i2);
            interfaceC0253H.a();
        }
    }

    protected final com.github.catvod.spider.merge.A.e c(com.github.catvod.spider.merge.A.b bVar, com.github.catvod.spider.merge.A.e eVar, int i, com.github.catvod.spider.merge.A.e eVar2) {
        if (eVar2 == null) {
            return null;
        }
        com.github.catvod.spider.merge.A.e eVarD = d(bVar, eVar2);
        if (i < -1 || i > this.a.f) {
            return eVarD;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new com.github.catvod.spider.merge.A.e[this.a.f + 1 + 1];
            }
            eVar.c[i + 1] = eVarD;
        }
        return eVarD;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    protected final com.github.catvod.spider.merge.A.e d(com.github.catvod.spider.merge.A.b bVar, com.github.catvod.spider.merge.A.e eVar) {
        if (eVar == AbstractC0293l.c) {
            return eVar;
        }
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.A.e eVar2 = (com.github.catvod.spider.merge.A.e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            C0287f c0287f = eVar.b;
            if (!c0287f.a) {
                c0287f.b(this);
                C0287f c0287f2 = eVar.b;
                c0287f2.a = true;
                c0287f2.b = null;
            }
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    protected final C0287f e(C0287f c0287f) {
        X x;
        l0 l0VarD;
        HashMap map = new HashMap();
        C0287f c0287f2 = new C0287f(c0287f.h);
        for (C0283b c0283b : c0287f) {
            if (c0283b.b == 1 && (l0VarD = c0283b.e.d(this.d, this.i)) != null) {
                map.put(Integer.valueOf(c0283b.a.b), c0283b.c);
                if (l0VarD != c0283b.e) {
                    c0287f2.a(new C0283b(c0283b, c0283b.a, c0283b.c, l0VarD), this.f);
                } else {
                    c0287f2.a(c0283b, this.f);
                }
            }
        }
        for (C0283b c0283b2 : c0287f) {
            if (c0283b2.b != 1 && (c0283b2.c() || (x = (X) map.get(Integer.valueOf(c0283b2.a.b))) == null || !x.equals(c0283b2.c))) {
                c0287f2.a(c0283b2, this.f);
            }
        }
        return c0287f2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    protected final void f(C0283b c0283b, C0287f c0287f, Set<C0283b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0283b.a instanceof e0) {
            if (!c0283b.c.f()) {
                for (int i2 = 0; i2 < c0283b.c.h(); i2++) {
                    if (c0283b.c.d(i2) != Integer.MAX_VALUE) {
                        C0283b c0283b2 = new C0283b((AbstractC0294m) this.a.a.get(c0283b.c.d(i2)), c0283b.b, c0283b.c.c(i2), c0283b.e);
                        c0283b2.d = c0283b.d;
                        f(c0283b2, c0287f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0287f.a(new C0283b(c0283b, c0283b.a, X.b, c0283b.e), this.f);
                    } else {
                        g(c0283b, c0287f, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0287f.a(c0283b, this.f);
                return;
            }
        }
        g(c0283b, c0287f, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[PHI: r5
      0x01da: PHI (r5v5 com.github.catvod.spider.merge.z.b) = 
      (r5v3 com.github.catvod.spider.merge.z.b)
      (r5v0 com.github.catvod.spider.merge.z.b)
      (r5v0 com.github.catvod.spider.merge.z.b)
      (r5v0 com.github.catvod.spider.merge.z.b)
      (r5v0 com.github.catvod.spider.merge.z.b)
      (r5v10 com.github.catvod.spider.merge.z.b)
      (r5v13 com.github.catvod.spider.merge.z.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(com.github.catvod.spider.merge.z.C0283b r17, com.github.catvod.spider.merge.z.C0287f r18, java.util.Set<com.github.catvod.spider.merge.z.C0283b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.S.g(com.github.catvod.spider.merge.z.b, com.github.catvod.spider.merge.z.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.z.C0287f h(com.github.catvod.spider.merge.z.C0287f r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.S.h(com.github.catvod.spider.merge.z.f, int, boolean):com.github.catvod.spider.merge.z.f");
    }

    protected final C0287f i(AbstractC0294m abstractC0294m, C0249D c0249d, boolean z) {
        X xA = X.a(this.a, c0249d);
        C0287f c0287f = new C0287f(z);
        int i = 0;
        while (i < abstractC0294m.b()) {
            int i2 = i + 1;
            f(new C0283b(abstractC0294m.d(i).a, i2, xA, l0.a), c0287f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0287f;
    }

    protected final BitSet j(com.github.catvod.spider.merge.A.d[] dVarArr, com.github.catvod.spider.merge.y.y yVar) {
        BitSet bitSet = new BitSet();
        for (com.github.catvod.spider.merge.A.d dVar : dVarArr) {
            l0 l0Var = dVar.a;
            if (l0Var == l0.a || k(l0Var, yVar)) {
                bitSet.set(dVar.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(l0 l0Var, com.github.catvod.spider.merge.y.y yVar) {
        return l0Var.c(this.d, yVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x024c, code lost:
    
        r3 = r13.d;
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
    
        ((com.github.catvod.spider.merge.y.z) r0.e()).c(r16.d, r17, r20, r11, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026a, code lost:
    
        r4 = new java.util.BitSet();
        r0 = r13.c.iterator();
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
    protected final int l(com.github.catvod.spider.merge.A.b r17, com.github.catvod.spider.merge.A.e r18, com.github.catvod.spider.merge.y.InterfaceC0253H r19, int r20, com.github.catvod.spider.merge.y.y r21) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.S.l(com.github.catvod.spider.merge.A.b, com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.y.H, int, com.github.catvod.spider.merge.y.y):int");
    }

    protected final int m(C0287f c0287f) {
        com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
        for (C0283b c0283b : c0287f) {
            if (c0283b.b() > 0 || ((c0283b.a instanceof e0) && c0283b.c.e())) {
                kVar.a(c0283b.b);
            }
        }
        if (kVar.j() == 0) {
            return 0;
        }
        return kVar.e();
    }

    protected final int n(C0287f c0287f, com.github.catvod.spider.merge.y.y yVar) {
        int iM;
        C0287f c0287f2 = new C0287f(c0287f.h);
        C0287f c0287f3 = new C0287f(c0287f.h);
        for (C0283b c0283b : c0287f) {
            l0 l0Var = c0283b.e;
            if (l0Var == l0.a || k(l0Var, yVar)) {
                c0287f2.a(c0283b, null);
            } else {
                c0287f3.a(c0283b, null);
            }
        }
        int iM2 = m(c0287f2);
        if (iM2 != 0) {
            return iM2;
        }
        if (c0287f3.size() <= 0 || (iM = m(c0287f3)) == 0) {
            return 0;
        }
        return iM;
    }

    protected final com.github.catvod.spider.merge.y.v p(InterfaceC0253H interfaceC0253H, com.github.catvod.spider.merge.y.y yVar, C0287f c0287f, int i) {
        return new com.github.catvod.spider.merge.y.v(this.d, interfaceC0253H, interfaceC0253H.get(i), interfaceC0253H.f(1), yVar);
    }

    protected final void q(com.github.catvod.spider.merge.A.b bVar, int i, int i2, BitSet bitSet, C0287f c0287f) {
        com.github.catvod.spider.merge.y.x xVar = this.d;
        if (xVar != null) {
            ((com.github.catvod.spider.merge.y.z) xVar.e()).d(this.d, bVar, i, i2, bitSet, c0287f);
        }
    }
}
