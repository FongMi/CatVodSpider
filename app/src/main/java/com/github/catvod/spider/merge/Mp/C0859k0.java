package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0859k0 extends j1 {
    C0859k0() {
        super(ZrJ.d("2A20392438313D223F2C0D361A223B282C091C30383920241710222A26"), 24, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        if (c0838a.H()) {
            t.i();
            t.h.append(c0838a.u());
            t.l(ZrJ.d("45"));
            t.j(c0838a.u());
            j1Var = j1.B;
        } else if (!c0838a.E('/')) {
            t.j('<');
            t.v(j1.v);
            return;
        } else {
            t.i();
            j1Var = j1.z;
        }
        t.a(j1Var);
    }
}
