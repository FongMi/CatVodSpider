package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0239l extends B {
    C0239l() {
        super("AfterBody", 18, null);
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
            return c0219b.f0(q, B.g);
        }
        if (q.f() && ((M) q).e.equals("html")) {
            c0219b.getClass();
            if (c0219b.Y("html")) {
                c0219b.c0("html");
            }
            c0219b.u0(B.v);
            return true;
        }
        if (q.e()) {
            return true;
        }
        c0219b.t(this);
        c0219b.n0();
        return c0219b.g(q);
    }
}
