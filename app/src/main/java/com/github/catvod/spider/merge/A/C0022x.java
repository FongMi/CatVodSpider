package com.github.catvod.spider.merge.A;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0022x extends AbstractC0007h {
    public final com.github.catvod.spider.merge.z.m d;
    public int e;
    public int f;
    public int g;
    public final com.github.catvod.spider.merge.B.b[] h;
    public int i;
    public final C0021w j;

    public C0022x(com.github.catvod.spider.merge.z.m mVar, C0000a c0000a, com.github.catvod.spider.merge.B.b[] bVarArr, C0019u c0019u) {
        super(c0000a, c0019u);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new C0021w();
        this.h = bVarArr;
        this.d = mVar;
    }

    public static void b(com.github.catvod.spider.merge.B.e eVar, int i, com.github.catvod.spider.merge.B.e eVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (eVar) {
            try {
                if (eVar.c == null) {
                    eVar.c = new com.github.catvod.spider.merge.B.e[128];
                }
                eVar.c[i] = eVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A.AbstractC0007h
    public final void a() {
        C0021w c0021w = this.j;
        c0021w.a = -1;
        c0021w.b = 0;
        c0021w.c = -1;
        c0021w.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    public final com.github.catvod.spider.merge.B.e c(K k) {
        C0001b c0001b;
        com.github.catvod.spider.merge.B.e eVar = new com.github.catvod.spider.merge.B.e(k);
        Iterator it = k.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0001b = null;
                break;
            }
            c0001b = (C0001b) it.next();
            if (c0001b.a instanceof W) {
                break;
            }
        }
        if (c0001b != null) {
            eVar.d = true;
            eVar.f = ((C0020v) c0001b).f;
            eVar.e = this.a.g[c0001b.a.c];
        }
        com.github.catvod.spider.merge.B.b bVar = this.h[this.i];
        synchronized (bVar.a) {
            try {
                com.github.catvod.spider.merge.B.e eVar2 = (com.github.catvod.spider.merge.B.e) bVar.a.get(eVar);
                if (eVar2 != null) {
                    return eVar2;
                }
                eVar.a = bVar.a.size();
                k.a = true;
                k.b = null;
                eVar.b = k;
                bVar.a.put(eVar, eVar);
                return eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.github.catvod.spider.merge.z.d r18, com.github.catvod.spider.merge.A.C0020v r19, com.github.catvod.spider.merge.A.K r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.C0022x.d(com.github.catvod.spider.merge.z.d, com.github.catvod.spider.merge.A.v, com.github.catvod.spider.merge.A.K, boolean, boolean, boolean):boolean");
    }

    public final void e(com.github.catvod.spider.merge.z.d dVar) {
        int i;
        if (dVar.a(1) == 10) {
            this.f++;
            i = 0;
        } else {
            i = this.g + 1;
        }
        this.g = i;
        int i2 = dVar.b;
        if (dVar.a - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        dVar.b = i2 + 1;
    }

    public final int f(com.github.catvod.spider.merge.z.d dVar, com.github.catvod.spider.merge.B.e eVar) throws Throwable {
        int i;
        boolean z;
        com.github.catvod.spider.merge.B.e eVarC;
        K k;
        int i2;
        int i3;
        AbstractC0008i abstractC0008i;
        C0001b c0001b;
        int i4;
        int i5;
        int i6;
        AbstractC0008i abstractC0008i2;
        C0001b c0001b2;
        com.github.catvod.spider.merge.B.e eVar2 = eVar;
        boolean z2 = eVar2.d;
        C0021w c0021w = this.j;
        if (z2) {
            c0021w.a = dVar.b;
            c0021w.b = this.f;
            c0021w.c = this.g;
            c0021w.d = eVar2;
        }
        int iA = dVar.a(1);
        while (true) {
            com.github.catvod.spider.merge.B.e[] eVarArr = eVar2.c;
            com.github.catvod.spider.merge.B.e eVar3 = (eVarArr == null || iA < 0 || iA > 127) ? null : eVarArr[iA];
            com.github.catvod.spider.merge.B.e eVar4 = AbstractC0007h.c;
            if (eVar3 == null) {
                K k2 = new K();
                int i7 = 0;
                for (C0001b c0001b3 : eVar2.b.c) {
                    boolean z3 = c0001b3.b == i7;
                    if (!z3 || !((C0020v) c0001b3).g) {
                        AbstractC0008i abstractC0008i3 = c0001b3.a;
                        int size = abstractC0008i3.e.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                k = k2;
                                break;
                            }
                            l0 l0VarC = abstractC0008i3.c(i8);
                            AbstractC0008i abstractC0008i4 = l0VarC.d(iA, 1114111) ? l0VarC.a : null;
                            if (abstractC0008i4 != null) {
                                C0020v c0020v = (C0020v) c0001b3;
                                C0024z c0024z = c0020v.f;
                                if (c0024z != null) {
                                    i5 = i8;
                                    int i9 = dVar.b - this.e;
                                    i6 = size;
                                    abstractC0008i2 = abstractC0008i3;
                                    int i10 = 0;
                                    InterfaceC0023y[] interfaceC0023yArr = null;
                                    while (true) {
                                        InterfaceC0023y[] interfaceC0023yArr2 = c0024z.a;
                                        c0001b2 = c0001b3;
                                        if (i10 >= interfaceC0023yArr2.length) {
                                            break;
                                        }
                                        if (interfaceC0023yArr2[i10].a() && !(interfaceC0023yArr2[i10] instanceof D)) {
                                            if (interfaceC0023yArr == null) {
                                                interfaceC0023yArr = (InterfaceC0023y[]) interfaceC0023yArr2.clone();
                                            }
                                            interfaceC0023yArr[i10] = new D(i9, interfaceC0023yArr2[i10]);
                                        }
                                        i10++;
                                        c0001b3 = c0001b2;
                                    }
                                    if (interfaceC0023yArr != null) {
                                        c0024z = new C0024z(interfaceC0023yArr);
                                    }
                                } else {
                                    i5 = i8;
                                    i6 = size;
                                    abstractC0008i2 = abstractC0008i3;
                                    c0001b2 = c0001b3;
                                }
                                boolean z4 = iA == -1;
                                C0020v c0020v2 = new C0020v(c0020v, abstractC0008i4, c0024z);
                                i2 = i5;
                                int i11 = i6;
                                abstractC0008i = abstractC0008i2;
                                C0001b c0001b4 = c0001b2;
                                i4 = i7;
                                i3 = i11;
                                k = k2;
                                if (d(dVar, c0020v2, k2, z3, true, z4)) {
                                    i7 = c0001b4.b;
                                    break;
                                }
                                c0001b = c0001b4;
                            } else {
                                i2 = i8;
                                i3 = size;
                                abstractC0008i = abstractC0008i3;
                                c0001b = c0001b3;
                                i4 = i7;
                                k = k2;
                            }
                            c0001b3 = c0001b;
                            i8 = i2 + 1;
                            k2 = k;
                            abstractC0008i3 = abstractC0008i;
                            i7 = i4;
                            size = i3;
                        }
                        k2 = k;
                    }
                }
                K k3 = k2;
                i = -1;
                if (k3.c.isEmpty()) {
                    if (!k3.f) {
                        b(eVar2, iA, eVar4);
                    }
                    eVarC = eVar4;
                } else {
                    boolean z5 = k3.f;
                    k3.f = false;
                    eVarC = c(k3);
                    if (!z5) {
                        b(eVar2, iA, eVarC);
                    }
                }
                eVar2 = eVarC;
            } else {
                i = -1;
                eVar2 = eVar3;
            }
            if (eVar2 == eVar4) {
                break;
            }
            if (iA != i) {
                e(dVar);
            }
            if (eVar2.d) {
                c0021w.a = dVar.b;
                c0021w.b = this.f;
                c0021w.c = this.g;
                c0021w.d = eVar2;
                if (iA == i) {
                    break;
                }
            }
            iA = dVar.a(1);
        }
        com.github.catvod.spider.merge.B.e eVar5 = c0021w.d;
        com.github.catvod.spider.merge.z.m mVar = this.d;
        if (eVar5 == null) {
            if (iA == i && dVar.b == this.e) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.z.n(mVar, dVar, this.e);
        }
        C0024z c0024z2 = eVar5.f;
        int i12 = this.e;
        int i13 = c0021w.a;
        int i14 = c0021w.b;
        int i15 = c0021w.c;
        dVar.b = i13;
        this.f = i14;
        this.g = i15;
        if (c0024z2 != null && mVar != null) {
            try {
                InterfaceC0023y[] interfaceC0023yArr3 = c0024z2.a;
                int length = interfaceC0023yArr3.length;
                boolean z6 = false;
                for (int i16 = 0; i16 < length; i16++) {
                    try {
                        InterfaceC0023y interfaceC0023y = interfaceC0023yArr3[i16];
                        if (interfaceC0023y instanceof D) {
                            int i17 = ((D) interfaceC0023y).a + i12;
                            dVar.b = i17;
                            interfaceC0023y = ((D) interfaceC0023y).b;
                            z6 = i17 != i13;
                        } else if (interfaceC0023y.a()) {
                            dVar.b = i13;
                        }
                        interfaceC0023y.b(mVar);
                    } catch (Throwable th) {
                        th = th;
                        z = z6;
                        if (z) {
                            dVar.b = i13;
                        }
                        throw th;
                    }
                }
                if (z6) {
                    dVar.b = i13;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        return c0021w.d.e;
    }

    public final int g(com.github.catvod.spider.merge.z.d dVar, int i) {
        this.i = i;
        dVar.getClass();
        this.e = dVar.b;
        C0021w c0021w = this.j;
        c0021w.a = -1;
        c0021w.b = 0;
        c0021w.c = -1;
        c0021w.d = null;
        com.github.catvod.spider.merge.B.b bVar = this.h[i];
        return bVar.b == null ? h(dVar) : f(dVar, bVar.b);
    }

    public final int h(com.github.catvod.spider.merge.z.d dVar) {
        AbstractC0008i abstractC0008i = (AbstractC0008i) this.a.i.get(this.i);
        C0017s c0017s = Q.b;
        K k = new K();
        int i = 0;
        while (i < abstractC0008i.e.size()) {
            int i2 = i + 1;
            d(dVar, new C0020v(abstractC0008i.c(i).a, i2, c0017s), k, false, false, false);
            i = i2;
        }
        boolean z = k.f;
        k.f = false;
        com.github.catvod.spider.merge.B.e eVarC = c(k);
        if (!z) {
            this.h[this.i].b = eVarC;
        }
        return f(dVar, eVarC);
    }
}
