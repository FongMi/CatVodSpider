package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0857j0 extends j1 {
    C0857j0() {
        super(ZrJ.d("2A20392438313D223F2C0D361A223B282C0118302309293611"), 23, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0853h0 c0853h0 = j1.v;
        if (c0838a.w()) {
            t.q(this);
            t.v(j1.a);
            return;
        }
        char cF = c0838a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.j(cF);
                return;
            }
            if (cF != '<') {
                t.j(cF);
                if (cF == '>') {
                    j1Var = j1.f;
                }
            } else {
                j1Var = j1.y;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        t.j((char) 65533);
        t.v(c0853h0);
    }
}
