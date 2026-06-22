package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.z.S;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class x extends AbstractC0248C<InterfaceC0250E, S> {
    protected C0272p d = new C0272p();
    protected InterfaceC0253H e;
    protected final com.github.catvod.spider.merge.B.i f;
    protected y g;
    protected boolean h;
    private w i;
    protected List<com.github.catvod.spider.merge.C.c> j;
    protected boolean k;

    static {
        new WeakHashMap();
    }

    public x(InterfaceC0253H interfaceC0253H) {
        com.github.catvod.spider.merge.B.i iVar = new com.github.catvod.spider.merge.B.i();
        this.f = iVar;
        iVar.a(0);
        this.h = true;
        this.e = null;
        C0272p c0272p = this.d;
        c0272p.a = false;
        c0272p.c = null;
        c0272p.b = -1;
        this.g = null;
        this.k = false;
        s(this.i);
        this.i = null;
        iVar.b();
        iVar.a(0);
        ATNInterpreter atninterpreter = this.b;
        if (atninterpreter != 0) {
            atninterpreter.a();
        }
        this.e = interfaceC0253H;
    }

    @Override // com.github.catvod.spider.merge.y.AbstractC0248C
    public final boolean h(int i) {
        com.github.catvod.spider.merge.B.i iVar = this.f;
        return i >= iVar.c(iVar.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    public final InterfaceC0250E j() {
        InterfaceC0250E interfaceC0250EO = o();
        if (interfaceC0250EO.getType() != -1) {
            this.e.j();
        }
        ?? r1 = this.j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                y yVar = this.g;
                com.github.catvod.spider.merge.C.a aVar = new com.github.catvod.spider.merge.C.a(interfaceC0250EO);
                yVar.getClass();
                yVar.g(aVar);
                ?? r12 = this.j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((com.github.catvod.spider.merge.C.c) it.next()).a();
                    }
                }
            } else {
                y yVar2 = this.g;
                com.github.catvod.spider.merge.C.g gVar = new com.github.catvod.spider.merge.C.g(interfaceC0250EO);
                yVar2.getClass();
                yVar2.g(gVar);
                ?? r13 = this.j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((com.github.catvod.spider.merge.C.c) it2.next()).l(gVar);
                    }
                }
            }
        }
        return interfaceC0250EO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.b>] */
    public final void k(y yVar) {
        y yVar2;
        y yVar3;
        if (this.h && (yVar2 = this.g) != yVar && (yVar3 = (y) yVar2.a) != null) {
            ?? r1 = yVar3.d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            yVar3.g(yVar);
        }
        this.g = yVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    public final void l(y yVar, int i) {
        i(i);
        this.g = yVar;
        yVar.e = this.e.f(1);
        if (this.h) {
            y yVar2 = this.g;
            y yVar3 = (y) yVar2.a;
            if (yVar3 != null) {
                yVar3.g(yVar2);
            }
        }
        ?? r2 = this.j;
        if (r2 != 0) {
            for (com.github.catvod.spider.merge.C.c cVar : r2) {
                cVar.n(this.g);
                this.g.h(cVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    public final void m() {
        y yVar;
        InterfaceC0250E interfaceC0250EF;
        if (this.k) {
            yVar = this.g;
            interfaceC0250EF = this.e.f(1);
        } else {
            yVar = this.g;
            interfaceC0250EF = this.e.f(-1);
        }
        yVar.f = interfaceC0250EF;
        ?? r0 = this.j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                com.github.catvod.spider.merge.C.c cVar = (com.github.catvod.spider.merge.C.c) this.j.get(size);
                this.g.i(cVar);
                cVar.E(this.g);
            }
        }
        i(this.g.b);
        this.g = (y) this.g.a;
    }

    public final y n() {
        return this.g;
    }

    public final InterfaceC0250E o() {
        return this.e.f(1);
    }

    public final int p() {
        if (this.f.d()) {
            return -1;
        }
        return this.f.c(r0.f() - 1);
    }

    public final InterfaceC0250E q(int i) {
        InterfaceC0250E interfaceC0250EO = o();
        if (interfaceC0250EO.getType() == i) {
            if (i == -1) {
                this.k = true;
            }
            this.d.i();
            j();
        } else {
            interfaceC0250EO = this.d.g(this);
            if (this.h && interfaceC0250EO.c() == -1) {
                y yVar = this.g;
                com.github.catvod.spider.merge.C.a aVar = new com.github.catvod.spider.merge.C.a(interfaceC0250EO);
                yVar.getClass();
                yVar.g(aVar);
            }
        }
        return interfaceC0250EO;
    }

    public final void r(InterfaceC0250E interfaceC0250E, String str, C0246A c0246a) {
        ((z) e()).a(this, interfaceC0250E, interfaceC0250E.getLine(), interfaceC0250E.a(), str, c0246a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C.c>] */
    public final void s(com.github.catvod.spider.merge.C.c cVar) {
        ?? r0 = this.j;
        if (r0 != 0 && r0.remove(cVar) && this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void t(C0272p c0272p) {
        this.d = c0272p;
    }
}
