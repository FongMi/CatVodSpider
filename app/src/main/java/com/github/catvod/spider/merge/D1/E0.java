package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum E0 extends i1 {
    E0() {
        super("MarkupDeclarationOpen", 43, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        if (c0973a.C("--")) {
            s.n.h();
            i1Var = i1.T;
        } else if (c0973a.D("DOCTYPE")) {
            i1Var = i1.Z;
        } else if (c0973a.C("[CDATA[")) {
            s.i();
            i1Var = i1.p0;
        } else {
            s.r(this);
            s.f();
            i1Var = i1.R;
        }
        s.v(i1Var);
    }
}
