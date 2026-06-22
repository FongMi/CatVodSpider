package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum O0 extends j1 {
    O0() {
        super(oZP.d("370A112E1E303100143515251021162C09"), 51, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        P0 p0 = j1.a0;
        if (c0017a.H()) {
            t.g();
            t.v(p0);
            return;
        }
        char cF = c0017a.f();
        if (cF == 0) {
            t.r(this);
            t.g();
            t.m.d.append((char) 65533);
        } else {
            if (cF == ' ') {
                return;
            }
            if (cF == 65535) {
                t.q(this);
                t.g();
                t.m.h = true;
                t.o();
                t.v(j1.a);
                return;
            }
            if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                return;
            }
            t.g();
            t.m.d.append(cF);
        }
        t.v(p0);
    }
}
