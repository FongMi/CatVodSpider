package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0238k0 extends j1 {
    C0238k0() {
        super("ScriptDataEscapedLessthanSign", 24, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        if (c0217a.H()) {
            t.i();
            t.h.append(c0217a.u());
            t.l("<");
            t.j(c0217a.u());
            j1Var = j1.B;
        } else if (!c0217a.E('/')) {
            t.j('<');
            t.v(j1.v);
            return;
        } else {
            t.i();
            j1Var = j1.z;
        }
        t.a(j1Var);
    }
}
