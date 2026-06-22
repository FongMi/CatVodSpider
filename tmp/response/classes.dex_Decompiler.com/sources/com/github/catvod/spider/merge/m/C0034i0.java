package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0034i0 extends j1 {
    C0034i0() {
        super(oZP.d("260C05281C21310E03202926160E07240811141C1F"), 22, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0032h0 c0032h0 = j1.v;
        if (c0017a.w()) {
            t.q(this);
            t.v(j1.a);
            return;
        }
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.j(cF);
                j1Var = j1.x;
            } else if (cF == '<') {
                j1Var = j1.y;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        cF = 65533;
        t.j(cF);
        t.v(c0032h0);
    }
}
