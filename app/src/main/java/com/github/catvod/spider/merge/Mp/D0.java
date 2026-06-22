package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum D0 extends j1 {
    D0() {
        super(ZrJ.d("2A26272B0B29163022232F160D2239391C241E"), 41, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        C0847e0 c0847e0 = j1.a;
        char cF = c0838a.f();
        if (cF == '>') {
            t.k.m = true;
            t.p();
        } else {
            if (cF != 65535) {
                c0838a.P();
                t.r(this);
                t.v(j1.H);
                return;
            }
            t.q(this);
        }
        t.v(c0847e0);
    }
}
