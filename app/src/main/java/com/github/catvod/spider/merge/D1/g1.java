package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum g1 extends i1 {
    g1() {
        super("TagOpen", 7, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        i1 i1Var2;
        char cU = c0973a.u();
        if (cU == '!') {
            i1Var = i1.S;
        } else {
            if (cU != '/') {
                if (cU == '?') {
                    s.f();
                    i1Var2 = i1.R;
                } else if (c0973a.H()) {
                    s.h(true);
                    i1Var2 = i1.k;
                } else {
                    s.r(this);
                    s.j('<');
                    i1Var2 = i1.b;
                }
                s.v(i1Var2);
                return;
            }
            i1Var = i1.j;
        }
        s.a(i1Var);
    }
}
