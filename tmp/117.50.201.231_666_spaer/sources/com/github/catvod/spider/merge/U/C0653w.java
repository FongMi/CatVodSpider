package com.github.catvod.spider.merge.u;

import com.github.catvod.spider.merge.t.InterfaceC0627d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0653w extends AbstractC0639h {
    protected final com.github.catvod.spider.merge.t.q d;
    protected int e;
    protected int f;
    protected int g;
    public final com.github.catvod.spider.merge.v.b[] h;
    protected int i;
    protected final a j;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.u.w$a */
    protected static class a {
        protected int a = -1;
        protected int b = 0;
        protected int c = -1;
        protected com.github.catvod.spider.merge.v.d d;

        protected a() {
        }
    }

    public C0653w(com.github.catvod.spider.merge.t.q qVar, C0632a c0632a, com.github.catvod.spider.merge.v.b[] bVarArr, T t) {
        super(c0632a, t);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new a();
        this.h = bVarArr;
        this.d = qVar;
    }

    @Override // com.github.catvod.spider.merge.u.AbstractC0639h
    public final void a() {
        a aVar = this.j;
        aVar.a = -1;
        aVar.b = 0;
        aVar.c = -1;
        aVar.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    protected final void b(com.github.catvod.spider.merge.v.d dVar, int i, com.github.catvod.spider.merge.v.d dVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (dVar) {
            if (dVar.c == null) {
                dVar.c = new com.github.catvod.spider.merge.v.d[128];
            }
            dVar.c[i + 0] = dVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.v.d, com.github.catvod.spider.merge.v.d>] */
    protected final com.github.catvod.spider.merge.v.d c(C0634c c0634c) {
        C0633b next;
        com.github.catvod.spider.merge.v.d dVar = new com.github.catvod.spider.merge.v.d(c0634c);
        Iterator<C0633b> it = c0634c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.a instanceof Z) {
                break;
            }
        }
        if (next != null) {
            dVar.d = true;
            dVar.f = ((C0652v) next).e();
            dVar.e = this.a.g[next.a.c];
        }
        com.github.catvod.spider.merge.v.b bVar = this.h[this.i];
        synchronized (bVar.a) {
            com.github.catvod.spider.merge.v.d dVar2 = (com.github.catvod.spider.merge.v.d) bVar.a.get(dVar);
            if (dVar2 != null) {
                return dVar2;
            }
            dVar.a = bVar.a.size();
            c0634c.a = true;
            c0634c.b = null;
            dVar.b = c0634c;
            bVar.a.put(dVar, dVar);
            return dVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean d(com.github.catvod.spider.merge.t.InterfaceC0627d r16, com.github.catvod.spider.merge.u.C0652v r17, com.github.catvod.spider.merge.u.C0634c r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.C0653w.d(com.github.catvod.spider.merge.t.d, com.github.catvod.spider.merge.u.v, com.github.catvod.spider.merge.u.c, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC0627d interfaceC0627d) {
        if (interfaceC0627d.g(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC0627d.i();
    }

    protected final int f(InterfaceC0627d interfaceC0627d, com.github.catvod.spider.merge.v.d dVar) throws Throwable {
        com.github.catvod.spider.merge.t.q qVar;
        int i;
        int i2;
        C0633b c0633b;
        int i3;
        if (dVar.d) {
            a aVar = this.j;
            aVar.a = interfaceC0627d.h();
            aVar.b = this.f;
            aVar.c = this.g;
            aVar.d = dVar;
        }
        com.github.catvod.spider.merge.v.d dVar2 = dVar;
        int iG = interfaceC0627d.g(1);
        while (true) {
            com.github.catvod.spider.merge.v.d[] dVarArr = dVar2.c;
            com.github.catvod.spider.merge.v.d dVar3 = (dVarArr == null || iG < 0 || iG > 127) ? null : dVarArr[iG + 0];
            int i4 = -1;
            if (dVar3 == null) {
                L l = new L();
                int i5 = 0;
                for (C0633b c0633b2 : dVar2.b) {
                    boolean z = c0633b2.b == i5;
                    if (z && ((C0652v) c0633b2).f()) {
                        i5 = i5;
                    } else {
                        int iB = c0633b2.a.b();
                        int i6 = 0;
                        while (i6 < iB) {
                            i0 i0VarD = c0633b2.a.d(i6);
                            AbstractC0640i abstractC0640i = i0VarD.d(iG, 1114111) ? i0VarD.a : null;
                            if (abstractC0640i != null) {
                                C0652v c0652v = (C0652v) c0633b2;
                                C0655y c0655yE = c0652v.e();
                                if (c0655yE != null) {
                                    c0655yE = c0655yE.c(interfaceC0627d.h() - this.e);
                                }
                                boolean z2 = iG == i4;
                                i = i6;
                                c0633b = c0633b2;
                                i3 = i5;
                                i2 = iB;
                                if (d(interfaceC0627d, new C0652v(c0652v, abstractC0640i, c0655yE), l, z, true, z2)) {
                                    i5 = c0633b.b;
                                    break;
                                }
                            } else {
                                i = i6;
                                i2 = iB;
                                c0633b = c0633b2;
                                i3 = i5;
                            }
                            i6 = i + 1;
                            c0633b2 = c0633b;
                            i5 = i3;
                            iB = i2;
                            i4 = -1;
                        }
                        i5 = i5;
                    }
                    i4 = -1;
                }
                if (l.isEmpty()) {
                    if (!l.f) {
                        b(dVar2, iG, AbstractC0639h.c);
                    }
                    dVar3 = AbstractC0639h.c;
                    dVar2 = dVar3;
                } else {
                    boolean z3 = l.f;
                    l.f = false;
                    com.github.catvod.spider.merge.v.d dVarC = c(l);
                    if (!z3) {
                        b(dVar2, iG, dVarC);
                    }
                    dVar2 = dVarC;
                }
            } else {
                dVar2 = dVar3;
            }
            if (dVar2 == AbstractC0639h.c) {
                break;
            }
            if (iG != -1) {
                e(interfaceC0627d);
            }
            if (dVar2.d) {
                a aVar2 = this.j;
                aVar2.a = interfaceC0627d.h();
                aVar2.b = this.f;
                aVar2.c = this.g;
                aVar2.d = dVar2;
                if (iG == -1) {
                    break;
                }
            }
            iG = interfaceC0627d.g(1);
        }
        a aVar3 = this.j;
        com.github.catvod.spider.merge.v.d dVar4 = aVar3.d;
        if (dVar4 == null) {
            if (iG == -1 && interfaceC0627d.h() == this.e) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.t.r(this.d, interfaceC0627d, this.e);
        }
        C0655y c0655y = dVar4.f;
        int i7 = this.e;
        int i8 = aVar3.a;
        int i9 = aVar3.b;
        int i10 = aVar3.c;
        interfaceC0627d.e(i8);
        this.f = i9;
        this.g = i10;
        if (c0655y != null && (qVar = this.d) != null) {
            c0655y.b(qVar, interfaceC0627d, i7);
        }
        return aVar3.d.e;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC0627d interfaceC0627d, int i) {
        this.i = i;
        interfaceC0627d.c();
        try {
            this.e = interfaceC0627d.h();
            a aVar = this.j;
            aVar.a = -1;
            aVar.b = 0;
            aVar.c = -1;
            aVar.d = null;
            com.github.catvod.spider.merge.v.b bVar = this.h[i];
            return bVar.b == null ? j(interfaceC0627d) : f(interfaceC0627d, bVar.b);
        } finally {
            interfaceC0627d.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.h0>] */
    protected final int j(InterfaceC0627d interfaceC0627d) {
        AbstractC0640i abstractC0640i = (AbstractC0640i) this.a.i.get(this.i);
        C0649s c0649s = S.b;
        L l = new L();
        int i = 0;
        while (i < abstractC0640i.b()) {
            int i2 = i + 1;
            d(interfaceC0627d, new C0652v(abstractC0640i.d(i).a, i2, c0649s), l, false, false, false);
            i = i2;
        }
        boolean z = l.f;
        l.f = false;
        com.github.catvod.spider.merge.v.d dVarC = c(l);
        if (!z) {
            this.h[this.i].b = dVarC;
        }
        return f(interfaceC0627d, dVarC);
    }
}
