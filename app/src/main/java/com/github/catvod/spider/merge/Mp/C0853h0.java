package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0853h0 extends j1 {
    C0853h0() {
        super(ZrJ.d("2A20392438313D223F2C0D361A223B282C"), 21, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        if (c0838a.w()) {
            t.q(this);
            t.v(j1.a);
            return;
        }
        char cU = c0838a.u();
        if (cU == 0) {
            t.r(this);
            c0838a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '-') {
            t.j('-');
            j1Var = j1.w;
        } else {
            if (cU != '<') {
                t.l(c0838a.q('-', '<', 0));
                return;
            }
            j1Var = j1.y;
        }
        t.a(j1Var);
    }
}
