package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum P0 extends j1 {
    P0() {
        super(ZrJ.d("3D2C283931351C0D2A202D"), 52, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        StringBuilder sb;
        C0847e0 c0847e0 = j1.a;
        if (c0838a.J()) {
            t.m.d.append(c0838a.k());
            return;
        }
        char cF = c0838a.f();
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
                t.v(c0847e0);
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
