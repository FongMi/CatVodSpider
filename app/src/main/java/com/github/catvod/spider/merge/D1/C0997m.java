package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0997m extends EnumC0969B {
    C0997m() {
        super("Initial", 0, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        C1008s c1008s = EnumC0969B.c;
        if (EnumC0969B.a(p)) {
            return true;
        }
        if (p.c()) {
            c0975b.J((J) p);
        } else {
            if (!p.d()) {
                c0975b.s0(c1008s);
                return c0975b.e(p);
            }
            K k = (K) p;
            com.github.catvod.spider.merge.c1.i iVar = new com.github.catvod.spider.merge.c1.i(c0975b.h.d(k.d.toString()), k.f.toString(), k.g.toString());
            iVar.N(k.e);
            c0975b.d.K(iVar);
            if (k.h) {
                c0975b.d.F0();
            }
            c0975b.s0(c1008s);
        }
        return true;
    }
}
