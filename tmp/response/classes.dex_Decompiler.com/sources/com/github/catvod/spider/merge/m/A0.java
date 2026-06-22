package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum A0 extends j1 {
    A0() {
        super(oZP.d("270C13201834"), 2, null);
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
        if (cU == '&') {
            j1Var = j1.d;
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
            j1Var = j1.k;
        }
        t.a(j1Var);
    }
}
