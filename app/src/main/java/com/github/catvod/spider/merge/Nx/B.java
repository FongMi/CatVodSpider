package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.m;
import com.github.catvod.spider.merge.gu.InterfaceC1227d;
import com.github.catvod.spider.merge.gu.s;
import com.github.catvod.spider.merge.gu.t;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class B extends l {
    protected final s d;
    protected int e;
    protected int f;
    protected int g;
    public final com.github.catvod.spider.merge.Dw.k[] h;
    protected int i;
    protected final A j;

    public B(s sVar, a aVar, com.github.catvod.spider.merge.Dw.k[] kVarArr, Y y) {
        super(aVar, y);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new A();
        this.h = kVarArr;
        this.d = sVar;
    }

    @Override // com.github.catvod.spider.merge.Nx.l
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

    protected final void b(m mVar, int i, m mVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (mVar) {
            if (mVar.c == null) {
                mVar.c = new m[128];
            }
            mVar.c[i + 0] = mVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.Dw.m, com.github.catvod.spider.merge.Dw.m>] */
    protected final m c(f fVar) {
        b next;
        m mVar = new m(fVar);
        Iterator<b> it = fVar.iterator();
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
            mVar.d = true;
            mVar.f = ((z) next).e();
            mVar.e = this.a.g[next.a.c];
        }
        com.github.catvod.spider.merge.Dw.k kVar = this.h[this.i];
        synchronized (kVar.a) {
            m mVar2 = (m) kVar.a.get(mVar);
            if (mVar2 != null) {
                return mVar2;
            }
            mVar.a = kVar.a.size();
            fVar.c = true;
            fVar.d = null;
            mVar.b = fVar;
            kVar.a.put(mVar, mVar);
            return mVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean d(com.github.catvod.spider.merge.gu.InterfaceC1227d r16, com.github.catvod.spider.merge.Nx.z r17, com.github.catvod.spider.merge.Nx.f r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Nx.B.d(com.github.catvod.spider.merge.gu.d, com.github.catvod.spider.merge.Nx.z, com.github.catvod.spider.merge.Nx.f, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC1227d interfaceC1227d) {
        if (interfaceC1227d.f(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC1227d.j();
    }

    protected final int f(InterfaceC1227d interfaceC1227d, m mVar) throws Throwable {
        s sVar;
        int i;
        int i2;
        z zVar;
        int i3;
        if (mVar.d) {
            A a = this.j;
            a.a = interfaceC1227d.i();
            a.b = this.f;
            a.c = this.g;
            a.d = mVar;
        }
        m mVar2 = mVar;
        int iF = interfaceC1227d.f(1);
        while (true) {
            m[] mVarArr = mVar2.c;
            m mVar3 = (mVarArr == null || iF < 0 || iF > 127) ? null : mVarArr[iF + 0];
            int i4 = -1;
            if (mVar3 == null) {
                Q q = new Q();
                int i5 = 0;
                for (z zVar2 : mVar2.b) {
                    boolean z = ((b) zVar2).b == i5;
                    if (z && zVar2.f()) {
                        i5 = i5;
                    } else {
                        int iB = ((b) zVar2).a.b();
                        int i6 = 0;
                        while (i6 < iB) {
                            t0 t0VarD = ((b) zVar2).a.d(i6);
                            m mVar4 = t0VarD.d(iF, 1114111) ? t0VarD.a : null;
                            if (mVar4 != null) {
                                z zVar3 = zVar2;
                                D dE = zVar3.e();
                                if (dE != null) {
                                    dE = dE.c(interfaceC1227d.i() - this.e);
                                }
                                boolean z2 = iF == i4;
                                i = i6;
                                zVar = zVar2;
                                i3 = i5;
                                i2 = iB;
                                if (d(interfaceC1227d, new z(zVar3, mVar4, dE), q, z, true, z2)) {
                                    i5 = ((b) zVar).b;
                                    break;
                                }
                            } else {
                                i = i6;
                                i2 = iB;
                                zVar = zVar2;
                                i3 = i5;
                            }
                            i6 = i + 1;
                            zVar2 = zVar;
                            i5 = i3;
                            iB = i2;
                            i4 = -1;
                        }
                        i5 = i5;
                    }
                    i4 = -1;
                }
                if (q.isEmpty()) {
                    if (!q.h) {
                        b(mVar2, iF, l.c);
                    }
                    mVar3 = l.c;
                    mVar2 = mVar3;
                } else {
                    boolean z3 = q.h;
                    q.h = false;
                    m mVarC = c(q);
                    if (!z3) {
                        b(mVar2, iF, mVarC);
                    }
                    mVar2 = mVarC;
                }
            } else {
                mVar2 = mVar3;
            }
            if (mVar2 == l.c) {
                break;
            }
            if (iF != -1) {
                e(interfaceC1227d);
            }
            if (mVar2.d) {
                A a2 = this.j;
                a2.a = interfaceC1227d.i();
                a2.b = this.f;
                a2.c = this.g;
                a2.d = mVar2;
                if (iF == -1) {
                    break;
                }
            }
            iF = interfaceC1227d.f(1);
        }
        A a3 = this.j;
        m mVar5 = a3.d;
        if (mVar5 == null) {
            if (iF == -1 && interfaceC1227d.i() == this.e) {
                return -1;
            }
            throw new t(this.d, interfaceC1227d, this.e);
        }
        D d = mVar5.f;
        int i7 = this.e;
        int i8 = a3.a;
        int i9 = a3.b;
        int i10 = a3.c;
        interfaceC1227d.d(i8);
        this.f = i9;
        this.g = i10;
        if (d != null && (sVar = this.d) != null) {
            d.b(sVar, interfaceC1227d, i7);
        }
        return a3.d.e;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC1227d interfaceC1227d, int i) {
        this.i = i;
        interfaceC1227d.g();
        try {
            this.e = interfaceC1227d.i();
            A a = this.j;
            a.a = -1;
            a.b = 0;
            a.c = -1;
            a.d = null;
            com.github.catvod.spider.merge.Dw.k kVar = this.h[i];
            return kVar.b == null ? j(interfaceC1227d) : f(interfaceC1227d, kVar.b);
        } finally {
            interfaceC1227d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.Nx.r0>] */
    protected final int j(InterfaceC1227d interfaceC1227d) {
        m mVar = (m) this.a.i.get(this.i);
        w wVar = X.b;
        Q q = new Q();
        int i = 0;
        while (i < mVar.b()) {
            int i2 = i + 1;
            d(interfaceC1227d, new z(mVar.d(i).a, i2, wVar), q, false, false, false);
            i = i2;
        }
        boolean z = q.h;
        q.h = false;
        m mVarC = c(q);
        if (!z) {
            this.h[this.i].b = mVarC;
        }
        return f(interfaceC1227d, mVarC);
    }
}
