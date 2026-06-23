package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class O0 extends j1 {
    O0() {
        super(ZrJ.d("3B262D223A203D2C283931351C0D2A202D"), 51, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        P0 p0 = j1.a0;
        if (c0838a.H()) {
            t.g();
            t.v(p0);
            return;
        }
        char cF = c0838a.f();
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
