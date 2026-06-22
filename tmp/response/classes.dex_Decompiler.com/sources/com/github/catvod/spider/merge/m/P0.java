package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum P0 extends j1 {
    P0() {
        super(oZP.d("3100143515251021162C09"), 52, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        StringBuilder sb;
        C0026e0 c0026e0 = j1.a;
        if (c0017a.J()) {
            t.m.d.append(c0017a.k());
            return;
        }
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF != ' ') {
                if (cF != '>') {
                    if (cF == 65535) {
                        t.q(this);
                        t.m.h = true;
                    } else if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                        sb = t.m.d;
                    }
                }
                t.o();
                t.v(c0026e0);
                return;
            }
            t.v(j1.b0);
            return;
        }
        t.r(this);
        sb = t.m.d;
        cF = 65533;
        sb.append(cF);
    }
}
