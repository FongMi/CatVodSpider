package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0235j extends B {
    C0235j() {
        super("InSelectInTable", 16, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        if (q.g() && com.github.catvod.spider.merge.FM.J.b.c(((N) q).e, A.G)) {
            c0219b.t(this);
            c0219b.c0("select");
            c0219b.o0();
            return c0219b.g(q);
        }
        if (q.f()) {
            M m = (M) q;
            if (com.github.catvod.spider.merge.FM.J.b.c(m.e, A.G)) {
                c0219b.t(this);
                if (!c0219b.I(m.e)) {
                    return false;
                }
                c0219b.c0("select");
                c0219b.o0();
                return c0219b.g(q);
            }
        }
        return c0219b.f0(q, B.p);
    }
}
