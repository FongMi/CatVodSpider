package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0988h0 extends i1 {
    C0988h0() {
        super("ScriptDataEscapedDash", 22, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        C0986g0 c0986g0 = i1.w;
        if (c0973a.w()) {
            s.q(this);
            s.v(i1.b);
            return;
        }
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '-') {
                s.j(cF);
                i1Var = i1.y;
            } else if (cF == '<') {
                i1Var = i1.z;
            }
            s.v(i1Var);
            return;
        }
        s.r(this);
        cF = 65533;
        s.j(cF);
        s.v(c0986g0);
    }
}
