package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0265y0 extends j1 {
    C0265y0() {
        super("AttributeValue_doubleQuoted", 37, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        O o;
        j1 j1Var;
        String strG = c0217a.g(false);
        if (strG.length() > 0) {
            t.k.n(strG);
        } else {
            t.k.z();
        }
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '\"') {
                j1Var = j1.O;
            } else {
                if (cF == '&') {
                    int[] iArrE = t.e('\"', true);
                    O o2 = t.k;
                    if (iArrE != null) {
                        o2.o(iArrE);
                        return;
                    } else {
                        o2.m('&');
                        return;
                    }
                }
                if (cF != 65535) {
                    o = t.k;
                } else {
                    t.q(this);
                    j1Var = j1.a;
                }
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        o = t.k;
        cF = 65533;
        o.m(cF);
    }
}
