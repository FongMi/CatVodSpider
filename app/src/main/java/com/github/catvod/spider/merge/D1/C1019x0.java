package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1019x0 extends i1 {
    C1019x0() {
        super("AttributeValue_doubleQuoted", 37, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        O o;
        i1 i1Var;
        String strG = c0973a.g(false);
        if (strG.length() > 0) {
            s.k.n(strG);
        } else {
            s.k.z();
        }
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '\"') {
                i1Var = i1.P;
            } else {
                if (cF == '&') {
                    int[] iArrE = s.e('\"', true);
                    O o2 = s.k;
                    if (iArrE != null) {
                        o2.o(iArrE);
                        return;
                    } else {
                        o2.m('&');
                        return;
                    }
                }
                if (cF != 65535) {
                    o = s.k;
                } else {
                    s.q(this);
                    i1Var = i1.b;
                }
            }
            s.v(i1Var);
            return;
        }
        s.r(this);
        o = s.k;
        cF = 65533;
        o.m(cF);
    }
}
