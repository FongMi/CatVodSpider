package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0026e0 extends j1 {
    C0026e0() {
        super(oZP.d("310E0320"), 0, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        char cU = c0017a.u();
        if (cU == 0) {
            t.r(this);
            t.j(c0017a.f());
            return;
        }
        if (cU == '&') {
            j1Var = j1.b;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    t.l(c0017a.h());
                    return;
                } else {
                    t.k(new L());
                    return;
                }
            }
            j1Var = j1.h;
        }
        t.a(j1Var);
    }
}
