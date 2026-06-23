package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0223d extends B {
    C0223d() {
        super("InCaption", 10, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        if (q.f()) {
            M m = (M) q;
            if (m.e.equals("caption")) {
                if (!c0219b.I(m.e)) {
                    c0219b.t(this);
                    return false;
                }
                c0219b.x(false);
                if (!c0219b.b("caption")) {
                    c0219b.t(this);
                }
                c0219b.c0("caption");
                c0219b.n();
                c0219b.u0(B.i);
                return true;
            }
        }
        if ((q.g() && com.github.catvod.spider.merge.FM.J.b.c(((N) q).e, A.y)) || (q.f() && ((M) q).e.equals("table"))) {
            c0219b.t(this);
            if (c0219b.h("caption")) {
                return c0219b.g(q);
            }
            return true;
        }
        if (!q.f() || !com.github.catvod.spider.merge.FM.J.b.c(((M) q).e, A.J)) {
            return c0219b.f0(q, B.g);
        }
        c0219b.t(this);
        return false;
    }
}
