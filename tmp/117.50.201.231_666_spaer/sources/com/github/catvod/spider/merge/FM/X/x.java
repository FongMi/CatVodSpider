package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.y.S;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class x extends AbstractC0425C<InterfaceC0427E, S> {
    protected C0449p d = new C0449p();
    protected InterfaceC0430H e;
    protected final com.github.catvod.spider.merge.FM.A.i f;
    protected y g;
    protected boolean h;
    private w i;
    protected List<com.github.catvod.spider.merge.FM.B.c> j;
    protected boolean k;

    static {
        new WeakHashMap();
    }

    public x(InterfaceC0430H interfaceC0430H) {
        com.github.catvod.spider.merge.FM.A.i iVar = new com.github.catvod.spider.merge.FM.A.i();
        this.f = iVar;
        iVar.a(0);
        this.h = true;
        this.e = null;
        C0449p c0449p = this.d;
        c0449p.a = false;
        c0449p.c = null;
        c0449p.b = -1;
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
        this.e = interfaceC0430H;
    }

    @Override // com.github.catvod.spider.merge.FM.x.AbstractC0425C
    public final boolean h(int i) {
        com.github.catvod.spider.merge.FM.A.i iVar = this.f;
        return i >= iVar.c(iVar.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    public final InterfaceC0427E j() {
        InterfaceC0427E interfaceC0427EO = o();
        if (interfaceC0427EO.getType() != -1) {
            this.e.j();
        }
        ?? r1 = this.j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                y yVar = this.g;
                com.github.catvod.spider.merge.FM.B.a aVar = new com.github.catvod.spider.merge.FM.B.a(interfaceC0427EO);
                yVar.getClass();
                yVar.g(aVar);
                ?? r12 = this.j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((com.github.catvod.spider.merge.FM.B.c) it.next()).a();
                    }
                }
            } else {
                y yVar2 = this.g;
                com.github.catvod.spider.merge.FM.B.g gVar = new com.github.catvod.spider.merge.FM.B.g(interfaceC0427EO);
                yVar2.getClass();
                yVar2.g(gVar);
                ?? r13 = this.j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((com.github.catvod.spider.merge.FM.B.c) it2.next()).R(gVar);
                    }
                }
            }
        }
        return interfaceC0427EO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.b>] */
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

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    public final void l(y yVar, int i) {
        i(i);
        this.g = yVar;
        yVar.e = this.e.g(1);
        if (this.h) {
            y yVar2 = this.g;
            y yVar3 = (y) yVar2.a;
            if (yVar3 != null) {
                yVar3.g(yVar2);
            }
        }
        ?? r2 = this.j;
        if (r2 != 0) {
            for (com.github.catvod.spider.merge.FM.B.c cVar : r2) {
                cVar.c(this.g);
                this.g.h(cVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    public final void m() {
        y yVar;
        InterfaceC0427E interfaceC0427EG;
        if (this.k) {
            yVar = this.g;
            interfaceC0427EG = this.e.g(1);
        } else {
            yVar = this.g;
            interfaceC0427EG = this.e.g(-1);
        }
        yVar.f = interfaceC0427EG;
        ?? r0 = this.j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                com.github.catvod.spider.merge.FM.B.c cVar = (com.github.catvod.spider.merge.FM.B.c) this.j.get(size);
                this.g.i(cVar);
                cVar.X(this.g);
            }
        }
        i(this.g.b);
        this.g = (y) this.g.a;
    }

    public final y n() {
        return this.g;
    }

    public final InterfaceC0427E o() {
        return this.e.g(1);
    }

    public final int p() {
        if (this.f.d()) {
            return -1;
        }
        return this.f.c(r0.f() - 1);
    }

    public final InterfaceC0427E q(int i) {
        InterfaceC0427E interfaceC0427EO = o();
        if (interfaceC0427EO.getType() == i) {
            if (i == -1) {
                this.k = true;
            }
            this.d.i();
            j();
        } else {
            interfaceC0427EO = this.d.g(this);
            if (this.h && interfaceC0427EO.c() == -1) {
                y yVar = this.g;
                com.github.catvod.spider.merge.FM.B.a aVar = new com.github.catvod.spider.merge.FM.B.a(interfaceC0427EO);
                yVar.getClass();
                yVar.g(aVar);
            }
        }
        return interfaceC0427EO;
    }

    public final void r(InterfaceC0427E interfaceC0427E, String str, C0423A c0423a) {
        ((z) e()).b(this, interfaceC0427E, interfaceC0427E.getLine(), interfaceC0427E.a(), str, c0423a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.FM.B.c>] */
    public final void s(com.github.catvod.spider.merge.FM.B.c cVar) {
        ?? r0 = this.j;
        if (r0 != 0 && r0.remove(cVar) && this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void t(C0449p c0449p) {
        this.d = c0449p;
    }
}
