package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum b1 extends j1 {
    b1() {
        super(oZP.d("310014351525103C0E3218301826132402211C091E241E0A060619260030241A18350931"), 63, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        StringBuilder sb;
        C0026e0 c0026e0 = j1.a;
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == '\'') {
                t.v(j1.m0);
                return;
            }
            if (cF == '>') {
                t.r(this);
            } else if (cF != 65535) {
                sb = t.m.g;
            } else {
                t.q(this);
            }
            t.m.h = true;
            t.o();
            t.v(c0026e0);
            return;
        }
        t.r(this);
        sb = t.m.g;
        cF = 65533;
        sb.append(cF);
    }
}
