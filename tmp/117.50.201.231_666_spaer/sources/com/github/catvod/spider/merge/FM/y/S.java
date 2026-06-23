package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.C0426D;
import com.github.catvod.spider.merge.FM.x.InterfaceC0430H;
import com.github.catvod.spider.merge.FM.z.C0485b;
import com.github.catvod.spider.merge.FM.z.C0487d;
import com.github.catvod.spider.merge.FM.z.C0488e;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class S extends AbstractC0470l {
    public static final boolean k;
    protected final com.github.catvod.spider.merge.FM.x.x d;
    public final C0485b[] e;
    protected com.github.catvod.spider.merge.FM.A.d<X, X, X> f;
    protected InterfaceC0430H g;
    protected int h;
    protected com.github.catvod.spider.merge.FM.x.y i;
    protected C0485b j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public S(com.github.catvod.spider.merge.FM.x.x xVar, C0459a c0459a, C0485b[] c0485bArr, Y y) {
        super(c0459a, y);
        this.d = xVar;
        this.e = c0485bArr;
    }

    protected static int o(C0464f c0464f) {
        int i = 0;
        for (C0460b c0460b : c0464f) {
            if (i == 0) {
                i = c0460b.b;
            } else if (c0460b.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.FM.y.AbstractC0470l
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(InterfaceC0430H interfaceC0430H, int i, com.github.catvod.spider.merge.FM.x.y yVar) {
        this.g = interfaceC0430H;
        this.h = interfaceC0430H.i();
        this.i = yVar;
        C0485b c0485b = this.e[i];
        this.j = c0485b;
        interfaceC0430H.d();
        int i2 = this.h;
        try {
            C0488e c0488eA = c0485b.b() ? c0485b.a(this.d.p()) : c0485b.b;
            if (c0488eA == null) {
                if (yVar == null) {
                    yVar = C0426D.c;
                }
                C0464f c0464fI = i(c0485b.d, C0426D.c, false);
                if (c0485b.b()) {
                    c0485b.b.b = c0464fI;
                    c0488eA = d(c0485b, new C0488e(e(c0464fI)));
                    c0485b.c(this.d.p(), c0488eA);
                } else {
                    c0488eA = d(c0485b, new C0488e(c0464fI));
                    c0485b.b = c0488eA;
                }
            }
            return l(c0485b, c0488eA, interfaceC0430H, i2, yVar);
        } finally {
            this.f = null;
            this.j = null;
            interfaceC0430H.f(i2);
            interfaceC0430H.a();
        }
    }

    protected final C0488e c(C0485b c0485b, C0488e c0488e, int i, C0488e c0488e2) {
        if (c0488e2 == null) {
            return null;
        }
        C0488e c0488eD = d(c0485b, c0488e2);
        if (i < -1 || i > this.a.f) {
            return c0488eD;
        }
        synchronized (c0488e) {
            if (c0488e.c == null) {
                c0488e.c = new C0488e[this.a.f + 1 + 1];
            }
            c0488e.c[i + 1] = c0488eD;
        }
        return c0488eD;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    protected final C0488e d(C0485b c0485b, C0488e c0488e) {
        if (c0488e == AbstractC0470l.c) {
            return c0488e;
        }
        synchronized (c0485b.a) {
            C0488e c0488e2 = (C0488e) c0485b.a.get(c0488e);
            if (c0488e2 != null) {
                return c0488e2;
            }
            c0488e.a = c0485b.a.size();
            C0464f c0464f = c0488e.b;
            if (!c0464f.a) {
                c0464f.b(this);
                C0464f c0464f2 = c0488e.b;
                c0464f2.a = true;
                c0464f2.b = null;
            }
            c0485b.a.put(c0488e, c0488e);
            return c0488e;
        }
    }

    protected final C0464f e(C0464f c0464f) {
        X x;
        l0 l0VarD;
        HashMap map = new HashMap();
        C0464f c0464f2 = new C0464f(c0464f.h);
        for (C0460b c0460b : c0464f) {
            if (c0460b.b == 1 && (l0VarD = c0460b.e.d(this.d, this.i)) != null) {
                map.put(Integer.valueOf(c0460b.a.b), c0460b.c);
                if (l0VarD != c0460b.e) {
                    c0464f2.a(new C0460b(c0460b, c0460b.a, c0460b.c, l0VarD), this.f);
                } else {
                    c0464f2.a(c0460b, this.f);
                }
            }
        }
        for (C0460b c0460b2 : c0464f) {
            if (c0460b2.b != 1 && (c0460b2.c() || (x = (X) map.get(Integer.valueOf(c0460b2.a.b))) == null || !x.equals(c0460b2.c))) {
                c0464f2.a(c0460b2, this.f);
            }
        }
        return c0464f2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    protected final void f(C0460b c0460b, C0464f c0464f, Set<C0460b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0460b.a instanceof e0) {
            if (!c0460b.c.f()) {
                for (int i2 = 0; i2 < c0460b.c.h(); i2++) {
                    if (c0460b.c.d(i2) != Integer.MAX_VALUE) {
                        C0460b c0460b2 = new C0460b((AbstractC0471m) this.a.a.get(c0460b.c.d(i2)), c0460b.b, c0460b.c.c(i2), c0460b.e);
                        c0460b2.d = c0460b.d;
                        f(c0460b2, c0464f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0464f.a(new C0460b(c0460b, c0460b.a, X.b, c0460b.e), this.f);
                    } else {
                        g(c0460b, c0464f, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0464f.a(c0460b, this.f);
                return;
            }
        }
        g(c0460b, c0464f, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da A[PHI: r5
      0x01da: PHI (r5v5 com.github.catvod.spider.merge.FM.y.b) = 
      (r5v3 com.github.catvod.spider.merge.FM.y.b)
      (r5v0 com.github.catvod.spider.merge.FM.y.b)
      (r5v0 com.github.catvod.spider.merge.FM.y.b)
      (r5v0 com.github.catvod.spider.merge.FM.y.b)
      (r5v0 com.github.catvod.spider.merge.FM.y.b)
      (r5v10 com.github.catvod.spider.merge.FM.y.b)
      (r5v13 com.github.catvod.spider.merge.FM.y.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(com.github.catvod.spider.merge.FM.y.C0460b r17, com.github.catvod.spider.merge.FM.y.C0464f r18, java.util.Set<com.github.catvod.spider.merge.FM.y.C0460b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.y.S.g(com.github.catvod.spider.merge.FM.y.b, com.github.catvod.spider.merge.FM.y.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.FM.y.C0464f h(com.github.catvod.spider.merge.FM.y.C0464f r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.y.S.h(com.github.catvod.spider.merge.FM.y.f, int, boolean):com.github.catvod.spider.merge.FM.y.f");
    }

    protected final C0464f i(AbstractC0471m abstractC0471m, C0426D c0426d, boolean z) {
        X xA = X.a(this.a, c0426d);
        C0464f c0464f = new C0464f(z);
        int i = 0;
        while (i < abstractC0471m.b()) {
            int i2 = i + 1;
            f(new C0460b(abstractC0471m.d(i).a, i2, xA, l0.a), c0464f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0464f;
    }

    protected final BitSet j(C0487d[] c0487dArr, com.github.catvod.spider.merge.FM.x.y yVar) {
        BitSet bitSet = new BitSet();
        for (C0487d c0487d : c0487dArr) {
            l0 l0Var = c0487d.a;
            if (l0Var == l0.a || k(l0Var, yVar)) {
                bitSet.set(c0487d.b);
            }
        }
        return bitSet;
    }

    protected final boolean k(l0 l0Var, com.github.catvod.spider.merge.FM.x.y yVar) {
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
    
        ((com.github.catvod.spider.merge.FM.x.z) r0.e()).c(r16.d, r17, r20, r11, r14, r13);
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
    protected final int l(com.github.catvod.spider.merge.FM.z.C0485b r17, com.github.catvod.spider.merge.FM.z.C0488e r18, com.github.catvod.spider.merge.FM.x.InterfaceC0430H r19, int r20, com.github.catvod.spider.merge.FM.x.y r21) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.y.S.l(com.github.catvod.spider.merge.FM.z.b, com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.x.H, int, com.github.catvod.spider.merge.FM.x.y):int");
    }

    protected final int m(C0464f c0464f) {
        com.github.catvod.spider.merge.FM.A.k kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
        for (C0460b c0460b : c0464f) {
            if (c0460b.b() > 0 || ((c0460b.a instanceof e0) && c0460b.c.e())) {
                kVar.a(c0460b.b);
            }
        }
        if (kVar.j() == 0) {
            return 0;
        }
        return kVar.e();
    }

    protected final int n(C0464f c0464f, com.github.catvod.spider.merge.FM.x.y yVar) {
        int iM;
        C0464f c0464f2 = new C0464f(c0464f.h);
        C0464f c0464f3 = new C0464f(c0464f.h);
        for (C0460b c0460b : c0464f) {
            l0 l0Var = c0460b.e;
            if (l0Var == l0.a || k(l0Var, yVar)) {
                c0464f2.a(c0460b, null);
            } else {
                c0464f3.a(c0460b, null);
            }
        }
        int iM2 = m(c0464f2);
        if (iM2 != 0) {
            return iM2;
        }
        if (c0464f3.size() <= 0 || (iM = m(c0464f3)) == 0) {
            return 0;
        }
        return iM;
    }

    protected final com.github.catvod.spider.merge.FM.x.v p(InterfaceC0430H interfaceC0430H, com.github.catvod.spider.merge.FM.x.y yVar, C0464f c0464f, int i) {
        return new com.github.catvod.spider.merge.FM.x.v(this.d, interfaceC0430H, interfaceC0430H.get(i), interfaceC0430H.g(1), yVar);
    }

    protected final void q(C0485b c0485b, int i, int i2, BitSet bitSet, C0464f c0464f) {
        com.github.catvod.spider.merge.FM.x.x xVar = this.d;
        if (xVar != null) {
            ((com.github.catvod.spider.merge.FM.x.z) xVar.e()).a(this.d, c0485b, i, i2, bitSet, c0464f);
        }
    }
}
