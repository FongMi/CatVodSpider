package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum i1 extends j1 {
    i1() {
        super("EndTagOpen", 8, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0226e0 c0226e0 = j1.a;
        if (c0217a.w()) {
            t.q(this);
            t.l("</");
            t.v(c0226e0);
            return;
        }
        if (c0217a.H()) {
            t.h(false);
            j1Var = j1.j;
        } else {
            boolean zE = c0217a.E('>');
            t.r(this);
            if (zE) {
                t.a(c0226e0);
                return;
            } else {
                t.f();
                t.n.k('/');
                j1Var = j1.Q;
            }
        }
        t.v(j1Var);
    }
}
