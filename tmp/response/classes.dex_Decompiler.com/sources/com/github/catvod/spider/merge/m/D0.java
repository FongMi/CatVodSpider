package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum D0 extends j1 {
    D0() {
        super(oZP.d("260A1B272F391A1C1E2F0B06010E0535383412"), 41, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        C0026e0 c0026e0 = j1.a;
        char cF = c0017a.f();
        if (cF == '>') {
            t.k.m = true;
            t.p();
        } else {
            if (cF != 65535) {
                c0017a.P();
                t.r(this);
                t.v(j1.H);
                return;
            }
            t.q(this);
        }
        t.v(c0026e0);
    }
}
