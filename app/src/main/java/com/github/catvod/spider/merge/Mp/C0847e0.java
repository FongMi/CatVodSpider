package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0847e0 extends j1 {
    C0847e0() {
        super(ZrJ.d("3D223F2C"), 0, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        char cU = c0838a.u();
        if (cU == 0) {
            t.r(this);
            t.j(c0838a.f());
            return;
        }
        if (cU == '&') {
            j1Var = j1.b;
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
            j1Var = j1.h;
        }
        t.a(j1Var);
    }
}
