package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0855i0 extends j1 {
    C0855i0() {
        super(ZrJ.d("2A20392438313D223F2C0D361A223B282C01183023"), 22, null);
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
                j1Var = j1.x;
            } else if (cF == '<') {
                j1Var = j1.y;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        cF = 65533;
        t.j(cF);
        t.v(c0853h0);
    }
}
