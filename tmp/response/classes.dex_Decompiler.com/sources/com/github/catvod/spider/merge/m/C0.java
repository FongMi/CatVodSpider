package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0 extends j1 {
    C0() {
        super(oZP.d("340903241E14011B05280E20010A21200020103006340321100B"), 40, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        C0026e0 c0026e0 = j1.a;
        C0057u0 c0057u0 = j1.H;
        char cF = c0017a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF == '/') {
                t.v(j1.P);
                return;
            }
            if (cF == '>') {
                t.p();
            } else if (cF != 65535) {
                c0017a.P();
                t.r(this);
            } else {
                t.q(this);
            }
            t.v(c0026e0);
            return;
        }
        t.v(c0057u0);
    }
}
