package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum T0 extends j1 {
    T0() {
        super(oZP.d("310014351525103F0223003C1626132402211C091E241E0A110002230030241A18350931"), 56, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        StringBuilder sb;
        C0026e0 c0026e0 = j1.a;
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == '\"') {
                t.v(j1.g0);
                return;
            }
            if (cF == '>') {
                t.r(this);
            } else if (cF != 65535) {
                sb = t.m.f;
            } else {
                t.q(this);
            }
            t.m.h = true;
            t.o();
            t.v(c0026e0);
            return;
        }
        t.r(this);
        sb = t.m.f;
        cF = 65533;
        sb.append(cF);
    }
}
