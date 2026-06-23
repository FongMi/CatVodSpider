package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1023z0 extends i1 {
    C1023z0() {
        super("Rcdata", 2, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        char cU = c0973a.u();
        if (cU == 0) {
            s.r(this);
            c0973a.a();
            s.j((char) 65533);
            return;
        }
        if (cU == '&') {
            i1Var = i1.e;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    s.l(c0973a.h());
                    return;
                } else {
                    s.k(new L());
                    return;
                }
            }
            i1Var = i1.l;
        }
        s.a(i1Var);
    }
}
