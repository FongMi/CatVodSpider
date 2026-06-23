package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class h1 extends j1 {
    h1() {
        super(ZrJ.d("2D222C02382017"), 7, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        j1 j1Var2;
        char cU = c0838a.u();
        if (cU == '!') {
            j1Var = j1.R;
        } else {
            if (cU != '/') {
                if (cU == '?') {
                    t.f();
                    j1Var2 = j1.Q;
                } else if (c0838a.H()) {
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
