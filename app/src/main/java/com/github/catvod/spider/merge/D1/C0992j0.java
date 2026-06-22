package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0992j0 extends i1 {
    C0992j0() {
        super("ScriptDataEscapedLessthanSign", 24, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        if (c0973a.H()) {
            s.i();
            s.h.append(c0973a.u());
            s.l("<");
            s.j(c0973a.u());
            i1Var = i1.C;
        } else if (!c0973a.E('/')) {
            s.j('<');
            s.v(i1.w);
            return;
        } else {
            s.i();
            i1Var = i1.A;
        }
        s.a(i1Var);
    }
}
