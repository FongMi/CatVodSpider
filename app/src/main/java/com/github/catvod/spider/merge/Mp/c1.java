package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum c1 extends j1 {
    c1() {
        super(ZrJ.d("38253F283A0116203F3438202A3A38392D2830272E233C2C1F2A2E3F"), 64, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        C0847e0 c0847e0 = j1.a;
        char cF = c0838a.f();
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
        t.v(c0847e0);
    }
}
