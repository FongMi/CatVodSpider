package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0841b0 extends j1 {
    C0841b0() {
        super(ZrJ.d("2A20392438313D223F2C04200A303F25292B2A2A2C23"), 16, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        char cF = c0838a.f();
        if (cF == '!') {
            t.l(ZrJ.d("4562"));
            j1Var = j1.t;
        } else if (cF != '/') {
            t.l(ZrJ.d("45"));
            if (cF != 65535) {
                c0838a.P();
                j1Var = j1.f;
            } else {
                t.q(this);
                j1Var = j1.a;
            }
        } else {
            t.i();
            j1Var = j1.r;
        }
        t.v(j1Var);
    }
}
