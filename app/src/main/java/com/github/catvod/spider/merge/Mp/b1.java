package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum b1 extends j1 {
    b1() {
        super(ZrJ.d("3D2C283931351C10323E3C20140A2F282631102522283A1A0A2A252A2420283624392D21"), 63, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        StringBuilder sb;
        C0847e0 c0847e0 = j1.a;
        char cF = c0838a.f();
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
            t.v(c0847e0);
            return;
        }
        t.r(this);
        sb = t.m.g;
        cF = 65533;
        sb.append(cF);
    }
}
