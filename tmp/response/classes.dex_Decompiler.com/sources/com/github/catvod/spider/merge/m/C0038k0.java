package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0038k0 extends j1 {
    C0038k0() {
        super(oZP.d("260C05281C21310E03202926160E07240819101C043504341B3C1E2602"), 24, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        if (c0017a.H()) {
            t.i();
            t.h.append(c0017a.u());
            t.l(oZP.d("49"));
            t.j(c0017a.u());
            j1Var = j1.B;
        } else if (!c0017a.E('/')) {
            t.j('<');
            t.v(j1.v);
            return;
        } else {
            t.i();
            j1Var = j1.z;
        }
        t.a(j1Var);
    }
}
