package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum c1 extends j1 {
    c1() {
        super(oZP.d("340903241E111A0C03381C302616043509383C0B122F183C13061233"), 64, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        C0026e0 c0026e0 = j1.a;
        char cF = c0017a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF != '>') {
            if (cF != 65535) {
                t.r(this);
                t.v(j1.n0);
                return;
            } else {
                t.q(this);
                t.m.h = true;
            }
        }
        t.o();
        t.v(c0026e0);
    }
}
