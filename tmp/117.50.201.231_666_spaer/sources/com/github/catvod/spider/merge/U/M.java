package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.t.InterfaceC0621C;
import com.github.catvod.spider.merge.v.d;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class M extends AbstractC0639h {
    public static final boolean k;
    protected final com.github.catvod.spider.merge.t.t d;
    public final com.github.catvod.spider.merge.v.b[] e;
    protected com.github.catvod.spider.merge.w.c<S, S, S> f;
    protected InterfaceC0621C g;
    protected int h;
    protected com.github.catvod.spider.merge.t.u i;
    protected com.github.catvod.spider.merge.v.b j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public M(com.github.catvod.spider.merge.t.t tVar, C0632a c0632a, com.github.catvod.spider.merge.v.b[] bVarArr, T t) {
        super(c0632a, t);
        this.d = tVar;
        this.e = bVarArr;
    }

    protected static int o(C0634c c0634c) {
        int i = 0;
        for (C0633b c0633b : c0634c) {
            if (i == 0) {
                i = c0633b.b;
            } else if (c0633b.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.u.AbstractC0639h
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(InterfaceC0621C interfaceC0621C, int i, com.github.catvod.spider.merge.t.u uVar) {
        this.g = interfaceC0621C;
        this.h = interfaceC0621C.h();
        this.i = uVar;
        com.github.catvod.spider.merge.v.b bVar = this.e[i];
        this.j = bVar;
        interfaceC0621C.c();
        int i2 = this.h;
        try {
            com.github.catvod.spider.merge.v.d dVarA = bVar.b() ? bVar.a(this.d.o()) : bVar.b;
            if (dVarA == null) {
                if (uVar == null) {
                    uVar = com.github.catvod.spider.merge.t.y.c;
                }
                C0634c c0634cI = i(bVar.d, com.github.catvod.spider.merge.t.y.c, false);
                if (bVar.b()) {
                    bVar.b.b = c0634cI;
                    dVarA = d(bVar, new com.github.catvod.spider.merge.v.d(e(c0634cI)));
                    bVar.c(this.d.o(), dVarA);
                } else {
                    dVarA = d(bVar, new com.github.catvod.spider.merge.v.d(c0634cI));
                    bVar.b = dVarA;
                }
            }
            return l(bVar, dVarA, interfaceC0621C, i2, uVar);
        } finally {
            this.f = null;
            this.j = null;
            interfaceC0621C.e(i2);
            interfaceC0621C.release();
        }
    }

    protected final com.github.catvod.spider.merge.v.d c(com.github.catvod.spider.merge.v.b bVar, com.github.catvod.spider.merge.v.d dVar, int i, com.github.catvod.spider.merge.v.d dVar2) {
        if (dVar2 == null) {
            return null;
        }
        com.github.catvod.spider.merge.v.d dVarD = d(bVar, dVar2);
        if (i < -1 || i > this.a.f) {
            return dVarD;
        }
        synchronized (dVar) {
            if (dVar.c == null) {
                dVar.c = new com.github.catvod.spider.merge.v.d[this.a.f + 1 + 1];
            }
            dVar.c[i + 1] = dVarD;
        }
        return dVarD;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    protected final com.github.catvod.spider.merge.v.d d(com.github.catvod.spider.merge.v.b bVar, com.github.catvod.spider.merge.v.d dVar) {
        if (dVar == AbstractC0639h.c) {
            return dVar;
        }
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.v.d dVar2 = (com.github.catvod.spider.merge.v.d) bVar.a.get(dVar);
            if (dVar2 != null) {
                return dVar2;
            }
            dVar.a = bVar.a.size();
            C0634c c0634c = dVar.b;
            if (!c0634c.a) {
                c0634c.b(this);
                C0634c c0634c2 = dVar.b;
                c0634c2.a = true;
                c0634c2.b = null;
            }
            bVar.a.put(dVar, dVar);
            return dVar;
        }
    }

    protected final C0634c e(C0634c c0634c) {
        S s;
        b0 b0VarD;
        HashMap map = new HashMap();
        C0634c c0634c2 = new C0634c(c0634c.h);
        for (C0633b c0633b : c0634c) {
            if (c0633b.b == 1 && (b0VarD = c0633b.e.d(this.d, this.i)) != null) {
                map.put(Integer.valueOf(c0633b.a.b), c0633b.c);
                if (b0VarD != c0633b.e) {
                    c0634c2.a(new C0633b(c0633b, c0633b.a, c0633b.c, b0VarD), this.f);
                } else {
                    c0634c2.a(c0633b, this.f);
                }
            }
        }
        for (C0633b c0633b2 : c0634c) {
            if (c0633b2.b != 1 && (c0633b2.c() || (s = (S) map.get(Integer.valueOf(c0633b2.a.b))) == null || !s.equals(c0633b2.c))) {
                c0634c2.a(c0633b2, this.f);
            }
        }
        return c0634c2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    protected final void f(C0633b c0633b, C0634c c0634c, Set<C0633b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0633b.a instanceof Z) {
            if (!c0633b.c.f()) {
                for (int i2 = 0; i2 < c0633b.c.h(); i2++) {
                    if (c0633b.c.d(i2) != Integer.MAX_VALUE) {
                        C0633b c0633b2 = new C0633b((AbstractC0640i) this.a.a.get(c0633b.c.d(i2)), c0633b.b, c0633b.c.c(i2), c0633b.e);
                        c0633b2.d = c0633b.d;
                        f(c0633b2, c0634c, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0634c.a(new C0633b(c0633b, c0633b.a, S.b, c0633b.e), this.f);
                    } else {
                        g(c0633b, c0634c, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0634c.a(c0633b, this.f);
                return;
            }
        }
        g(c0633b, c0634c, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[PHI: r5
      0x01da: PHI (r5v5 com.github.catvod.spider.merge.u.b) = 
      (r5v3 com.github.catvod.spider.merge.u.b)
      (r5v0 com.github.catvod.spider.merge.u.b)
      (r5v0 com.github.catvod.spider.merge.u.b)
      (r5v0 com.github.catvod.spider.merge.u.b)
      (r5v0 com.github.catvod.spider.merge.u.b)
      (r5v10 com.github.catvod.spider.merge.u.b)
      (r5v13 com.github.catvod.spider.merge.u.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(com.github.catvod.spider.merge.u.C0633b r17, com.github.catvod.spider.merge.u.C0634c r18, java.util.Set<com.github.catvod.spider.merge.u.C0633b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.M.g(com.github.catvod.spider.merge.u.b, com.github.catvod.spider.merge.u.c, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.u.C0634c h(com.github.catvod.spider.merge.u.C0634c r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.M.h(com.github.catvod.spider.merge.u.c, int, boolean):com.github.catvod.spider.merge.u.c");
    }

    protected final C0634c i(AbstractC0640i abstractC0640i, com.github.catvod.spider.merge.t.y yVar, boolean z) {
        S sA = S.a(this.a, yVar);
        C0634c c0634c = new C0634c(z);
        int i = 0;
        while (i < abstractC0640i.b()) {
            int i2 = i + 1;
            f(new C0633b(abstractC0640i.d(i).a, i2, sA, b0.a), c0634c, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0634c;
    }

    protected final BitSet j(d.a[] aVarArr, com.github.catvod.spider.merge.t.u uVar) {
        BitSet bitSet = new BitSet();
        for (d.a aVar : aVarArr) {
            b0 b0Var = aVar.a;
            if (b0Var == b0.a || k(b0Var, uVar)) {
                bitSet.set(aVar.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(b0 b0Var, com.github.catvod.spider.merge.t.u uVar) {
        return b0Var.c(this.d, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x024c, code lost:
    
        r3 = r13.d;
        r11 = r19.h();
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
    
        ((com.github.catvod.spider.merge.t.v) r0.d()).c(r16.d, r17, r20, r11, r14, r13);
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
    protected final int l(com.github.catvod.spider.merge.v.b r17, com.github.catvod.spider.merge.v.d r18, com.github.catvod.spider.merge.t.InterfaceC0621C r19, int r20, com.github.catvod.spider.merge.t.u r21) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.M.l(com.github.catvod.spider.merge.v.b, com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.t.C, int, com.github.catvod.spider.merge.t.u):int");
    }

    protected final int m(C0634c c0634c) {
        com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
        for (C0633b c0633b : c0634c) {
            if (c0633b.b() > 0 || ((c0633b.a instanceof Z) && c0633b.c.e())) {
                iVar.a(c0633b.b);
            }
        }
        if (iVar.j() == 0) {
            return 0;
        }
        return iVar.e();
    }

    protected final int n(C0634c c0634c, com.github.catvod.spider.merge.t.u uVar) {
        int iM;
        C0634c c0634c2 = new C0634c(c0634c.h);
        C0634c c0634c3 = new C0634c(c0634c.h);
        for (C0633b c0633b : c0634c) {
            b0 b0Var = c0633b.e;
            if (b0Var == b0.a || k(b0Var, uVar)) {
                c0634c2.a(c0633b, null);
            } else {
                c0634c3.a(c0633b, null);
            }
        }
        int iM2 = m(c0634c2);
        if (iM2 != 0) {
            return iM2;
        }
        if (c0634c3.size() <= 0 || (iM = m(c0634c3)) == 0) {
            return 0;
        }
        return iM;
    }

    protected final com.github.catvod.spider.merge.t.s p(InterfaceC0621C interfaceC0621C, com.github.catvod.spider.merge.t.u uVar, C0634c c0634c, int i) {
        return new com.github.catvod.spider.merge.t.s(this.d, interfaceC0621C, interfaceC0621C.get(i), interfaceC0621C.f(1), uVar);
    }

    protected final void q(com.github.catvod.spider.merge.v.b bVar, int i, int i2, BitSet bitSet, C0634c c0634c) {
        com.github.catvod.spider.merge.t.t tVar = this.d;
        if (tVar != null) {
            ((com.github.catvod.spider.merge.t.v) tVar.d()).a(this.d, bVar, i, i2, bitSet, c0634c);
        }
    }
}
