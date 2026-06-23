package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class A0 extends j1 {
    A0() {
        super(ZrJ.d("2B202F2C3C24"), 2, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        char cU = c0838a.u();
        if (cU == 0) {
            t.r(this);
            c0838a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '&') {
            j1Var = j1.d;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    t.l(c0838a.h());
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
