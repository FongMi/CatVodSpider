package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum M0 extends j1 {
    M0() {
        super(oZP.d("36001A2C093B012A19252E341B08"), 49, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        C0026e0 c0026e0 = j1.a;
        I0 i0 = j1.U;
        char cF = c0017a.f();
        String strD = oZP.d("584256");
        if (cF != 0) {
            if (cF == '-') {
                t.n.l(strD);
                t.v(j1.V);
                return;
            }
            if (cF != '>') {
                if (cF != 65535) {
                    J j = t.n;
                    j.l(strD);
                    j.k(cF);
                } else {
                    t.q(this);
                }
            }
            t.n();
            t.v(c0026e0);
            return;
        }
        t.r(this);
        J j2 = t.n;
        j2.l(strD);
        j2.k((char) 65533);
        t.v(i0);
    }
}
