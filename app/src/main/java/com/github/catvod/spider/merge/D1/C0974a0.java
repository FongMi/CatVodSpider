package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0974a0 extends i1 {
    C0974a0() {
        super("ScriptDataLessthanSign", 16, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        char cF = c0973a.f();
        if (cF == '!') {
            s.l("<!");
            i1Var = i1.u;
        } else if (cF != '/') {
            s.l("<");
            if (cF != 65535) {
                c0973a.P();
                i1Var = i1.g;
            } else {
                s.q(this);
                i1Var = i1.b;
            }
        } else {
            s.i();
            i1Var = i1.s;
        }
        s.v(i1Var);
    }
}
