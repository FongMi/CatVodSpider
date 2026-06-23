package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.P.InterfaceC0122d;
import com.github.catvod.spider.merge.C0.P.s;
import com.github.catvod.spider.merge.C0.P.t;
import com.github.catvod.spider.merge.C0.R.b;
import com.github.catvod.spider.merge.C0.R.e;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class B extends l {
    protected final s d;
    protected int e;
    protected int f;
    protected int g;
    public final b[] h;
    protected int i;
    protected final A j;

    public B(s sVar, a aVar, b[] bVarArr, Y y) {
        super(aVar, y);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new A();
        this.h = bVarArr;
        this.d = sVar;
    }

    @Override // com.github.catvod.spider.merge.C0.Q.l
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

    protected final void b(e eVar, int i, e eVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (eVar) {
            if (eVar.c == null) {
                eVar.c = new e[128];
            }
            eVar.c[i + 0] = eVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.C0.R.e, com.github.catvod.spider.merge.C0.R.e>] */
    protected final e c(f fVar) {
        b bVar = null;
        e eVar = new e(fVar);
        Iterator<b> it = fVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.a instanceof e0) {
                bVar = next;
                break;
            }
        }
        if (bVar != null) {
            eVar.d = true;
            eVar.f = ((z) bVar).e();
            eVar.e = this.a.g[bVar.a.c];
        }
        b bVar2 = this.h[this.i];
        synchronized (bVar2.a) {
            e eVar2 = (e) bVar2.a.get(eVar);
            if (eVar2 != null) {
                return eVar2;
            }
            eVar.a = bVar2.a.size();
            fVar.c = true;
            fVar.d = null;
            eVar.b = fVar;
            bVar2.a.put(eVar, eVar);
            return eVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00af A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean d(com.github.catvod.spider.merge.C0.P.InterfaceC0122d r10, com.github.catvod.spider.merge.C0.Q.z r11, com.github.catvod.spider.merge.C0.Q.f r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.Q.B.d(com.github.catvod.spider.merge.C0.P.d, com.github.catvod.spider.merge.C0.Q.z, com.github.catvod.spider.merge.C0.Q.f, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC0122d interfaceC0122d) {
        if (interfaceC0122d.f(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC0122d.j();
    }

    protected final int f(InterfaceC0122d interfaceC0122d, e eVar) throws Throwable {
        int i;
        s sVar;
        int i2;
        if (eVar.d) {
            A a = this.j;
            a.a = interfaceC0122d.i();
            a.b = this.f;
            a.c = this.g;
            a.d = eVar;
        }
        int iF = interfaceC0122d.f(1);
        while (true) {
            i = iF;
            e[] eVarArr = eVar.c;
            e eVar2 = (eVarArr == null || i < 0 || i > 127) ? null : eVarArr[i + 0];
            if (eVar2 == null) {
                Q q = new Q();
                int i3 = 0;
                for (z zVar : eVar.b) {
                    boolean z = ((b) zVar).b == i3;
                    if (z && zVar.f()) {
                        i2 = i3;
                    } else {
                        int iB = ((b) zVar).a.b();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= iB) {
                                i2 = i3;
                                break;
                            }
                            t0 t0VarD = ((b) zVar).a.d(i4);
                            m mVar = t0VarD.d(i, 1114111) ? t0VarD.a : null;
                            if (mVar != null) {
                                z zVar2 = zVar;
                                D dE = zVar2.e();
                                if (dE != null) {
                                    dE = dE.c(interfaceC0122d.i() - this.e);
                                }
                                if (d(interfaceC0122d, new z(zVar2, mVar, dE), q, z, true, i == -1)) {
                                    i2 = ((b) zVar).b;
                                    break;
                                }
                            }
                            i4++;
                        }
                    }
                    i3 = i2;
                }
                if (q.isEmpty()) {
                    if (!q.h) {
                        b(eVar, i, l.c);
                    }
                    eVar = l.c;
                } else {
                    boolean z2 = q.h;
                    q.h = false;
                    e eVarC = c(q);
                    if (!z2) {
                        b(eVar, i, eVarC);
                    }
                    eVar = eVarC;
                }
            } else {
                eVar = eVar2;
            }
            if (eVar == l.c) {
                break;
            }
            if (i != -1) {
                e(interfaceC0122d);
            }
            if (eVar.d) {
                A a2 = this.j;
                a2.a = interfaceC0122d.i();
                a2.b = this.f;
                a2.c = this.g;
                a2.d = eVar;
                if (i == -1) {
                    break;
                }
            }
            iF = interfaceC0122d.f(1);
        }
        A a3 = this.j;
        e eVar3 = a3.d;
        if (eVar3 == null) {
            if (i == -1 && interfaceC0122d.i() == this.e) {
                return -1;
            }
            throw new t(this.d, interfaceC0122d, this.e);
        }
        D d = eVar3.f;
        int i5 = this.e;
        int i6 = a3.a;
        int i7 = a3.b;
        int i8 = a3.c;
        interfaceC0122d.d(i6);
        this.f = i7;
        this.g = i8;
        if (d != null && (sVar = this.d) != null) {
            d.b(sVar, interfaceC0122d, i5);
        }
        return a3.d.e;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC0122d interfaceC0122d, int i) {
        this.i = i;
        interfaceC0122d.g();
        try {
            this.e = interfaceC0122d.i();
            A a = this.j;
            a.a = -1;
            a.b = 0;
            a.c = -1;
            a.d = null;
            b bVar = this.h[i];
            return bVar.b == null ? j(interfaceC0122d) : f(interfaceC0122d, bVar.b);
        } finally {
            interfaceC0122d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.r0>] */
    protected final int j(InterfaceC0122d interfaceC0122d) {
        m mVar = (m) this.a.i.get(this.i);
        w wVar = X.b;
        Q q = new Q();
        int i = 0;
        while (i < mVar.b()) {
            int i2 = i + 1;
            d(interfaceC0122d, new z(mVar.d(i).a, i2, wVar), q, false, false, false);
            i = i2;
        }
        boolean z = q.h;
        q.h = false;
        e eVarC = c(q);
        if (!z) {
            this.h[this.i].b = eVarC;
        }
        return f(interfaceC0122d, eVarC);
    }
}
