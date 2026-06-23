package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class V extends h1 {
    V() {
        super("RCDATAEndTagName", 12, null);
    }

    private void h(Q q, C0631a c0631a) {
        q.k("</");
        q.l(q.h);
        c0631a.G();
        q.u(h1.e);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        if (c0631a.C()) {
            String strJ = c0631a.j();
            q.i.o(strJ);
            q.h.append(strJ);
            return;
        }
        char cE = c0631a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (q.s()) {
                h1Var = h1.J;
                q.u(h1Var);
                return;
            }
            h(q, c0631a);
        }
        if (cE == '/') {
            if (q.s()) {
                h1Var = h1.R;
                q.u(h1Var);
                return;
            }
            h(q, c0631a);
        }
        if (cE == '>' && q.s()) {
            q.o();
            h1Var = h1.c;
            q.u(h1Var);
            return;
        }
        h(q, c0631a);
    }
}
