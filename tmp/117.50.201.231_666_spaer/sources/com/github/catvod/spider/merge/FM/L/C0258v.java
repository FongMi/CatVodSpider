package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0258v extends B {
    C0258v() {
        super("InHeadNoscript", 4, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        I i;
        C0256u c0256u = B.d;
        if (q.d()) {
            c0219b.t(this);
        } else {
            if (q.g() && ((N) q).e.equals("html")) {
                return c0219b.f0(q, B.g);
            }
            if (!q.f() || !((M) q).e.equals("noscript")) {
                if (B.a(q) || q.c() || (q.g() && com.github.catvod.spider.merge.FM.J.b.c(((N) q).e, A.f))) {
                    return c0219b.f0(q, c0256u);
                }
                if (q.f() && ((M) q).e.equals("br")) {
                    c0219b.t(this);
                    i = new I();
                } else {
                    if ((q.g() && com.github.catvod.spider.merge.FM.J.b.c(((N) q).e, A.I)) || q.f()) {
                        c0219b.t(this);
                        return false;
                    }
                    c0219b.t(this);
                    i = new I();
                }
                i.k(q.toString());
                c0219b.K(i);
                return true;
            }
            c0219b.b0();
            c0219b.u0(c0256u);
        }
        return true;
    }
}
