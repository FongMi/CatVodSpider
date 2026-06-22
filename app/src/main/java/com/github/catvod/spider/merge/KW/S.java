package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S extends AbstractC0824l {
    public static final boolean k;
    protected final com.github.catvod.spider.merge.yZ.x d;
    public final com.github.catvod.spider.merge.XI.b[] e;
    protected com.github.catvod.spider.merge.Bk.d<X, X, X> f;
    protected com.github.catvod.spider.merge.yZ.H g;
    protected int h;
    protected com.github.catvod.spider.merge.yZ.y i;
    protected com.github.catvod.spider.merge.XI.b j;

    static {
        String str;
        try {
            str = System.getenv(ZrJ.d("2D161903170A3F0514011A1A350C041D17003717191417072B02050E001A36131F"));
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public S(com.github.catvod.spider.merge.yZ.x xVar, C0813a c0813a, com.github.catvod.spider.merge.XI.b[] bVarArr, Y y) {
        super(c0813a, y);
        this.d = xVar;
        this.e = bVarArr;
    }

    protected static int o(C0818f c0818f) {
        int i = 0;
        for (C0814b c0814b : c0818f) {
            if (i == 0) {
                i = c0814b.b;
            } else if (c0814b.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.KW.AbstractC0824l
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(com.github.catvod.spider.merge.yZ.H h, int i, com.github.catvod.spider.merge.yZ.y yVar) {
        this.g = h;
        this.h = h.i();
        this.i = yVar;
        com.github.catvod.spider.merge.XI.b bVar = this.e[i];
        this.j = bVar;
        h.d();
        int i2 = this.h;
        try {
            com.github.catvod.spider.merge.XI.e eVarA = bVar.b() ? bVar.a(this.d.p()) : bVar.b;
            if (eVarA == null) {
                if (yVar == null) {
                    yVar = com.github.catvod.spider.merge.yZ.D.c;
                }
                C0818f c0818fI = i(bVar.d, com.github.catvod.spider.merge.yZ.D.c, false);
                if (bVar.b()) {
                    bVar.b.b = c0818fI;
                    eVarA = d(bVar, new com.github.catvod.spider.merge.XI.e(e(c0818fI)));
                    bVar.c(this.d.p(), eVarA);
                } else {
                    eVarA = d(bVar, new com.github.catvod.spider.merge.XI.e(c0818fI));
                    bVar.b = eVarA;
                }
            }
            return l(bVar, eVarA, h, i2, yVar);
        } finally {
            this.f = null;
            this.j = null;
            h.e(i2);
            h.a();
        }
    }

    protected final com.github.catvod.spider.merge.XI.e c(com.github.catvod.spider.merge.XI.b bVar, com.github.catvod.spider.merge.XI.e eVar, int i, com.github.catvod.spider.merge.XI.e eVar2) {
        if (eVar2 == null) {
            return null;
        }
        com.github.catvod.spider.merge.XI.e eVarD = d(bVar, eVar2);
        if (i < -1 || i > this.a.f) {
            return eVarD;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new com.github.catvod.spider.merge.XI.e[this.a.f + 1 + 1];
            }
            eVar.c[i + 1] = eVarD;
        }
        return eVarD;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
    protected final com.github.catvod.spider.merge.XI.e d(com.github.catvod.spider.merge.XI.b bVar, com.github.catvod.spider.merge.XI.e eVar) {
        if (eVar == AbstractC0824l.c) {
            return eVar;
        }
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.XI.e eVar2 = (com.github.catvod.spider.merge.XI.e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            C0818f c0818f = eVar.b;
            if (!c0818f.a) {
                c0818f.b(this);
                C0818f c0818f2 = eVar.b;
                c0818f2.a = true;
                c0818f2.b = null;
            }
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    protected final C0818f e(C0818f c0818f) {
        X x;
        l0 l0VarD;
        HashMap map = new HashMap();
        C0818f c0818f2 = new C0818f(c0818f.h);
        for (C0814b c0814b : c0818f) {
            if (c0814b.b == 1 && (l0VarD = c0814b.e.d(this.d, this.i)) != null) {
                map.put(Integer.valueOf(c0814b.a.b), c0814b.c);
                if (l0VarD != c0814b.e) {
                    c0818f2.a(new C0814b(c0814b, c0814b.a, c0814b.c, l0VarD), this.f);
                } else {
                    c0818f2.a(c0814b, this.f);
                }
            }
        }
        for (C0814b c0814b2 : c0818f) {
            if (c0814b2.b != 1 && (c0814b2.c() || (x = (X) map.get(Integer.valueOf(c0814b2.a.b))) == null || !x.equals(c0814b2.c))) {
                c0818f2.a(c0814b2, this.f);
            }
        }
        return c0818f2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    protected final void f(C0814b c0814b, C0818f c0818f, Set<C0814b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0814b.a instanceof e0) {
            if (!c0814b.c.f()) {
                for (int i2 = 0; i2 < c0814b.c.h(); i2++) {
                    if (c0814b.c.d(i2) != Integer.MAX_VALUE) {
                        C0814b c0814b2 = new C0814b((AbstractC0825m) this.a.a.get(c0814b.c.d(i2)), c0814b.b, c0814b.c.c(i2), c0814b.e);
                        c0814b2.d = c0814b.d;
                        f(c0814b2, c0818f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0818f.a(new C0814b(c0814b, c0814b.a, X.b, c0814b.e), this.f);
                    } else {
                        g(c0814b, c0818f, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0818f.a(c0814b, this.f);
                return;
            }
        }
        g(c0814b, c0818f, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[PHI: r5
      0x01da: PHI (r5v5 com.github.catvod.spider.merge.KW.b) = 
      (r5v3 com.github.catvod.spider.merge.KW.b)
      (r5v0 com.github.catvod.spider.merge.KW.b)
      (r5v0 com.github.catvod.spider.merge.KW.b)
      (r5v0 com.github.catvod.spider.merge.KW.b)
      (r5v0 com.github.catvod.spider.merge.KW.b)
      (r5v10 com.github.catvod.spider.merge.KW.b)
      (r5v13 com.github.catvod.spider.merge.KW.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(com.github.catvod.spider.merge.KW.C0814b r17, com.github.catvod.spider.merge.KW.C0818f r18, java.util.Set<com.github.catvod.spider.merge.KW.C0814b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.S.g(com.github.catvod.spider.merge.KW.b, com.github.catvod.spider.merge.KW.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.KW.C0818f h(com.github.catvod.spider.merge.KW.C0818f r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.S.h(com.github.catvod.spider.merge.KW.f, int, boolean):com.github.catvod.spider.merge.KW.f");
    }

    protected final C0818f i(AbstractC0825m abstractC0825m, com.github.catvod.spider.merge.yZ.D d, boolean z) {
        X xA = X.a(this.a, d);
        C0818f c0818f = new C0818f(z);
        int i = 0;
        while (i < abstractC0825m.b()) {
            int i2 = i + 1;
            f(new C0814b(abstractC0825m.d(i).a, i2, xA, l0.a), c0818f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0818f;
    }

    protected final BitSet j(com.github.catvod.spider.merge.XI.d[] dVarArr, com.github.catvod.spider.merge.yZ.y yVar) {
        BitSet bitSet = new BitSet();
        for (com.github.catvod.spider.merge.XI.d dVar : dVarArr) {
            l0 l0Var = dVar.a;
            if (l0Var == l0.a || k(l0Var, yVar)) {
                bitSet.set(dVar.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(l0 l0Var, com.github.catvod.spider.merge.yZ.y yVar) {
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
    
        ((com.github.catvod.spider.merge.yZ.z) r0.e()).c(r16.d, r17, r20, r11, r14, r13);
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
    protected final int l(com.github.catvod.spider.merge.XI.b r17, com.github.catvod.spider.merge.XI.e r18, com.github.catvod.spider.merge.yZ.H r19, int r20, com.github.catvod.spider.merge.yZ.y r21) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.S.l(com.github.catvod.spider.merge.XI.b, com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.yZ.H, int, com.github.catvod.spider.merge.yZ.y):int");
    }

    protected final int m(C0818f c0818f) {
        com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
        for (C0814b c0814b : c0818f) {
            if (c0814b.b() > 0 || ((c0814b.a instanceof e0) && c0814b.c.e())) {
                kVar.a(c0814b.b);
            }
        }
        if (kVar.j() == 0) {
            return 0;
        }
        return kVar.e();
    }

    protected final int n(C0818f c0818f, com.github.catvod.spider.merge.yZ.y yVar) {
        int iM;
        C0818f c0818f2 = new C0818f(c0818f.h);
        C0818f c0818f3 = new C0818f(c0818f.h);
        for (C0814b c0814b : c0818f) {
            l0 l0Var = c0814b.e;
            if (l0Var == l0.a || k(l0Var, yVar)) {
                c0818f2.a(c0814b, null);
            } else {
                c0818f3.a(c0814b, null);
            }
        }
        int iM2 = m(c0818f2);
        if (iM2 != 0) {
            return iM2;
        }
        if (c0818f3.size() <= 0 || (iM = m(c0818f3)) == 0) {
            return 0;
        }
        return iM;
    }

    protected final com.github.catvod.spider.merge.yZ.v p(com.github.catvod.spider.merge.yZ.H h, com.github.catvod.spider.merge.yZ.y yVar, C0818f c0818f, int i) {
        return new com.github.catvod.spider.merge.yZ.v(this.d, h, h.get(i), h.f(1), yVar);
    }

    protected final void q(com.github.catvod.spider.merge.XI.b bVar, int i, int i2, BitSet bitSet, C0818f c0818f) {
        com.github.catvod.spider.merge.yZ.x xVar = this.d;
        if (xVar != null) {
            ((com.github.catvod.spider.merge.yZ.z) xVar.e()).d(this.d, bVar, i, i2, bitSet, c0818f);
        }
    }
}
