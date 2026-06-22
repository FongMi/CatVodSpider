package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0046o0 extends j1 {
    C0046o0() {
        super(oZP.d("260C05281C21310E0320283A000D1B242926160E072408"), 28, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        char cU = c0017a.u();
        if (cU == 0) {
            t.r(this);
            c0017a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '-') {
            t.j(cU);
            j1Var = j1.D;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    t.l(c0017a.q('-', '<', 0));
                    return;
                } else {
                    t.q(this);
                    t.v(j1.a);
                    return;
                }
            }
            t.j(cU);
            j1Var = j1.F;
        }
        t.a(j1Var);
    }
}
