package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum h1 extends j1 {
    h1() {
        super(oZP.d("210E100E1C301B"), 7, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        j1 j1Var2;
        char cU = c0017a.u();
        if (cU == '!') {
            j1Var = j1.R;
        } else {
            if (cU != '/') {
                if (cU == '?') {
                    t.f();
                    j1Var2 = j1.Q;
                } else if (c0017a.H()) {
                    t.h(true);
                    j1Var2 = j1.j;
                } else {
                    t.r(this);
                    t.j('<');
                    j1Var2 = j1.a;
                }
                t.v(j1Var2);
                return;
            }
            j1Var = j1.i;
        }
        t.a(j1Var);
    }
}
