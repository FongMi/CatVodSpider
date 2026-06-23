package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class Q0 extends j1 {
    Q0() {
        super(ZrJ.d("38253F283A0116203F34382037222628"), 53, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0847e0 c0847e0 = j1.a;
        if (c0838a.w()) {
            t.q(this);
            t.m.h = true;
            t.o();
            t.v(c0847e0);
            return;
        }
        if (c0838a.F('\t', '\n', '\r', '\f', ' ')) {
            c0838a.a();
            return;
        }
        if (c0838a.E('>')) {
            t.o();
            t.a(c0847e0);
            return;
        }
        String strD = ZrJ.d("291609010106");
        if (c0838a.D(strD)) {
            t.m.e = strD;
            j1Var = j1.c0;
        } else {
            String strD2 = ZrJ.d("2A1A18190D08");
            if (!c0838a.D(strD2)) {
                t.r(this);
                t.m.h = true;
                t.a(j1.n0);
                return;
            }
            t.m.e = strD2;
            j1Var = j1.i0;
        }
        t.v(j1Var);
    }
}
