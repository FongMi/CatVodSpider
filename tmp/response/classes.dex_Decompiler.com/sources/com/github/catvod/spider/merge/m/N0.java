package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum N0 extends j1 {
    N0() {
        super(oZP.d("31001435152510"), 50, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        O0 o0 = j1.Z;
        char cF = c0017a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF != '>') {
                if (cF != 65535) {
                    t.r(this);
                } else {
                    t.q(this);
                }
            }
            t.r(this);
            t.g();
            t.m.h = true;
            t.o();
            t.v(j1.a);
            return;
        }
        t.v(o0);
    }
}
