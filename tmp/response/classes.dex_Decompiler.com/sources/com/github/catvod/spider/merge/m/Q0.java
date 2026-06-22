package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum Q0 extends j1 {
    Q0() {
        super(oZP.d("340903241E111A0C03381C303B0E1A24"), 53, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0026e0 c0026e0 = j1.a;
        if (c0017a.w()) {
            t.q(this);
            t.m.h = true;
            t.o();
            t.v(c0026e0);
            return;
        }
        if (c0017a.F('\t', '\n', '\r', '\f', ' ')) {
            c0017a.a();
            return;
        }
        if (c0017a.E('>')) {
            t.o();
            t.a(c0026e0);
            return;
        }
        String strD = oZP.d("253A350D2516");
        if (c0017a.D(strD)) {
            t.m.e = strD;
            j1Var = j1.c0;
        } else {
            String strD2 = oZP.d("263624152918");
            if (!c0017a.D(strD2)) {
                t.r(this);
                t.m.h = true;
                t.a(j1.n0);
                return;
            }
            t.m.e = strD2;
            j1Var = j1.i0;
        }
        t.v(j1Var);
    }
}
