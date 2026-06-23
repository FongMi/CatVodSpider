package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class X extends j1 {
    X() {
        super(ZrJ.d("2B000F0C1C043C2D2F19292237222628"), 12, null);
    }

    private void h(T t, C0838a c0838a) {
        t.l(ZrJ.d("456C"));
        t.m(t.h);
        c0838a.P();
        t.v(j1.c);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        if (c0838a.H()) {
            String strK = c0838a.k();
            t.k.q(strK);
            t.h.append(strK);
            return;
        }
        char cF = c0838a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            if (t.t()) {
                j1Var = j1.H;
                t.v(j1Var);
                return;
            }
            h(t, c0838a);
        }
        if (cF == '/') {
            if (t.t()) {
                j1Var = j1.P;
                t.v(j1Var);
                return;
            }
            h(t, c0838a);
        }
        if (cF == '>' && t.t()) {
            t.p();
            j1Var = j1.a;
            t.v(j1Var);
            return;
        }
        h(t, c0838a);
    }
}
