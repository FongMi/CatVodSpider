package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0254t extends B {
    C0254t() {
        super("BeforeHead", 2, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        if (B.a(q)) {
            c0219b.K((I) q);
            return true;
        }
        if (q.c()) {
            c0219b.L((J) q);
            return true;
        }
        if (q.d()) {
            c0219b.t(this);
            return false;
        }
        if (q.g() && ((N) q).e.equals("html")) {
            return B.g.d(q, c0219b);
        }
        if (q.g()) {
            N n = (N) q;
            if (n.e.equals("head")) {
                c0219b.r0(c0219b.J(n));
                c0219b.u0(B.d);
                return true;
            }
        }
        if (q.f() && com.github.catvod.spider.merge.FM.J.b.c(((M) q).e, A.e)) {
            c0219b.j("head");
            return c0219b.g(q);
        }
        if (q.f()) {
            c0219b.t(this);
            return false;
        }
        c0219b.j("head");
        return c0219b.g(q);
    }
}
