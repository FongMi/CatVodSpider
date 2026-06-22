package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum S0 extends j1 {
    S0() {
        super(ZrJ.d("3B262D223A203D2C283931351C133E2F242C1A0A2F282631102522283A"), 55, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0847e0 c0847e0 = j1.a;
        char cF = c0838a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF == '\"') {
            j1Var = j1.e0;
        } else {
            if (cF != '\'') {
                if (cF == '>') {
                    t.r(this);
                } else if (cF != 65535) {
                    t.r(this);
                    t.m.h = true;
                    j1Var = j1.n0;
                } else {
                    t.q(this);
                }
                t.m.h = true;
                t.o();
                t.v(c0847e0);
                return;
            }
            j1Var = j1.f0;
        }
        t.v(j1Var);
    }
}
