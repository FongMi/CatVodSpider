package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class G0 extends j1 {
    G0() {
        super(ZrJ.d("3A2C26202D2B0D103F2C3A31"), 44, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        C0847e0 c0847e0 = j1.a;
        I0 i0 = j1.U;
        char cF = c0838a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.v(j1.T);
                return;
            }
            if (cF == '>') {
                t.r(this);
            } else if (cF != 65535) {
                c0838a.P();
            } else {
                t.q(this);
            }
            t.n();
            t.v(c0847e0);
            return;
        }
        t.r(this);
        t.n.k((char) 65533);
        t.v(i0);
    }
}
