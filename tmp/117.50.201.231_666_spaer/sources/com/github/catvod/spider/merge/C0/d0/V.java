package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum V extends h1 {
    V() {
        super("RCDATAEndTagName", 12, null);
    }

    private void h(Q q, C0123a c0123a) {
        q.k("</");
        q.l(q.h);
        c0123a.G();
        q.u(h1.e);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        if (c0123a.C()) {
            String strJ = c0123a.j();
            q.i.o(strJ);
            q.h.append(strJ);
            return;
        }
        char cE = c0123a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (q.s()) {
                h1Var = h1.J;
                q.u(h1Var);
                return;
            }
            h(q, c0123a);
        }
        if (cE == '/') {
            if (q.s()) {
                h1Var = h1.R;
                q.u(h1Var);
                return;
            }
            h(q, c0123a);
        }
        if (cE == '>' && q.s()) {
            q.o();
            h1Var = h1.c;
            q.u(h1Var);
            return;
        }
        h(q, c0123a);
    }
}
