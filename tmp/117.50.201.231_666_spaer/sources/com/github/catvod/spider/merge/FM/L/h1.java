package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum h1 extends j1 {
    h1() {
        super("TagOpen", 7, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        j1 j1Var2;
        char cU = c0217a.u();
        if (cU == '!') {
            j1Var = j1.R;
        } else {
            if (cU != '/') {
                if (cU == '?') {
                    t.f();
                    j1Var2 = j1.Q;
                } else if (c0217a.H()) {
                    t.h(true);
                    j1Var2 = j1.j;
                } else {
                    t.r(this);
                    t.j('<');
                    j1Var2 = j1.a;
                }
                t.v(j1Var2);
                return;
            }
            j1Var = j1.i;
        }
        t.a(j1Var);
    }
}
