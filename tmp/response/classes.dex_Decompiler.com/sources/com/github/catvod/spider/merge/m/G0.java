package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum G0 extends j1 {
    G0() {
        super(oZP.d("36001A2C093B013C03201E21"), 44, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        C0026e0 c0026e0 = j1.a;
        I0 i0 = j1.U;
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.v(j1.T);
                return;
            }
            if (cF == '>') {
                t.r(this);
            } else if (cF != 65535) {
                c0017a.P();
            } else {
                t.q(this);
            }
            t.n();
            t.v(c0026e0);
            return;
        }
        t.r(this);
        t.n.k((char) 65533);
        t.v(i0);
    }
}
