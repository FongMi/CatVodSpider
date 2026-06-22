package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0067z0 extends j1 {
    C0067z0() {
        super(oZP.d("341B03330537001B12170D39000A2832053B12031210193A010A13"), 38, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        O o;
        j1 j1Var;
        String strG = c0017a.g(true);
        if (strG.length() > 0) {
            t.k.n(strG);
        } else {
            t.k.z();
        }
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == 65535) {
                t.q(this);
                j1Var = j1.a;
            } else {
                if (cF == '&') {
                    int[] iArrE = t.e('\'', true);
                    O o2 = t.k;
                    if (iArrE != null) {
                        o2.o(iArrE);
                        return;
                    } else {
                        o2.m('&');
                        return;
                    }
                }
                if (cF != '\'') {
                    o = t.k;
                } else {
                    j1Var = j1.O;
                }
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        o = t.k;
        cF = 65533;
        o.m(cF);
    }
}
