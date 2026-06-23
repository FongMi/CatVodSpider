package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0249q extends B {
    C0249q() {
        super("AfterAfterFrameset", 22, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        if (q.c()) {
            c0219b.L((J) q);
            return true;
        }
        if (q.d() || B.a(q) || (q.g() && ((N) q).e.equals("html"))) {
            return c0219b.f0(q, B.g);
        }
        if (q.e()) {
            return true;
        }
        if (q.g() && ((N) q).e.equals("noframes")) {
            return c0219b.f0(q, B.d);
        }
        c0219b.t(this);
        return false;
    }
}
