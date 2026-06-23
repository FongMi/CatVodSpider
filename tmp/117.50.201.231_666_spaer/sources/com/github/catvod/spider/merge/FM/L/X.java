package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum X extends j1 {
    X() {
        super("RCDATAEndTagName", 12, null);
    }

    private void h(T t, C0217a c0217a) {
        t.l("</");
        t.m(t.h);
        c0217a.P();
        t.v(j1.c);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        if (c0217a.H()) {
            String strK = c0217a.k();
            t.k.q(strK);
            t.h.append(strK);
            return;
        }
        char cF = c0217a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            if (t.t()) {
                j1Var = j1.H;
                t.v(j1Var);
                return;
            }
            h(t, c0217a);
        }
        if (cF == '/') {
            if (t.t()) {
                j1Var = j1.P;
                t.v(j1Var);
                return;
            }
            h(t, c0217a);
        }
        if (cF == '>' && t.t()) {
            t.p();
            j1Var = j1.a;
            t.v(j1Var);
            return;
        }
        h(t, c0217a);
    }
}
