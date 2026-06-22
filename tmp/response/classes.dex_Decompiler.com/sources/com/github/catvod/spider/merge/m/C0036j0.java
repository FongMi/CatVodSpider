package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0036j0 extends j1 {
    C0036j0() {
        super(oZP.d("260C05281C21310E03202926160E07240811141C1F050D261D"), 23, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0032h0 c0032h0 = j1.v;
        if (c0017a.w()) {
            t.q(this);
            t.v(j1.a);
            return;
        }
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.j(cF);
                return;
            }
            if (cF != '<') {
                t.j(cF);
                if (cF == '>') {
                    j1Var = j1.f;
                }
            } else {
                j1Var = j1.y;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        t.j((char) 65533);
        t.v(c0032h0);
    }
}
