package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0247p extends B {
    C0247p() {
        super("AfterAfterBody", 21, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        if (q.c()) {
            c0219b.L((J) q);
            return true;
        }
        if (q.d() || (q.g() && ((N) q).e.equals("html"))) {
            return c0219b.f0(q, B.g);
        }
        if (B.a(q)) {
            c0219b.K((I) q);
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
