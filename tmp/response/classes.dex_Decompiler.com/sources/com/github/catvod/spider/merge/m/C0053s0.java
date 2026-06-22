package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0053s0 extends j1 {
    C0053s0() {
        super(oZP.d("260C05281C21310E0320283A000D1B242926160E07240819101C043504341B3C1E2602"), 31, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        if (!c0017a.E('/')) {
            t.v(j1.C);
            return;
        }
        t.j('/');
        t.i();
        t.a(j1.G);
    }
}
