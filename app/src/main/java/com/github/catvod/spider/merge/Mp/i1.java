package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class i1 extends j1 {
    i1() {
        super(ZrJ.d("3C2D2F19292236332E23"), 8, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0847e0 c0847e0 = j1.a;
        if (c0838a.w()) {
            t.q(this);
            t.l(ZrJ.d("456C"));
            t.v(c0847e0);
            return;
        }
        if (c0838a.H()) {
            t.h(false);
            j1Var = j1.j;
        } else {
            boolean zE = c0838a.E('>');
            t.r(this);
            if (zE) {
                t.a(c0847e0);
                return;
            } else {
                t.f();
                t.n.k('/');
                j1Var = j1.Q;
            }
        }
        t.v(j1Var);
    }
}
