package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum A0 extends j1 {
    A0() {
        super("Rcdata", 2, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        char cU = c0217a.u();
        if (cU == 0) {
            t.r(this);
            c0217a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '&') {
            j1Var = j1.d;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    t.l(c0217a.h());
                    return;
                } else {
                    t.k(new L());
                    return;
                }
            }
            j1Var = j1.k;
        }
        t.a(j1Var);
    }
}
