package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0886y0 extends j1 {
    C0886y0() {
        super(ZrJ.d("38373F3F21270C372E1B29290C26142927301B2F2E1C3D2A0D262F"), 37, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        O o;
        j1 j1Var;
        String strG = c0838a.g(false);
        if (strG.length() > 0) {
            t.k.n(strG);
        } else {
            t.k.z();
        }
        char cF = c0838a.f();
        if (cF != 0) {
            if (cF == '\"') {
                j1Var = j1.O;
            } else {
                if (cF == '&') {
                    int[] iArrE = t.e('\"', true);
                    O o2 = t.k;
                    if (iArrE != null) {
                        o2.o(iArrE);
                        return;
                    } else {
                        o2.m('&');
                        return;
                    }
                }
                if (cF != 65535) {
                    o = t.k;
                } else {
                    t.q(this);
                    j1Var = j1.a;
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
