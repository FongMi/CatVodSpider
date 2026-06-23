package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0147m extends A {
    C0147m() {
        super("Initial", 0, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        r rVar = A.d;
        if (A.a(o)) {
            return true;
        }
        if (o.b()) {
            c0125b.F((I) o);
            return true;
        }
        if (!o.c()) {
            c0125b.j0(rVar);
            return c0125b.c(o);
        }
        J j = (J) o;
        com.github.catvod.spider.merge.C0.c0.i iVar = new com.github.catvod.spider.merge.C0.c0.i(c0125b.h.c(j.b.toString()), j.d.toString(), j.e.toString());
        iVar.L(j.c);
        c0125b.d.L(iVar);
        if (j.f) {
            c0125b.d.v0();
        }
        c0125b.j0(rVar);
        return true;
    }
}
