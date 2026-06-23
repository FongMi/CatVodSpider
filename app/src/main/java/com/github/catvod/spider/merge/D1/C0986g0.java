package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0986g0 extends i1 {
    C0986g0() {
        super("ScriptDataEscaped", 21, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        if (c0973a.w()) {
            s.q(this);
            s.v(i1.b);
            return;
        }
        char cU = c0973a.u();
        if (cU == 0) {
            s.r(this);
            c0973a.a();
            s.j((char) 65533);
            return;
        }
        if (cU == '-') {
            s.j('-');
            i1Var = i1.x;
        } else {
            if (cU != '<') {
                s.l(c0973a.q('-', '<', 0));
                return;
            }
            i1Var = i1.z;
        }
        s.a(i1Var);
    }
}
