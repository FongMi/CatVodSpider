package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0 extends j1 {
    C0() {
        super(ZrJ.d("38253F283A040D3739242A300D261D2C24301C1C3A3827311C27"), 40, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        C0847e0 c0847e0 = j1.a;
        C0878u0 c0878u0 = j1.H;
        char cF = c0838a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF == '/') {
                t.v(j1.P);
                return;
            }
            if (cF == '>') {
                t.p();
            } else if (cF != 65535) {
                c0838a.P();
                t.r(this);
            } else {
                t.q(this);
            }
            t.v(c0847e0);
            return;
        }
        t.v(c0878u0);
    }
}
