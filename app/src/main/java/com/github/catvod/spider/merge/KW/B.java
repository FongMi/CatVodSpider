package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.yZ.InterfaceC1439d;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class B extends AbstractC0824l {
    protected final com.github.catvod.spider.merge.yZ.t d;
    protected int e;
    protected int f;
    protected int g;
    public final com.github.catvod.spider.merge.XI.b[] h;
    protected int i;
    protected final A j;

    public B(com.github.catvod.spider.merge.yZ.t tVar, C0813a c0813a, com.github.catvod.spider.merge.XI.b[] bVarArr, Y y) {
        super(c0813a, y);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new A();
        this.h = bVarArr;
        this.d = tVar;
    }

    @Override // com.github.catvod.spider.merge.KW.AbstractC0824l
    public final void a() {
        A a = this.j;
        a.a = -1;
        a.b = 0;
        a.c = -1;
        a.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    protected final void b(com.github.catvod.spider.merge.XI.e eVar, int i, com.github.catvod.spider.merge.XI.e eVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new com.github.catvod.spider.merge.XI.e[128];
            }
            eVar.c[i + 0] = eVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.XI.e, com.github.catvod.spider.merge.XI.e>] */
    protected final com.github.catvod.spider.merge.XI.e c(C0818f c0818f) {
        C0814b next;
        com.github.catvod.spider.merge.XI.e eVar = new com.github.catvod.spider.merge.XI.e(c0818f);
        Iterator<C0814b> it = c0818f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.a instanceof e0) {
                break;
            }
        }
        if (next != null) {
            eVar.d = true;
            eVar.f = ((C0837z) next).e();
            eVar.e = this.a.g[next.a.c];
        }
        com.github.catvod.spider.merge.XI.b bVar = this.h[this.i];
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.XI.e eVar2 = (com.github.catvod.spider.merge.XI.e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            c0818f.a = true;
            c0818f.b = null;
            eVar.b = c0818f;
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean d(com.github.catvod.spider.merge.yZ.InterfaceC1439d r16, com.github.catvod.spider.merge.KW.C0837z r17, com.github.catvod.spider.merge.KW.C0818f r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.B.d(com.github.catvod.spider.merge.yZ.d, com.github.catvod.spider.merge.KW.z, com.github.catvod.spider.merge.KW.f, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC1439d interfaceC1439d) {
        if (interfaceC1439d.g(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC1439d.j();
    }

    protected final int f(InterfaceC1439d interfaceC1439d, com.github.catvod.spider.merge.XI.e eVar) throws Throwable {
        com.github.catvod.spider.merge.yZ.t tVar;
        int i;
        int i2;
        C0814b c0814b;
        int i3;
        if (eVar.d) {
            A a = this.j;
            a.a = interfaceC1439d.i();
            a.b = this.f;
            a.c = this.g;
            a.d = eVar;
        }
        com.github.catvod.spider.merge.XI.e eVar2 = eVar;
        int iG = interfaceC1439d.g(1);
        while (true) {
            com.github.catvod.spider.merge.XI.e[] eVarArr = eVar2.c;
            com.github.catvod.spider.merge.XI.e eVar3 = (eVarArr == null || iG < 0 || iG > 127) ? null : eVarArr[iG + 0];
            int i4 = -1;
            if (eVar3 == null) {
                Q q = new Q();
                int i5 = 0;
                for (C0814b c0814b2 : eVar2.b) {
                    boolean z = c0814b2.b == i5;
                    if (z && ((C0837z) c0814b2).f()) {
                        i5 = i5;
                    } else {
                        int iB = c0814b2.a.b();
                        int i6 = 0;
                        while (i6 < iB) {
                            t0 t0VarD = c0814b2.a.d(i6);
                            AbstractC0825m abstractC0825m = t0VarD.d(iG, 1114111) ? t0VarD.a : null;
                            if (abstractC0825m != null) {
                                C0837z c0837z = (C0837z) c0814b2;
                                D dE = c0837z.e();
                                if (dE != null) {
                                    dE = dE.c(interfaceC1439d.i() - this.e);
                                }
                                boolean z2 = iG == i4;
                                i = i6;
                                c0814b = c0814b2;
                                i3 = i5;
                                i2 = iB;
                                if (d(interfaceC1439d, new C0837z(c0837z, abstractC0825m, dE), q, z, true, z2)) {
                                    i5 = c0814b.b;
                                    break;
                                }
                            } else {
                                i = i6;
                                i2 = iB;
                                c0814b = c0814b2;
                                i3 = i5;
                            }
                            i6 = i + 1;
                            c0814b2 = c0814b;
                            i5 = i3;
                            iB = i2;
                            i4 = -1;
                        }
                        i5 = i5;
                    }
                    i4 = -1;
                }
                if (q.isEmpty()) {
                    if (!q.f) {
                        b(eVar2, iG, AbstractC0824l.c);
                    }
                    eVar3 = AbstractC0824l.c;
                    eVar2 = eVar3;
                } else {
                    boolean z3 = q.f;
                    q.f = false;
                    com.github.catvod.spider.merge.XI.e eVarC = c(q);
                    if (!z3) {
                        b(eVar2, iG, eVarC);
                    }
                    eVar2 = eVarC;
                }
            } else {
                eVar2 = eVar3;
            }
            if (eVar2 == AbstractC0824l.c) {
                break;
            }
            if (iG != -1) {
                e(interfaceC1439d);
            }
            if (eVar2.d) {
                A a2 = this.j;
                a2.a = interfaceC1439d.i();
                a2.b = this.f;
                a2.c = this.g;
                a2.d = eVar2;
                if (iG == -1) {
                    break;
                }
            }
            iG = interfaceC1439d.g(1);
        }
        A a3 = this.j;
        com.github.catvod.spider.merge.XI.e eVar4 = a3.d;
        if (eVar4 == null) {
            if (iG == -1 && interfaceC1439d.i() == this.e) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.yZ.u(this.d, interfaceC1439d, this.e);
        }
        D d = eVar4.f;
        int i7 = this.e;
        int i8 = a3.a;
        int i9 = a3.b;
        int i10 = a3.c;
        interfaceC1439d.e(i8);
        this.f = i9;
        this.g = i10;
        if (d != null && (tVar = this.d) != null) {
            d.b(tVar, interfaceC1439d, i7);
        }
        return a3.d.e;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC1439d interfaceC1439d, int i) {
        this.i = i;
        interfaceC1439d.d();
        try {
            this.e = interfaceC1439d.i();
            A a = this.j;
            a.a = -1;
            a.b = 0;
            a.c = -1;
            a.d = null;
            com.github.catvod.spider.merge.XI.b bVar = this.h[i];
            return bVar.b == null ? j(interfaceC1439d) : f(interfaceC1439d, bVar.b);
        } finally {
            interfaceC1439d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.r0>] */
    protected final int j(InterfaceC1439d interfaceC1439d) {
        AbstractC0825m abstractC0825m = (AbstractC0825m) this.a.i.get(this.i);
        C0834w c0834w = X.b;
        Q q = new Q();
        int i = 0;
        while (i < abstractC0825m.b()) {
            int i2 = i + 1;
            d(interfaceC1439d, new C0837z(abstractC0825m.d(i).a, i2, c0834w), q, false, false, false);
            i = i2;
        }
        boolean z = q.f;
        q.f = false;
        com.github.catvod.spider.merge.XI.e eVarC = c(q);
        if (!z) {
            this.h[this.i].b = eVarC;
        }
        return f(interfaceC1439d, eVarC);
    }
}
