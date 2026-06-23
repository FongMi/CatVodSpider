package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0232h0 extends j1 {
    C0232h0() {
        super("ScriptDataEscaped", 21, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        if (c0217a.w()) {
            t.q(this);
            t.v(j1.a);
            return;
        }
        char cU = c0217a.u();
        if (cU == 0) {
            t.r(this);
            c0217a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '-') {
            t.j('-');
            j1Var = j1.w;
        } else {
            if (cU != '<') {
                t.l(c0217a.q('-', '<', 0));
                return;
            }
            j1Var = j1.y;
        }
        t.a(j1Var);
    }
}
