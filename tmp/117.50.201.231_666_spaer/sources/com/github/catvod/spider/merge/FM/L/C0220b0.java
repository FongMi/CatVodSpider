package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0220b0 extends j1 {
    C0220b0() {
        super("ScriptDataLessthanSign", 16, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        char cF = c0217a.f();
        if (cF == '!') {
            t.l("<!");
            j1Var = j1.t;
        } else if (cF != '/') {
            t.l("<");
            if (cF != 65535) {
                c0217a.P();
                j1Var = j1.f;
            } else {
                t.q(this);
                j1Var = j1.a;
            }
        } else {
            t.i();
            j1Var = j1.r;
        }
        t.v(j1Var);
    }
}
