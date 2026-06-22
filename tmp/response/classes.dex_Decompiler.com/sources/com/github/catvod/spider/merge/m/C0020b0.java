package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0020b0 extends j1 {
    C0020b0() {
        super(oZP.d("260C05281C21310E03202030061C03290D3B2606102F"), 16, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        char cF = c0017a.f();
        if (cF == '!') {
            t.l(oZP.d("494E"));
            j1Var = j1.t;
        } else if (cF != '/') {
            t.l(oZP.d("49"));
            if (cF != 65535) {
                c0017a.P();
                j1Var = j1.f;
            } else {
                t.q(this);
                j1Var = j1.a;
            }
        } else {
            t.i();
            j1Var = j1.r;
        }
        t.v(j1Var);
    }
}
