package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.ej.C1061g;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {
    private C1061g a;
    private boolean b = false;
    private c c;

    private c(com.github.catvod.spider.merge.Em.l lVar) {
        C1061g c1061g = new C1061g();
        this.a = c1061g;
        c1061g.add(lVar);
    }

    private c(C1061g c1061g) {
        C1061g c1061g2 = new C1061g();
        this.a = c1061g2;
        c1061g2.addAll(c1061g);
    }

    public static c b(com.github.catvod.spider.merge.Em.l lVar) {
        return new c(lVar);
    }

    public static c c(C1061g c1061g) {
        return new c(c1061g);
    }

    public static c d(c cVar) {
        c cVar2 = new c(cVar.a);
        cVar2.c = cVar;
        return cVar2;
    }

    public final C1061g a() {
        return this.a;
    }

    public final c e() {
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

    public final void i(C1061g c1061g) {
        this.a = c1061g;
    }

    public final c j(c cVar) {
        this.c = cVar;
        return this;
    }

    public final com.github.catvod.spider.merge.Em.l k() {
        if (this.a.size() != 1) {
            StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("current context is more than one el,total = ");
            sbB.append(this.a.size());
            throw new t(sbB.toString());
        }
        C1061g c1061g = this.a;
        if (c1061g.isEmpty()) {
            return null;
        }
        return c1061g.get(0);
    }
}
