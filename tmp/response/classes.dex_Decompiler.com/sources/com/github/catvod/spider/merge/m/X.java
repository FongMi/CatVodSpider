package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum X extends j1 {
    X() {
        super(oZP.d("272C33003814300113150D323B0E1A24"), 12, null);
    }

    private void h(T t, C0017a c0017a) {
        t.l(oZP.d("4940"));
        t.m(t.h);
        c0017a.P();
        t.v(j1.c);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        if (c0017a.H()) {
            String strK = c0017a.k();
            t.k.q(strK);
            t.h.append(strK);
            return;
        }
        char cF = c0017a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            if (t.t()) {
                j1Var = j1.H;
                t.v(j1Var);
                return;
            }
            h(t, c0017a);
        }
        if (cF == '/') {
            if (t.t()) {
                j1Var = j1.P;
                t.v(j1Var);
                return;
            }
            h(t, c0017a);
        }
        if (cF == '>' && t.t()) {
            t.p();
            j1Var = j1.a;
            t.v(j1Var);
            return;
        }
        h(t, c0017a);
    }
}
