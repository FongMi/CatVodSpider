package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.InterfaceC0437d;
import com.github.catvod.spider.merge.FM.z.C0485b;
import com.github.catvod.spider.merge.FM.z.C0488e;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0453B extends AbstractC0470l {
    protected final com.github.catvod.spider.merge.FM.x.t d;
    protected int e;
    protected int f;
    protected int g;
    public final C0485b[] h;
    protected int i;
    protected final C0452A j;

    public C0453B(com.github.catvod.spider.merge.FM.x.t tVar, C0459a c0459a, C0485b[] c0485bArr, Y y) {
        super(c0459a, y);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new C0452A();
        this.h = c0485bArr;
        this.d = tVar;
    }

    @Override // com.github.catvod.spider.merge.FM.y.AbstractC0470l
    public final void a() {
        C0452A c0452a = this.j;
        c0452a.a = -1;
        c0452a.b = 0;
        c0452a.c = -1;
        c0452a.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    protected final void b(C0488e c0488e, int i, C0488e c0488e2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c0488e) {
            if (c0488e.c == null) {
                c0488e.c = new C0488e[128];
            }
            c0488e.c[i + 0] = c0488e2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    protected final C0488e c(C0464f c0464f) {
        C0460b next;
        C0488e c0488e = new C0488e(c0464f);
        Iterator<C0460b> it = c0464f.iterator();
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
            c0488e.d = true;
            c0488e.f = ((C0483z) next).e();
            c0488e.e = this.a.g[next.a.c];
        }
        C0485b c0485b = this.h[this.i];
        synchronized (c0485b.a) {
            C0488e c0488e2 = (C0488e) c0485b.a.get(c0488e);
            if (c0488e2 != null) {
                return c0488e2;
            }
            c0488e.a = c0485b.a.size();
            c0464f.a = true;
            c0464f.b = null;
            c0488e.b = c0464f;
            c0485b.a.put(c0488e, c0488e);
            return c0488e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean d(com.github.catvod.spider.merge.FM.x.InterfaceC0437d r16, com.github.catvod.spider.merge.FM.y.C0483z r17, com.github.catvod.spider.merge.FM.y.C0464f r18, boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.y.C0453B.d(com.github.catvod.spider.merge.FM.x.d, com.github.catvod.spider.merge.FM.y.z, com.github.catvod.spider.merge.FM.y.f, boolean, boolean, boolean):boolean");
    }

    public final void e(InterfaceC0437d interfaceC0437d) {
        if (interfaceC0437d.h(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        interfaceC0437d.j();
    }

    protected final int f(InterfaceC0437d interfaceC0437d, C0488e c0488e) throws Throwable {
        com.github.catvod.spider.merge.FM.x.t tVar;
        int i;
        int i2;
        C0460b c0460b;
        int i3;
        if (c0488e.d) {
            C0452A c0452a = this.j;
            c0452a.a = interfaceC0437d.i();
            c0452a.b = this.f;
            c0452a.c = this.g;
            c0452a.d = c0488e;
        }
        C0488e c0488e2 = c0488e;
        int iH = interfaceC0437d.h(1);
        while (true) {
            C0488e[] c0488eArr = c0488e2.c;
            C0488e c0488e3 = (c0488eArr == null || iH < 0 || iH > 127) ? null : c0488eArr[iH + 0];
            int i4 = -1;
            if (c0488e3 == null) {
                Q q = new Q();
                int i5 = 0;
                for (C0460b c0460b2 : c0488e2.b) {
                    boolean z = c0460b2.b == i5;
                    if (z && ((C0483z) c0460b2).f()) {
                        i5 = i5;
                    } else {
                        int iB = c0460b2.a.b();
                        int i6 = 0;
                        while (i6 < iB) {
                            t0 t0VarD = c0460b2.a.d(i6);
                            AbstractC0471m abstractC0471m = t0VarD.d(iH, 1114111) ? t0VarD.a : null;
                            if (abstractC0471m != null) {
                                C0483z c0483z = (C0483z) c0460b2;
                                C0455D c0455dE = c0483z.e();
                                if (c0455dE != null) {
                                    c0455dE = c0455dE.c(interfaceC0437d.i() - this.e);
                                }
                                boolean z2 = iH == i4;
                                i = i6;
                                c0460b = c0460b2;
                                i3 = i5;
                                i2 = iB;
                                if (d(interfaceC0437d, new C0483z(c0483z, abstractC0471m, c0455dE), q, z, true, z2)) {
                                    i5 = c0460b.b;
                                    break;
                                }
                            } else {
                                i = i6;
                                i2 = iB;
                                c0460b = c0460b2;
                                i3 = i5;
                            }
                            i6 = i + 1;
                            c0460b2 = c0460b;
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
                        b(c0488e2, iH, AbstractC0470l.c);
                    }
                    c0488e3 = AbstractC0470l.c;
                    c0488e2 = c0488e3;
                } else {
                    boolean z3 = q.f;
                    q.f = false;
                    C0488e c0488eC = c(q);
                    if (!z3) {
                        b(c0488e2, iH, c0488eC);
                    }
                    c0488e2 = c0488eC;
                }
            } else {
                c0488e2 = c0488e3;
            }
            if (c0488e2 == AbstractC0470l.c) {
                break;
            }
            if (iH != -1) {
                e(interfaceC0437d);
            }
            if (c0488e2.d) {
                C0452A c0452a2 = this.j;
                c0452a2.a = interfaceC0437d.i();
                c0452a2.b = this.f;
                c0452a2.c = this.g;
                c0452a2.d = c0488e2;
                if (iH == -1) {
                    break;
                }
            }
            iH = interfaceC0437d.h(1);
        }
        C0452A c0452a3 = this.j;
        C0488e c0488e4 = c0452a3.d;
        if (c0488e4 == null) {
            if (iH == -1 && interfaceC0437d.i() == this.e) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.FM.x.u(this.d, interfaceC0437d, this.e);
        }
        C0455D c0455d = c0488e4.f;
        int i7 = this.e;
        int i8 = c0452a3.a;
        int i9 = c0452a3.b;
        int i10 = c0452a3.c;
        interfaceC0437d.f(i8);
        this.f = i9;
        this.g = i10;
        if (c0455d != null && (tVar = this.d) != null) {
            c0455d.b(tVar, interfaceC0437d, i7);
        }
        return c0452a3.d.e;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.f;
    }

    public final int i(InterfaceC0437d interfaceC0437d, int i) {
        this.i = i;
        interfaceC0437d.d();
        try {
            this.e = interfaceC0437d.i();
            C0452A c0452a = this.j;
            c0452a.a = -1;
            c0452a.b = 0;
            c0452a.c = -1;
            c0452a.d = null;
            C0485b c0485b = this.h[i];
            return c0485b.b == null ? j(interfaceC0437d) : f(interfaceC0437d, c0485b.b);
        } finally {
            interfaceC0437d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.y.r0>] */
    protected final int j(InterfaceC0437d interfaceC0437d) {
        AbstractC0471m abstractC0471m = (AbstractC0471m) this.a.i.get(this.i);
        C0480w c0480w = X.b;
        Q q = new Q();
        int i = 0;
        while (i < abstractC0471m.b()) {
            int i2 = i + 1;
            d(interfaceC0437d, new C0483z(abstractC0471m.d(i).a, i2, c0480w), q, false, false, false);
            i = i2;
        }
        boolean z = q.f;
        q.f = false;
        C0488e c0488eC = c(q);
        if (!z) {
            this.h[this.i].b = c0488eC;
        }
        return f(interfaceC0437d, c0488eC);
    }
}
