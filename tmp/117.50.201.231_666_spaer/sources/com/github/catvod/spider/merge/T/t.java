package com.github.catvod.spider.merge.t;

import com.github.catvod.spider.merge.u.M;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class t extends x<z, M> {
    protected m d = new m();
    protected InterfaceC0621C e;
    protected final com.github.catvod.spider.merge.w.g f;
    protected u g;
    protected boolean h;
    private a i;
    protected List<com.github.catvod.spider.merge.x.c> j;
    protected boolean k;

    public class a implements com.github.catvod.spider.merge.x.c {
    }

    static {
        new WeakHashMap();
    }

    public t(InterfaceC0621C interfaceC0621C) {
        com.github.catvod.spider.merge.w.g gVar = new com.github.catvod.spider.merge.w.g();
        this.f = gVar;
        gVar.a(0);
        this.h = true;
        this.e = null;
        m mVar = this.d;
        mVar.a = false;
        mVar.c = null;
        mVar.b = -1;
        this.g = null;
        this.k = false;
        r(this.i);
        this.i = null;
        gVar.b();
        gVar.a(0);
        ATNInterpreter atninterpreter = this.b;
        if (atninterpreter != 0) {
            atninterpreter.a();
        }
        this.e = interfaceC0621C;
    }

    @Override // com.github.catvod.spider.merge.t.x
    public final boolean g(int i) {
        com.github.catvod.spider.merge.w.g gVar = this.f;
        return i >= gVar.c(gVar.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    public final z i() {
        z zVarN = n();
        if (zVarN.getType() != -1) {
            this.e.i();
        }
        ?? r1 = this.j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                u uVar = this.g;
                com.github.catvod.spider.merge.x.a aVar = new com.github.catvod.spider.merge.x.a(zVarN);
                uVar.getClass();
                uVar.g(aVar);
                ?? r12 = this.j;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((com.github.catvod.spider.merge.x.c) it.next()).a();
                    }
                }
            } else {
                u uVar2 = this.g;
                com.github.catvod.spider.merge.x.g gVar = new com.github.catvod.spider.merge.x.g(zVarN);
                uVar2.getClass();
                uVar2.g(gVar);
                ?? r13 = this.j;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((com.github.catvod.spider.merge.x.c) it2.next()).Z(gVar);
                    }
                }
            }
        }
        return zVarN;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.b>] */
    public final void j(u uVar) {
        u uVar2;
        u uVar3;
        if (this.h && (uVar2 = this.g) != uVar && (uVar3 = (u) uVar2.a) != null) {
            ?? r1 = uVar3.d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            uVar3.g(uVar);
        }
        this.g = uVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    public final void k(u uVar, int i) {
        h(i);
        this.g = uVar;
        uVar.e = this.e.f(1);
        if (this.h) {
            u uVar2 = this.g;
            u uVar3 = (u) uVar2.a;
            if (uVar3 != null) {
                uVar3.g(uVar2);
            }
        }
        ?? r2 = this.j;
        if (r2 != 0) {
            for (com.github.catvod.spider.merge.x.c cVar : r2) {
                cVar.V(this.g);
                this.g.h(cVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    public final void l() {
        u uVar;
        z zVarF;
        if (this.k) {
            uVar = this.g;
            zVarF = this.e.f(1);
        } else {
            uVar = this.g;
            zVarF = this.e.f(-1);
        }
        uVar.f = zVarF;
        ?? r0 = this.j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                com.github.catvod.spider.merge.x.c cVar = (com.github.catvod.spider.merge.x.c) this.j.get(size);
                this.g.i(cVar);
                cVar.e0(this.g);
            }
        }
        h(this.g.b);
        this.g = (u) this.g.a;
    }

    public final u m() {
        return this.g;
    }

    public final z n() {
        return this.e.f(1);
    }

    public final int o() {
        if (this.f.d()) {
            return -1;
        }
        return this.f.c(r0.f() - 1);
    }

    public final z p(int i) {
        z zVarN = n();
        if (zVarN.getType() == i) {
            if (i == -1) {
                this.k = true;
            }
            this.d.i();
            i();
        } else {
            zVarN = this.d.g(this);
            if (this.h && zVarN.c() == -1) {
                u uVar = this.g;
                com.github.catvod.spider.merge.x.a aVar = new com.github.catvod.spider.merge.x.a(zVarN);
                uVar.getClass();
                uVar.g(aVar);
            }
        }
        return zVarN;
    }

    public final void q(z zVar, String str, w wVar) {
        ((v) d()).d(this, zVar, zVar.getLine(), zVar.a(), str, wVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.x.c>] */
    public final void r(com.github.catvod.spider.merge.x.c cVar) {
        ?? r0 = this.j;
        if (r0 != 0 && r0.remove(cVar) && this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void s(m mVar) {
        this.d = mVar;
    }
}
