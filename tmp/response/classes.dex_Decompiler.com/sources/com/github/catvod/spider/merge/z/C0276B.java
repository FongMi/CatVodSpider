package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.y.InterfaceC0260d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0276B extends AbstractC0293l {
    protected final com.github.catvod.spider.merge.y.t d;
    protected int e;
    protected int f;
    protected int g;
    public final com.github.catvod.spider.merge.A.b[] h;
    protected int i;
    protected final C0275A j;

    public C0276B(com.github.catvod.spider.merge.y.t tVar, C0282a c0282a, com.github.catvod.spider.merge.A.b[] bVarArr, Y y) {
        super(c0282a, y);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new C0275A();
        this.h = bVarArr;
        this.d = tVar;
    }

    @Override // com.github.catvod.spider.merge.z.AbstractC0293l
    public final void a() {
        C0275A c0275a = this.j;
        c0275a.a = -1;
        c0275a.b = 0;
        c0275a.c = -1;
        c0275a.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    protected final void b(com.github.catvod.spider.merge.A.e eVar, int i, com.github.catvod.spider.merge.A.e eVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new com.github.catvod.spider.merge.A.e[128];
            }
            eVar.c[i + 0] = eVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.A.e, com.github.catvod.spider.merge.A.e>] */
    protected final com.github.catvod.spider.merge.A.e c(C0287f c0287f) {
        C0283b next;
        com.github.catvod.spider.merge.A.e eVar = new com.github.catvod.spider.merge.A.e(c0287f);
        Iterator<C0283b> it = c0287f.iterator();
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
            eVar.f = ((C0306z) next).e();
            eVar.e = this.a.g[next.a.c];
        }
        com.github.catvod.spider.merge.A.b bVar = this.h[this.i];
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.A.e eVar2 = (com.github.catvod.spider.merge.A.e) bVar.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar.a.size();
            c0287f.a = true;
            c0287f.b = null;
            eVar.b = c0287f;
            bVar.a.put(eVar, eVar);
            return eVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean d(com.github.catvod.spider.merge.y.InterfaceC0260d r16, com.github.catvod.spider.merge.z.C0306z r17, com.github.catvod.spider.merge.z.C0287f r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.C0276B.d(com.github.catvod.spider.merge.y.d, com.github.catvod.spider.merge.z.z, com.github.catvod.spider.merge.z.f, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC0260d interfaceC0260d) {
        if (interfaceC0260d.g(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC0260d.j();
    }

    protected final int f(InterfaceC0260d interfaceC0260d, com.github.catvod.spider.merge.A.e eVar) throws Throwable {
        com.github.catvod.spider.merge.y.t tVar;
        int i;
        int i2;
        C0283b c0283b;
        int i3;
        if (eVar.d) {
            C0275A c0275a = this.j;
            c0275a.a = interfaceC0260d.i();
            c0275a.b = this.f;
            c0275a.c = this.g;
            c0275a.d = eVar;
        }
        com.github.catvod.spider.merge.A.e eVar2 = eVar;
        int iG = interfaceC0260d.g(1);
        while (true) {
            com.github.catvod.spider.merge.A.e[] eVarArr = eVar2.c;
            com.github.catvod.spider.merge.A.e eVar3 = (eVarArr == null || iG < 0 || iG > 127) ? null : eVarArr[iG + 0];
            int i4 = -1;
            if (eVar3 == null) {
                Q q = new Q();
                int i5 = 0;
                for (C0283b c0283b2 : eVar2.b) {
                    boolean z = c0283b2.b == i5;
                    if (z && ((C0306z) c0283b2).f()) {
                        i5 = i5;
                    } else {
                        int iB = c0283b2.a.b();
                        int i6 = 0;
                        while (i6 < iB) {
                            t0 t0VarD = c0283b2.a.d(i6);
                            AbstractC0294m abstractC0294m = t0VarD.d(iG, 1114111) ? t0VarD.a : null;
                            if (abstractC0294m != null) {
                                C0306z c0306z = (C0306z) c0283b2;
                                C0278D c0278dE = c0306z.e();
                                if (c0278dE != null) {
                                    c0278dE = c0278dE.c(interfaceC0260d.i() - this.e);
                                }
                                boolean z2 = iG == i4;
                                i = i6;
                                c0283b = c0283b2;
                                i3 = i5;
                                i2 = iB;
                                if (d(interfaceC0260d, new C0306z(c0306z, abstractC0294m, c0278dE), q, z, true, z2)) {
                                    i5 = c0283b.b;
                                    break;
                                }
                            } else {
                                i = i6;
                                i2 = iB;
                                c0283b = c0283b2;
                                i3 = i5;
                            }
                            i6 = i + 1;
                            c0283b2 = c0283b;
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
                        b(eVar2, iG, AbstractC0293l.c);
                    }
                    eVar3 = AbstractC0293l.c;
                    eVar2 = eVar3;
                } else {
                    boolean z3 = q.f;
                    q.f = false;
                    com.github.catvod.spider.merge.A.e eVarC = c(q);
                    if (!z3) {
                        b(eVar2, iG, eVarC);
                    }
                    eVar2 = eVarC;
                }
            } else {
                eVar2 = eVar3;
            }
            if (eVar2 == AbstractC0293l.c) {
                break;
            }
            if (iG != -1) {
                e(interfaceC0260d);
            }
            if (eVar2.d) {
                C0275A c0275a2 = this.j;
                c0275a2.a = interfaceC0260d.i();
                c0275a2.b = this.f;
                c0275a2.c = this.g;
                c0275a2.d = eVar2;
                if (iG == -1) {
                    break;
                }
            }
            iG = interfaceC0260d.g(1);
        }
        C0275A c0275a3 = this.j;
        com.github.catvod.spider.merge.A.e eVar4 = c0275a3.d;
        if (eVar4 == null) {
            if (iG == -1 && interfaceC0260d.i() == this.e) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.y.u(this.d, interfaceC0260d, this.e);
        }
        C0278D c0278d = eVar4.f;
        int i7 = this.e;
        int i8 = c0275a3.a;
        int i9 = c0275a3.b;
        int i10 = c0275a3.c;
        interfaceC0260d.e(i8);
        this.f = i9;
        this.g = i10;
        if (c0278d != null && (tVar = this.d) != null) {
            c0278d.b(tVar, interfaceC0260d, i7);
        }
        return c0275a3.d.e;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC0260d interfaceC0260d, int i) {
        this.i = i;
        interfaceC0260d.d();
        try {
            this.e = interfaceC0260d.i();
            C0275A c0275a = this.j;
            c0275a.a = -1;
            c0275a.b = 0;
            c0275a.c = -1;
            c0275a.d = null;
            com.github.catvod.spider.merge.A.b bVar = this.h[i];
            return bVar.b == null ? j(interfaceC0260d) : f(interfaceC0260d, bVar.b);
        } finally {
            interfaceC0260d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.r0>] */
    protected final int j(InterfaceC0260d interfaceC0260d) {
        AbstractC0294m abstractC0294m = (AbstractC0294m) this.a.i.get(this.i);
        C0303w c0303w = X.b;
        Q q = new Q();
        int i = 0;
        while (i < abstractC0294m.b()) {
            int i2 = i + 1;
            d(interfaceC0260d, new C0306z(abstractC0294m.d(i).a, i2, c0303w), q, false, false, false);
            i = i2;
        }
        boolean z = q.f;
        q.f = false;
        com.github.catvod.spider.merge.A.e eVarC = c(q);
        if (!z) {
            this.h[this.i].b = eVarC;
        }
        return f(interfaceC0260d, eVarC);
    }
}
