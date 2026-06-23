package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0990i0 extends i1 {
    C0990i0() {
        super("ScriptDataEscapedDashDash", 23, null);
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
                return;
            }
            if (cF != '<') {
                s.j(cF);
                if (cF == '>') {
                    i1Var = i1.g;
                }
            } else {
                i1Var = i1.z;
            }
            s.v(i1Var);
            return;
        }
        s.r(this);
        s.j((char) 65533);
        s.v(c0986g0);
    }
}
