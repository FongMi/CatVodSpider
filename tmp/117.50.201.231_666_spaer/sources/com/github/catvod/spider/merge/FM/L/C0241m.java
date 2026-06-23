package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0241m extends B {
    C0241m() {
        super("Initial", 0, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        C0252s c0252s = B.b;
        if (B.a(q)) {
            return true;
        }
        if (q.c()) {
            c0219b.L((J) q);
        } else {
            if (!q.d()) {
                c0219b.u0(c0252s);
                return c0219b.g(q);
            }
            K k = (K) q;
            com.github.catvod.spider.merge.FM.K.i iVar = new com.github.catvod.spider.merge.FM.K.i(c0219b.h.d(k.k()), k.f.toString(), k.g.toString());
            iVar.L(k.e);
            c0219b.d.L(iVar);
            if (k.h) {
                c0219b.d.D0();
            }
            c0219b.u0(c0252s);
        }
        return true;
    }
}
