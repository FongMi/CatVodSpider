package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class c1 extends i1 {
    c1() {
        super("BogusDoctype", 65, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        C0980d0 c0980d0 = i1.b;
        char cF = c0973a.f();
        if (cF == '>' || cF == 65535) {
            s.o();
            s.v(c0980d0);
        }
    }
}
