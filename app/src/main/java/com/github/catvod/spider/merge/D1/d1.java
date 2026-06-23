package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class d1 extends i1 {
    d1() {
        super("CdataSection", 66, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        s.h.append(c0973a.o());
        if (c0973a.C("]]>") || c0973a.w()) {
            s.k(new H(s.h.toString()));
            s.v(i1.b);
        }
    }
}
