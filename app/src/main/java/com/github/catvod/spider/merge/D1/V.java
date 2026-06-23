package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class V extends i1 {
    V() {
        super("RCDATAEndTagOpen", 11, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        if (!c0973a.H()) {
            s.l("</");
            s.v(i1.d);
        } else {
            s.h(false);
            s.k.p(c0973a.u());
            s.h.append(c0973a.u());
            s.a(i1.n);
        }
    }
}
