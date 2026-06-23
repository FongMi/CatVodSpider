package com.github.catvod.spider.merge.C0.h0;

import com.github.catvod.spider.merge.C0.c0.l;
import com.github.catvod.spider.merge.C0.e0.C0180g;
import com.github.catvod.spider.merge.C0.x.b;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {
    private C0180g a;
    private boolean b = false;
    private d c;

    private d(l lVar) {
        C0180g c0180g = new C0180g();
        this.a = c0180g;
        c0180g.add(lVar);
    }

    private d(C0180g c0180g) {
        C0180g c0180g2 = new C0180g();
        this.a = c0180g2;
        c0180g2.addAll(c0180g);
    }

    public static d b(l lVar) {
        return new d(lVar);
    }

    public static d c(C0180g c0180g) {
        return new d(c0180g);
    }

    public static d d(d dVar) {
        d dVar2 = new d(dVar.a);
        dVar2.c = dVar;
        return dVar2;
    }

    public final C0180g a() {
        return this.a;
    }

    public final d e() {
        return this.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.b = false;
    }

    final void h() {
        this.b = true;
    }

    public final void i(C0180g c0180g) {
        this.a = c0180g;
    }

    public final d j(d dVar) {
        this.c = dVar;
        return this;
    }

    public final l k() {
        if (this.a.size() != 1) {
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("current context is more than one el,total = ");
            sbB.append(this.a.size());
            throw new b(sbB.toString());
        }
        C0180g c0180g = this.a;
        if (c0180g.isEmpty()) {
            return null;
        }
        return c0180g.get(0);
    }
}
