package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0264y extends B {
    C0264y() {
        super("Text", 7, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        if (q.b()) {
            c0219b.K((I) q);
            return true;
        }
        if (q.e()) {
            c0219b.t(this);
            c0219b.b0();
            c0219b.u0(c0219b.a0());
            return c0219b.g(q);
        }
        if (!q.f()) {
            return true;
        }
        c0219b.b0();
        c0219b.u0(c0219b.a0());
        return true;
    }
}
