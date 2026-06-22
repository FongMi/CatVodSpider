package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.KW.S;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class x extends C<E, S> {
    protected p d = new p();
    protected H e;
    protected final com.github.catvod.spider.merge.Bk.i f;
    protected y g;
    protected boolean h;
    private w i;
    protected List<com.github.catvod.spider.merge.cz.c> j;
    protected boolean k;

    static {
        new WeakHashMap();
    }

    public x(H h) {
        com.github.catvod.spider.merge.Bk.i iVar = new com.github.catvod.spider.merge.Bk.i();
        this.f = iVar;
        iVar.a(0);
        this.h = true;
        this.e = null;
        p pVar = this.d;
        pVar.a = false;
        pVar.c = null;
        pVar.b = -1;
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
        this.e = h;
    }

    @Override // com.github.catvod.spider.merge.yZ.C
    public final boolean h(int i) {
        com.github.catvod.spider.merge.Bk.i iVar = this.f;
        return i >= iVar.c(iVar.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    public final E j() {
        E eO = o();
        if (eO.getType() != -1) {
            this.e.j();
        }
        ?? r1 = this.j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                y yVar = this.g;
                com.github.catvod.spider.merge.cz.a aVar = new com.github.catvod.spider.merge.cz.a(eO);
                yVar.getClass();
                yVar.g(aVar);
                ?? r12 = this.j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((com.github.catvod.spider.merge.cz.c) it.next()).a();
                    }
                }
            } else {
                y yVar2 = this.g;
                com.github.catvod.spider.merge.cz.g gVar = new com.github.catvod.spider.merge.cz.g(eO);
                yVar2.getClass();
                yVar2.g(gVar);
                ?? r13 = this.j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((com.github.catvod.spider.merge.cz.c) it2.next()).l(gVar);
                    }
                }
            }
        }
        return eO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.b>] */
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

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
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
            for (com.github.catvod.spider.merge.cz.c cVar : r2) {
                cVar.n(this.g);
                this.g.h(cVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    public final void m() {
        y yVar;
        E eF;
        if (this.k) {
            yVar = this.g;
            eF = this.e.f(1);
        } else {
            yVar = this.g;
            eF = this.e.f(-1);
        }
        yVar.f = eF;
        ?? r0 = this.j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                com.github.catvod.spider.merge.cz.c cVar = (com.github.catvod.spider.merge.cz.c) this.j.get(size);
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

    public final E o() {
        return this.e.f(1);
    }

    public final int p() {
        if (this.f.d()) {
            return -1;
        }
        return this.f.c(r0.f() - 1);
    }

    public final E q(int i) {
        E eO = o();
        if (eO.getType() == i) {
            if (i == -1) {
                this.k = true;
            }
            this.d.i();
            j();
        } else {
            eO = this.d.g(this);
            if (this.h && eO.c() == -1) {
                y yVar = this.g;
                com.github.catvod.spider.merge.cz.a aVar = new com.github.catvod.spider.merge.cz.a(eO);
                yVar.getClass();
                yVar.g(aVar);
            }
        }
        return eO;
    }

    public final void r(E e, String str, A a) {
        ((z) e()).a(this, e, e.getLine(), e.a(), str, a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.cz.c>] */
    public final void s(com.github.catvod.spider.merge.cz.c cVar) {
        ?? r0 = this.j;
        if (r0 != 0 && r0.remove(cVar) && this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void t(p pVar) {
        this.d = pVar;
    }
}
