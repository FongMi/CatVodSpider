package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0252s extends B {
    C0252s() {
        super("BeforeHtml", 1, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        C0254t c0254t = B.c;
        if (q.d()) {
            c0219b.t(this);
            return false;
        }
        if (q.c()) {
            c0219b.L((J) q);
            return true;
        }
        if (B.a(q)) {
            c0219b.K((I) q);
            return true;
        }
        if (q.g()) {
            N n = (N) q;
            if (n.e.equals("html")) {
                c0219b.J(n);
                c0219b.u0(c0254t);
                return true;
            }
        }
        if (!(q.f() && com.github.catvod.spider.merge.FM.J.b.c(((M) q).e, A.e)) && q.f()) {
            c0219b.t(this);
            return false;
        }
        c0219b.R();
        c0219b.u0(c0254t);
        return c0219b.g(q);
    }
}
