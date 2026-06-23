package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class h1 extends i1 {
    h1() {
        super("EndTagOpen", 8, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        C0980d0 c0980d0 = i1.b;
        if (c0973a.w()) {
            s.q(this);
            s.l("</");
            s.v(c0980d0);
            return;
        }
        if (c0973a.H()) {
            s.h(false);
            i1Var = i1.k;
        } else {
            boolean zE = c0973a.E('>');
            s.r(this);
            if (zE) {
                s.a(c0980d0);
                return;
            } else {
                s.f();
                s.n.k('/');
                i1Var = i1.R;
            }
        }
        s.v(i1Var);
    }
}
