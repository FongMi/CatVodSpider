package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class W extends i1 {
    W() {
        super("RCDATAEndTagName", 12, null);
    }

    private void h(S s, C0973a c0973a) {
        s.l("</");
        s.m(s.h);
        c0973a.P();
        s.v(i1.d);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        if (c0973a.H()) {
            String strK = c0973a.k();
            s.k.q(strK);
            s.h.append(strK);
            return;
        }
        char cF = c0973a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            if (s.t()) {
                i1Var = i1.I;
                s.v(i1Var);
                return;
            }
            h(s, c0973a);
        }
        if (cF == '/') {
            if (s.t()) {
                i1Var = i1.Q;
                s.v(i1Var);
                return;
            }
            h(s, c0973a);
        }
        if (cF == '>' && s.t()) {
            s.p();
            i1Var = i1.b;
            s.v(i1Var);
            return;
        }
        h(s, c0973a);
    }
}
