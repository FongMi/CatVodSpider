package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0226e0 extends j1 {
    C0226e0() {
        super("Data", 0, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        char cU = c0217a.u();
        if (cU == 0) {
            t.r(this);
            t.j(c0217a.f());
            return;
        }
        if (cU == '&') {
            j1Var = j1.b;
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
            j1Var = j1.h;
        }
        t.a(j1Var);
    }
}
